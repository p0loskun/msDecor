package github.minersStudios.msDecor.listeners.block;

import github.minersStudios.msDecor.Main;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

import javax.annotation.Nonnull;

public class ExplosionListener implements Listener {

    @EventHandler
    public void onEntityExplode(@Nonnull EntityExplodeEvent event) {
        for(Block block : event.blockList()){
            if(block.getType() != Material.STRUCTURE_VOID) return;
            Main.coreProtectAPI.logRemoval("#tnt", block.getLocation(), Material.VOID_AIR, block.getBlockData());
            event.blockList().remove(block);
        }
    }

    @EventHandler
    public void onBlockExplode(@Nonnull BlockExplodeEvent event) {
        for(Block block : event.blockList()){
            if(block.getType() != Material.STRUCTURE_VOID) return;
            Main.coreProtectAPI.logRemoval("#tnt", block.getLocation(), Material.VOID_AIR, block.getBlockData());
            event.blockList().remove(block);
        }
    }
}
