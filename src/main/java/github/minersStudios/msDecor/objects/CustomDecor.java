package github.minersStudios.msDecor.objects;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.utils.EntityUtils;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static github.minersStudios.msDecor.Main.coreProtectAPI;

public class CustomDecor {
    private final Block block;
    private final Player player;
    private ItemStack itemInMainHand;
    @Nullable private CustomDecorMaterial customDecorMaterial;

    public CustomDecor(@Nonnull Block block, @Nullable Player player) {
        this.block = block;
        this.player = player;
    }

    /**
     * Sets custom decor
     *
     * @param customDecorMaterial custom decor that will be placed
     * @param blockFace block face on which the frame is to be spawned
     */
    public void setCustomDecor(@Nonnull CustomDecorMaterial customDecorMaterial, @Nonnull BlockFace blockFace) {
        if (this.player == null) return;
        this.customDecorMaterial = customDecorMaterial;
        this.itemInMainHand = this.player.getInventory().getItemInMainHand();
        if (customDecorMaterial.getHitBox().isArmorStand()) {
            this.summonArmorStand();
        } else {
            this.summonItemFrame(blockFace);
        }
        this.setHitBox();
        this.player.swingMainHand();
        if (customDecorMaterial.getPlaceSound() != null)
            this.block.getWorld().playSound(this.block.getLocation(), customDecorMaterial.getPlaceSound(), 1.0f, customDecorMaterial.getPitch());
        this.itemInMainHand.setAmount(this.player.getGameMode() == GameMode.SURVIVAL ? this.itemInMainHand.getAmount() - 1 : this.itemInMainHand.getAmount());
        coreProtectAPI.logPlacement(this.player.getName(), this.block.getLocation(), Material.VOID_AIR, this.block.getBlockData());
    }

