package com.github.minersstudios.msdecor.listeners.player;

import com.github.minersstudios.mscore.MSListener;
import com.github.minersstudios.msdecor.utils.BlockUtils;
import com.github.minersstudios.msdecor.utils.PlayerUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.jetbrains.annotations.NotNull;

@MSListener
public class PlayerBucketEmptyListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onPlayerBucketEmpty(@NotNull PlayerBucketEmptyEvent event) {
		if (
				BlockUtils.isCustomDecorMaterial(event.getBlock().getType())
				|| PlayerUtils.isItemCustomDecor(event.getPlayer().getInventory().getItemInMainHand())
		) {
			event.setCancelled(true);
		}
	}
}
