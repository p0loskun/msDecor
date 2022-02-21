package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import javax.annotation.Nonnull;

public class BreakBlockListener implements Listener {
    @EventHandler
    public void onPlayerBlockBreaking(@Nonnull BlockBreakEvent event){
        Block block = event.getBlock();
        if(BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(event.getBlock().getType())) {
            for (Entity nearbyEntity : block.getWorld().getNearbyEntities(block.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)){
                event.setCancelled((nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame) && nearbyEntity.getScoreboardTags().contains("customDecor"));
            }
        }
    }

    @EventHandler
    public void onPlayerBlockBreakingByPlacingBlock(@Nonnull BlockPlaceEvent event) {
        Block replaceableBlock = event.getBlockPlaced();
        for (Entity nearbyEntity : replaceableBlock.getWorld().getNearbyEntities(replaceableBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
            if((nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame) && nearbyEntity.getScoreboardTags().contains("customDecor")){
                event.setCancelled(true);
                replaceableBlock.setType(replaceableBlock.getType());
            }
        }
    }
}
