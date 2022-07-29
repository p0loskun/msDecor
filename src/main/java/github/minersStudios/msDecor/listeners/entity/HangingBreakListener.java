package github.minersStudios.msDecor.listeners.entity;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakEvent;

import javax.annotation.Nonnull;

public class HangingBreakListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onHangingBreak(@Nonnull HangingBreakEvent event) {
		event.setCancelled(event.getEntity() instanceof ItemFrame itemFrame && itemFrame.getScoreboardTags().contains("customDecor"));
	}
}