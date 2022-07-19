package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.objects.CustomDecor;
import github.minersStudios.msUtils.classes.SitPlayer;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class PlayerInteractListener implements Listener {

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onPlayerInteract(@Nonnull PlayerInteractEvent event) {
        if(event.getClickedBlock() == null) return;
        Player player = event.getPlayer();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        Block clickedBlock = event.getClickedBlock(),
                blockAtFace = clickedBlock.getRelative(event.getBlockFace());
        if (
                event.getAction() == Action.RIGHT_CLICK_BLOCK
                && itemInMainHand.getType() == Material.LEATHER_HORSE_ARMOR
                && event.getHand() == EquipmentSlot.HAND
                && player.getGameMode() != GameMode.ADVENTURE
                && player.getGameMode() != GameMode.SPECTATOR
                && (!clickedBlock.getType().isInteractable() || (player.isSneaking() && clickedBlock.getType().isInteractable()) || clickedBlock.getType() == Material.NOTE_BLOCK)
                && CustomDecorMaterial.REPLACE.contains(clickedBlock.getRelative(event.getBlockFace()).getType())
        ) {
            Block replaceableBlock = CustomDecorMaterial.REPLACE.contains(clickedBlock.getType()) ? clickedBlock : clickedBlock.getRelative(event.getBlockFace());
            if (
                    replaceableBlock.getType() == Material.TALL_GRASS && replaceableBlock.getLocation().clone().subtract(0.0d, 1.0d, 0.0d).getBlock().getType() == Material.TALL_GRASS
                    || replaceableBlock.getType() == Material.TALL_SEAGRASS && replaceableBlock.getLocation().clone().subtract(0.0d, 1.0d, 0.0d).getBlock().getType() == Material.TALL_SEAGRASS
            ) {
                replaceableBlock.getLocation().clone().subtract(0.0d, 1.0d, 0.0d).getBlock().breakNaturally();
            }

            if (itemInMainHand.getItemMeta() == null || !itemInMainHand.getItemMeta().hasCustomModelData()) return;
            CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByItem(itemInMainHand.getItemMeta(), false);
            if (customDecorMaterial == null || (clickedBlock.getType() == Material.BARRIER && !player.isSneaking() && customDecorMaterial.getHeight() != null)) return;
            for (Entity nearbyEntity : player.getWorld().getNearbyEntities(replaceableBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d))
                if (!(nearbyEntity instanceof Item) && (customDecorMaterial.getHitBox().isSolidHitBox() || nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame)) return;
            CustomDecor customDecor = new CustomDecor(replaceableBlock, player);
            if (
                    customDecorMaterial.getFacing() == null || event.getBlockFace() != BlockFace.DOWN
                    && replaceableBlock.getLocation().add(0.5d, -1.0d, 0.5d).getBlock().getType().isSolid()
                    && customDecorMaterial.getFacing() == CustomDecorMaterial.Facing.FLOOR
            ) {
                customDecor.setCustomDecor(customDecorMaterial, BlockFace.UP);
            } else if (
                    event.getBlockFace() != BlockFace.UP
                    && replaceableBlock.getLocation().add(0.5d, 1.0d, 0.5d).getBlock().getType().isSolid()
                    && customDecorMaterial.getFacing() == CustomDecorMaterial.Facing.CEILING
            ) {
                customDecor.setCustomDecor(customDecorMaterial, BlockFace.DOWN);
            } else if (
                    event.getBlockFace() != BlockFace.UP
                    && event.getBlockFace() != BlockFace.DOWN
                    && customDecorMaterial.getFacing() == CustomDecorMaterial.Facing.WALL
            ) {
                customDecor.setCustomDecor(customDecorMaterial, event.getBlockFace());
            }
        } else if (
                event.getAction() == Action.LEFT_CLICK_BLOCK
                && CustomDecorMaterial.CUSTOM_BLOCK_MATERIALS.contains(clickedBlock.getType())
                && (player.isSneaking() && player.getGameMode() == GameMode.SURVIVAL
                || player.getGameMode() == GameMode.SURVIVAL && clickedBlock.getType() == Material.STRUCTURE_VOID
                || player.getGameMode() == GameMode.CREATIVE)
        ) {
            CustomDecor customDecor = new CustomDecor(clickedBlock, player);
            customDecor.breakCustomDecor();
        } else if (
                event.getAction() == Action.RIGHT_CLICK_BLOCK
                && (!itemInMainHand.getType().isBlock() || itemInMainHand.getType() == Material.AIR)
                && event.getHand() == EquipmentSlot.HAND
                && player.getGameMode() != GameMode.SPECTATOR
                && clickedBlock.getType() == Material.BARRIER
        ) {
            for (Entity nearbyEntity : player.getWorld().getNearbyEntities(clickedBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
                if (nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame) {
                    CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(nearbyEntity, false);
                    if (customDecorMaterial != null && customDecorMaterial.getHeight() != null) {
                        new SitPlayer(player).setSitting(clickedBlock.getLocation().clone().add(0.5d, customDecorMaterial.getHeight(), 0.5d));
                        player.swingMainHand();
                    }
                }
            }
        }

        if (event.getAction() == Action.RIGHT_CLICK_BLOCK && (blockAtFace.getType() == Material.STRUCTURE_VOID || blockAtFace.getType() == Material.LIGHT)) {
            event.setCancelled(true);
        }
    }
}
