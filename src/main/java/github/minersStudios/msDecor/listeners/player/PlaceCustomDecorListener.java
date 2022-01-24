package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorFacing;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.objects.CustomDecor;
import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

public class PlaceCustomDecorListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        assert event.getClickedBlock() != null;
        if (
                event.getAction() != Action.RIGHT_CLICK_BLOCK
                || event.getPlayer().getInventory().getItemInMainHand().getType() != Material.LEATHER_HORSE_ARMOR
                || event.getHand() != EquipmentSlot.HAND
                || event.getPlayer().getGameMode() == GameMode.ADVENTURE
        ) return;
        Block replaceableBlock = BlockUtils.REPLACE.contains(event.getClickedBlock().getType()) ? event.getClickedBlock() : event.getClickedBlock().getRelative(event.getBlockFace());
        Player player = event.getPlayer();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        if (itemInMainHand.getItemMeta() == null || !itemInMainHand.getItemMeta().hasCustomModelData()) return;
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByItem(itemInMainHand.getItemMeta());
        if(customDecorMaterial == null) return;
        for (Entity nearbyEntity : replaceableBlock.getWorld().getNearbyEntities(replaceableBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d))
            if (!(nearbyEntity instanceof Item) && (customDecorMaterial.getHitBox().isSolidHitBox() || nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame)) return;

        CustomDecor customDecor = new CustomDecor(replaceableBlock, player);
        if(customDecorMaterial.getFacing() == null || event.getBlockFace() != BlockFace.DOWN && replaceableBlock.getLocation().add(0.5d, -1.0d, 0.5d).getBlock().getType().isSolid() && customDecorMaterial.getFacing() == CustomDecorFacing.FLOOR){
            customDecor.setCustomDecor(customDecorMaterial, BlockFace.UP);
        } else if(event.getBlockFace() != BlockFace.UP && replaceableBlock.getLocation().add(0.5d, 1.0d, 0.5d).getBlock().getType().isSolid() && customDecorMaterial.getFacing() == CustomDecorFacing.CEILING){
            customDecor.setCustomDecor(customDecorMaterial, BlockFace.DOWN);
        } else if(event.getBlockFace() != BlockFace.UP && event.getBlockFace() != BlockFace.DOWN && customDecorMaterial.getFacing() == CustomDecorFacing.WALL){
            customDecor.setCustomDecor(customDecorMaterial, event.getBlockFace());
        }
    }
}
