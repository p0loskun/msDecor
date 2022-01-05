package github.minersStudios.msDecor.objects;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enumerators.CustomDecorMaterial;
import github.minersStudios.msDecor.enumerators.HitBox;
import github.minersStudios.msDecor.utils.PlaySwingAnimation;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import javax.annotation.Nonnull;

import static github.minersStudios.msDecor.Main.coreProtectAPI;

public class CustomDecor {
    private final Block block;
    private final Player player;
    private CustomDecorMaterial customDecorMaterial;

    public CustomDecor(@Nonnull Block block, @Nonnull Player player){
        this.block = block;
        this.player = player;
    }

    private void setCustomDecorMaterial(CustomDecorMaterial customDecorMaterial){
        this.customDecorMaterial = customDecorMaterial;
    }

    /**
     * Sets custom decor
     */
    public void setCustomDecor(@Nonnull CustomDecorMaterial customDecorMaterial, Player player) {
        assert player.getInventory().getItemInMainHand().getItemMeta() != null;
        if(customDecorMaterial.getHitBox().isArmorStand()) {
            block.getWorld().spawn(block.getLocation().add(0.5d, 0.0d, 0.5d), ArmorStand.class, (armorStand) -> {
                assert armorStand.getEquipment() != null;
                armorStand.setGravity(false);
                armorStand.setMarker(customDecorMaterial.getHitBox().isSolidHitBox());
                armorStand.setSmall(customDecorMaterial.getHitBox() == HitBox.SMALL_ARMOR_STAND || customDecorMaterial.getHitBox() == HitBox.SOLID_SMALL_ARMOR_STAND);
                armorStand.setVisible(false);
                armorStand.setCollidable(false);

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                ItemMeta itemMeta = itemStack.getItemMeta();
                assert itemMeta != null;
                itemMeta.setDisplayName(itemStack.getItemMeta().getDisplayName());
                itemStack.setItemMeta(itemMeta);
                armorStand.getEquipment().setHelmet(itemStack);

                // Starts ShitCode
                if (customDecorMaterial.isDegreesDefault()) {
                    if (player.getLocation().getYaw() >= 25 && player.getLocation().getYaw() <= 64 && player.getLocation().getYaw() != 45) {
                        Location location45 = armorStand.getLocation();
                        location45.setYaw(45);
                        armorStand.teleport(location45);
                    }
                    if (player.getLocation().getYaw() >= 65 && player.getLocation().getYaw() <= 119 && player.getLocation().getYaw() != 90) {
                        Location location90 = armorStand.getLocation();
                        location90.setYaw(90);
                        armorStand.teleport(location90);
                    }
                    if (player.getLocation().getYaw() >= 120 && player.getLocation().getYaw() <= 139 && player.getLocation().getYaw() != 135) {
                        Location location135 = armorStand.getLocation();
                        location135.setYaw(135);
                        armorStand.teleport(location135);
                    }
                    if (player.getLocation().getYaw() >= 140 && player.getLocation().getYaw() <= 180 && player.getLocation().getYaw() != 180) {
                        Location location180 = armorStand.getLocation();
                        location180.setYaw(180);
                        armorStand.teleport(location180);
                    }
                    if (player.getLocation().getYaw() >= -26 && player.getLocation().getYaw() <= 24 && player.getLocation().getYaw() != 0 && player.getLocation().getYaw() != -180) {
                        Location location0 = armorStand.getLocation();
                        location0.setYaw(0);
                        armorStand.teleport(location0);
                    }
                    if (player.getLocation().getYaw() <= -25 && player.getLocation().getYaw() >= -64 && player.getLocation().getYaw() != -45) {
                        Location location45 = armorStand.getLocation();
                        location45.setYaw(-45);
                        armorStand.teleport(location45);
                    }
                    if (player.getLocation().getYaw() <= -65 && player.getLocation().getYaw() >= -119 && player.getLocation().getYaw() != -90) {
                        Location location90 = armorStand.getLocation();
                        location90.setYaw(-90);
                        armorStand.teleport(location90);
                    }
                    if (player.getLocation().getYaw() <= -120 && player.getLocation().getYaw() >= -150 && player.getLocation().getYaw() != -135) {
                        Location location135 = armorStand.getLocation();
                        location135.setYaw(-135);
                        armorStand.teleport(location135);
                    }
                    if (player.getLocation().getYaw() <= -151 && player.getLocation().getYaw() >= -179 && player.getLocation().getYaw() != -180 && player.getLocation().getYaw() != 0) {
                        Location location180 = armorStand.getLocation();
                        location180.setYaw(-180);
                        armorStand.teleport(location180);
                    }
                } else {
                    if (player.getLocation().getYaw() >= 25 && player.getLocation().getYaw() <= 64 && player.getLocation().getYaw() != 45) {
                        Location location45 = armorStand.getLocation();
                        location45.setYaw(90);
                        armorStand.teleport(location45);
                    }
                    if (player.getLocation().getYaw() >= 65 && player.getLocation().getYaw() <= 119 && player.getLocation().getYaw() != 90) {
                        Location location90 = armorStand.getLocation();
                        location90.setYaw(90);
                        armorStand.teleport(location90);
                    }
                    if (player.getLocation().getYaw() >= 120 && player.getLocation().getYaw() <= 139 && player.getLocation().getYaw() != 135) {
                        Location location135 = armorStand.getLocation();
                        location135.setYaw(180);
                        armorStand.teleport(location135);
                    }
                    if (player.getLocation().getYaw() >= 140 && player.getLocation().getYaw() <= 180 && player.getLocation().getYaw() != 180) {
                        Location location180 = armorStand.getLocation();
                        location180.setYaw(180);
                        armorStand.teleport(location180);
                    }
                    if (player.getLocation().getYaw() >= -26 && player.getLocation().getYaw() <= 24 && player.getLocation().getYaw() != 0 && player.getLocation().getYaw() != -180) {
                        Location location0 = armorStand.getLocation();
                        location0.setYaw(0);
                        armorStand.teleport(location0);
                    }
                    if (player.getLocation().getYaw() <= -25 && player.getLocation().getYaw() >= -64 && player.getLocation().getYaw() != -45) {
                        Location location45 = armorStand.getLocation();
                        location45.setYaw(-90);
                        armorStand.teleport(location45);
                    }
                    if (player.getLocation().getYaw() <= -65 && player.getLocation().getYaw() >= -119 && player.getLocation().getYaw() != -90) {
                        Location location90 = armorStand.getLocation();
                        location90.setYaw(-90);
                        armorStand.teleport(location90);
                    }
                    if (player.getLocation().getYaw() <= -120 && player.getLocation().getYaw() >= -150 && player.getLocation().getYaw() != -135) {
                        Location location135 = armorStand.getLocation();
                        location135.setYaw(-180);
                        armorStand.teleport(location135);
                    }
                    if (player.getLocation().getYaw() <= -151 && player.getLocation().getYaw() >= -179 && player.getLocation().getYaw() != -180 && player.getLocation().getYaw() != 0) {
                        Location location180 = armorStand.getLocation();
                        location180.setYaw(-180);
                        armorStand.teleport(location180);
                    }
                }
            });
        } else {
            block.getWorld().spawn(block.getLocation().add(0.5d, 0.0d, 0.5d), ItemFrame.class, (itemFrame) -> {
                itemFrame.setItemDropChance(0.0f);
                itemFrame.setCustomName(player.getInventory().getItemInMainHand().getItemMeta().getDisplayName());
                itemFrame.setVisible(false);
                itemFrame.setFixed(customDecorMaterial.getHitBox() != HitBox.FRAME);
                itemFrame.setRotation(player.getLocation().getYaw(), 0.0f);

                ItemStack itemStack = player.getInventory().getItemInMainHand();
                ItemMeta itemMeta = itemStack.getItemMeta();
                assert itemMeta != null;
                itemMeta.setDisplayName(null);
                itemStack.setItemMeta(itemMeta);
                itemFrame.setItem(itemStack);
            });
        }

        new BukkitRunnable(){
            @Override
            public void run() {
                block.setType(
                        customDecorMaterial.getHitBox().isStructureHitBox() ? Material.STRUCTURE_VOID
                        : customDecorMaterial.getHitBox().isSolidHitBox() ? Material.BARRIER
                        : !customDecorMaterial.getHitBox().isArmorStand() ? Material.LIGHT
                        : Material.AIR
                );
            }
        }.runTask(Main.plugin);

        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        new PlaySwingAnimation(player, EquipmentSlot.HAND);
        block.getWorld().playSound(block.getLocation(), customDecorMaterial.getPlaceSound(), 1.0f, customDecorMaterial.getPitch());
        itemInMainHand.setAmount(player.getGameMode() == GameMode.SURVIVAL ? itemInMainHand.getAmount() - 1 : itemInMainHand.getAmount());
        coreProtectAPI.logPlacement(player.getName(), block.getLocation(), Material.VOID_AIR, block.getBlockData());
    }

