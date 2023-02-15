package com.github.minersstudios.msdecor.listeners.block;

import com.github.minersstudios.mscore.MSListener;
import com.github.minersstudios.msdecor.utils.BlockUtils;
import com.github.minersstudios.msdecor.utils.EntityUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.jetbrains.annotations.NotNull;

@MSListener
public class BlockBreakListener implements Listener {

	@EventHandler
	public void onBlockBreak(@NotNull BlockBreakEvent event) {
		Block block = event.getBlock();
		if (BlockUtils.isCustomDecorMaterial(event.getBlock().getType())) {
			for (Entity nearbyEntity : block.getWorld().getNearbyEntities(block.getLocation().toCenterLocation(), 0.5d, 0.5d, 0.5d)) {
				if (EntityUtils.isCustomDecorEntity(nearbyEntity)) {
					event.setCancelled(true);
				}
			}
		}
	}
}