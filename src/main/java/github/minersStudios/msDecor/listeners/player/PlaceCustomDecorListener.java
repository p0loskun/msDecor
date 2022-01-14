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
                || (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.PAPER && event.getPlayer().getInventory().getItemInMainHand().getType() != Material.LEATHER_HORSE_ARMOR)
                || event.getHand() != EquipmentSlot.HAND
                || event.getPlayer().getGameMode() == GameMode.ADVENTURE
        ) return;
        Block clickedBlock = event.getClickedBlock(), blockAtFace = clickedBlock.getRelative(event.getBlockFace());
        Player player = event.getPlayer();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByItem(itemInMainHand);
        if(customDecorMaterial == null) return;

        for (Entity nearbyEntity : clickedBlock.getWorld().getNearbyEntities(blockAtFace.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d))
            if (!(nearbyEntity instanceof Item) && (customDecorMaterial.getHitBox().isSolidHitBox() || nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame)) return;

        assert itemInMainHand.getItemMeta() != null;
        if (!itemInMainHand.getItemMeta().hasCustomModelData()) return;
        if(BlockUtils.REPLACE.contains(clickedBlock.getType())) blockAtFace = clickedBlock;
        CustomDecor customDecor = new CustomDecor(blockAtFace, player);
        if(customDecorMaterial.getFacing() == null || event.getBlockFace() != BlockFace.DOWN && blockAtFace.getLocation().add(0.5d, -1.0d, 0.5d).getBlock().getType().isSolid() && customDecorMaterial.getFacing() == CustomDecorFacing.FLOOR){
            customDecor.setCustomDecor(customDecorMaterial, BlockFace.UP);
        } else if(event.getBlockFace() != BlockFace.UP && blockAtFace.getLocation().add(0.5d, 1.0d, 0.5d).getBlock().getType().isSolid() && customDecorMaterial.getFacing() == CustomDecorFacing.CEILING){
            customDecor.setCustomDecor(customDecorMaterial, BlockFace.DOWN);
        } else if(event.getBlockFace() != BlockFace.UP && event.getBlockFace() != BlockFace.DOWN && customDecorMaterial.getFacing() == CustomDecorFacing.WALL){
            customDecor.setCustomDecor(customDecorMaterial, event.getBlockFace());
        }
    }
}
