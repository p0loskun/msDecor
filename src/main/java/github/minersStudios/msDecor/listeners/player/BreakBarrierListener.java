package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BreakBarrierListener implements Listener {

    @EventHandler
    public void onPlayerBarrierBreaking(BlockBreakEvent event){
        Block block = event.getBlock();
        if(
                !BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(event.getBlock().getType())
        ) return;
        for (Entity nearbyEntity : block.getWorld().getNearbyEntities(block.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)){
            event.setCancelled((nearbyEntity instanceof ArmorStand || nearbyEntity instanceof ItemFrame) && nearbyEntity.getScoreboardTags().contains("customDecor"));
        }
    }

}
