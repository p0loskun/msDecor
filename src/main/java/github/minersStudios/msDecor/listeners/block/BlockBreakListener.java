package github.minersStudios.msDecor.listeners.block;

import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import javax.annotation.Nonnull;

public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreak(@Nonnull BlockBreakEvent event) {
        Block block = event.getBlock();
        if (BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(event.getBlock().getType()))
            for (Entity nearbyEntity : block.getWorld().getNearbyEntities(block.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d))
                event.setCancelled(nearbyEntity.getScoreboardTags().contains("customDecor"));
    }
}
