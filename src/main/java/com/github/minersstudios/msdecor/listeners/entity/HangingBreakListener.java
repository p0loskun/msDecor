package com.github.minersstudios.msdecor.listeners.entity;

import com.github.minersstudios.msdecor.utils.EntityUtils;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.jetbrains.annotations.NotNull;

public class HangingBreakListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onHangingBreak(@NotNull HangingBreakEvent event) {
		event.setCancelled(event.getEntity() instanceof ItemFrame itemFrame && EntityUtils.isCustomDecorEntity(itemFrame));
	}
}