    /**
     * Breaks custom block vanillish
     */
    public void breakCustomDecor() {
        Location blockLocation = this.block.getLocation();
        World world = this.block.getWorld();
        for (Entity nearbyEntity : this.block.getWorld().getNearbyEntities(blockLocation.clone().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
            if (
                    nearbyEntity instanceof ItemFrame itemFrame
                    && itemFrame.getItem().getItemMeta() != null
            ) {
                this.customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(nearbyEntity, true);
                if (this.customDecorMaterial == null) return;
                itemFrame.remove();
                if (this.player == null || this.player.getGameMode() == GameMode.SURVIVAL) {
                    ItemStack itemStack = itemFrame.getItem();
                    ItemMeta itemMeta = itemStack.getItemMeta();
                    itemMeta.setDisplayName(nearbyEntity.getName());
                    itemMeta.setCustomModelData(this.customDecorMaterial.getItemCustomModelData());
                    itemStack.setItemMeta(itemMeta);
                    world.dropItemNaturally(blockLocation, itemStack);
                }
            }
        }
        if (this.customDecorMaterial == null) {
            for (Entity nearbyEntity : block.getWorld().getNearbyEntities(blockLocation.clone().add(0.5d, 0.0d, 0.5d), 0.2d, 0.3d, 0.2d)) {
                if (
                        nearbyEntity instanceof ArmorStand armorStand
                        && armorStand.getEquipment() != null
                        && armorStand.getEquipment().getHelmet() != null
                        && armorStand.getEquipment().getHelmet().getItemMeta() != null
                ) {
                    this.customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(armorStand, true);
                    if (this.customDecorMaterial == null) return;
                    armorStand.remove();
                    if (this.player == null || this.player.getGameMode() == GameMode.SURVIVAL) {
                        ItemStack itemStack = armorStand.getEquipment().getHelmet();
                        ItemMeta itemMeta = itemStack.getItemMeta();
                        itemMeta.setCustomModelData(this.customDecorMaterial.getItemCustomModelData());
                        itemStack.setItemMeta(itemMeta);
                        world.dropItemNaturally(blockLocation, itemStack);
                    }
                }
            }
        }
        if (this.customDecorMaterial == null) return;
        if (this.customDecorMaterial.getBreakSound() != null)
            world.playSound(blockLocation, this.customDecorMaterial.getBreakSound(), 1.0f, this.customDecorMaterial.getPitch());
        if (CustomDecorMaterial.CUSTOM_BLOCK_MATERIALS.contains(this.block.getType()) || this.block.getType() == Material.LIGHT)
            this.block.setType(Material.AIR);
        coreProtectAPI.logRemoval(this.player != null ? this.player.getName() : null, this.block.getLocation(), Material.VOID_AIR, this.block.getBlockData());
    }

    /**
     * Summons armor stand with custom decor item like hat
     */
    private void summonArmorStand() {
        if (this.player == null || this.customDecorMaterial == null) return;
        this.block.getWorld().spawn(this.block.getLocation().add(0.5d, 0.0d, 0.5d), ArmorStand.class, (armorStand) -> {
            assert armorStand.getEquipment() != null;
            armorStand.setGravity(false);
            armorStand.setMarker(this.customDecorMaterial.getHitBox().isSolidHitBox() || this.customDecorMaterial.getHitBox().isStructureHitBox());
            armorStand.setSmall(this.customDecorMaterial.getHitBox() == CustomDecorMaterial.HitBox.SMALL_ARMOR_STAND || this.customDecorMaterial.getHitBox() == CustomDecorMaterial.HitBox.SOLID_SMALL_ARMOR_STAND || this.customDecorMaterial.getHitBox() == CustomDecorMaterial.HitBox.STRUCTURE_SMALL_ARMOR_STAND);
            armorStand.setVisible(false);
            armorStand.setCollidable(false);
            armorStand.addScoreboardTag("customDecor");

            ItemStack itemStack = this.itemInMainHand.clone();
            ItemMeta itemMeta = itemStack.getItemMeta();
            assert itemMeta != null;
            itemMeta.setDisplayName(itemStack.getItemMeta().getDisplayName());
            itemStack.setItemMeta(itemMeta);
            armorStand.getEquipment().setHelmet(itemStack);

            EntityUtils.rotateArmorStandByPlayer(armorStand, this.player);
        });
    }

    /**
     * Summons item frame with custom decor item
     *
     * @param blockFace block face on which the frame is to be spawned
     */
    private void summonItemFrame(BlockFace blockFace) {
        if (this.player == null || this.customDecorMaterial == null || this.itemInMainHand.getItemMeta() == null) return;
        this.block.getWorld().spawn(this.block.getLocation().add(0.5d, 0.0d, 0.5d), ItemFrame.class, (itemFrame) -> {
            itemFrame.setItemDropChance(0.0f);
            itemFrame.setCustomName(this.itemInMainHand.getItemMeta().getDisplayName());
            itemFrame.setVisible(false);
            itemFrame.setSilent(true);
            itemFrame.setFixed(this.customDecorMaterial.getHitBox() != CustomDecorMaterial.HitBox.FRAME);
            itemFrame.setFacingDirection(blockFace);
            itemFrame.addScoreboardTag("customDecor");

            ItemStack itemStack = this.itemInMainHand.clone();
            ItemMeta itemMeta = itemStack.getItemMeta();
            assert itemMeta != null;
            itemMeta.setDisplayName(null);
            itemStack.setItemMeta(itemMeta);
            itemFrame.setItem(itemStack);

            if (this.customDecorMaterial.getFacing() != CustomDecorMaterial.Facing.WALL)
                EntityUtils.rotateItemFrameByPlayer(itemFrame, this.player);
        });
    }

    /**
     * Sets custom decor hitbox
     */
    private void setHitBox() {
        if (this.customDecorMaterial == null) return;
        Bukkit.getScheduler().runTask(Main.plugin, () -> {
            this.block.setType(
                    customDecorMaterial.getHitBox().isStructureHitBox() ? Material.STRUCTURE_VOID
                    : customDecorMaterial.getHitBox().isSolidHitBox() ? Material.BARRIER
                    : Material.LIGHT
            );
            if (this.block.getType() != Material.LIGHT) return;
            Levelled level = (Levelled) this.block.getBlockData();
            level.setLevel(this.customDecorMaterial.name().contains("_FIRE") ? 15 : 0);
            this.block.setBlockData(level, true);
        });
    }
}
