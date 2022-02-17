package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import javax.annotation.Nonnull;

public class BreakBlockListener implements Listener {
    @EventHandler
    public void onPlayerBlockBreaking(@Nonnull BlockBreakEvent event){
        Block block = event.getBlock();
        if(!BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(event.getBlock().getType())) return;
        for (Entity nearbyEntity : block.getWorld().getNearbyEntities(block.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)){
            event.setCancelled((nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame) && nearbyEntity.getScoreboardTags().contains("customDecor"));
        }
    }

    @EventHandler
    public void onPlayerBlockBreakingByPlacingBlock(@Nonnull PlayerInteractEvent event) {
        if (!event.getPlayer().getInventory().getItemInMainHand().getType().isBlock() || event.getClickedBlock() == null) return;
        Block replaceableBlock = BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(event.getClickedBlock().getType()) ? event.getClickedBlock() : event.getClickedBlock().getRelative(event.getBlockFace());
        for (Entity nearbyEntity : replaceableBlock.getWorld().getNearbyEntities(replaceableBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
            event.setCancelled((nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame) && nearbyEntity.getScoreboardTags().contains("customDecor"));
            replaceableBlock.setType(replaceableBlock.getType());
        }
    }
}