    /**
     * Break custom block vanillish
     */
    public void breakCustomDecor(){
        Location blockLocation = block.getLocation().add(0.5, 0.5, 0.5);
        World world = block.getWorld();
        for (Entity nearbyEntity : block.getWorld().getNearbyEntities(blockLocation, 0.5d, 0.5d, 0.5d)){
            assert nearbyEntity != null;
            setCustomDecorMaterial(CustomDecorMaterial.getCustomDecorMaterialByEntity(nearbyEntity));

            if(nearbyEntity instanceof ArmorStand){
                assert ((ArmorStand) nearbyEntity).getEquipment() != null;
                assert ((ArmorStand) nearbyEntity).getEquipment().getHelmet() != null;
                world.dropItemNaturally(blockLocation, ((ArmorStand) nearbyEntity).getEquipment().getHelmet());
            } else if(nearbyEntity instanceof ItemFrame) {
                ItemStack itemStack = ((ItemFrame) nearbyEntity).getItem();
                ItemMeta itemMeta = itemStack.getItemMeta();
                assert itemMeta != null;
                itemMeta.setDisplayName(nearbyEntity.getName());
                itemStack.setItemMeta(itemMeta);
                world.dropItemNaturally(blockLocation, itemStack);
            }

            world.playSound(blockLocation, customDecorMaterial.getBreakSound(), 1.0f, customDecorMaterial.getPitch());
            block.setType(Material.AIR);
            nearbyEntity.remove();
            coreProtectAPI.logRemoval(player.getName(), block.getLocation(), Material.VOID_AIR, block.getBlockData());
        }
    }
}
