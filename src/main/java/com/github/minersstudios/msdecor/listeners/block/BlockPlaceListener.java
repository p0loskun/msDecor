package com.github.minersstudios.msdecor.listeners.block;

import com.github.minersstudios.msdecor.utils.BlockUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.jetbrains.annotations.NotNull;

public class BlockPlaceListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR)
	public void onBlockPlace(@NotNull BlockPlaceEvent event) {
		event.setCancelled(BlockUtils.isCustomDecorMaterial(event.getBlockReplacedState().getType()));
	}
}
