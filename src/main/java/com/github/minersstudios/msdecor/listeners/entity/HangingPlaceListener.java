package com.github.minersstudios.msdecor.listeners.entity;

import com.github.minersstudios.mscore.MSListener;
import com.github.minersstudios.msdecor.utils.BlockUtils;
import com.github.minersstudios.msdecor.utils.PlayerUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.jetbrains.annotations.NotNull;

@MSListener
public class HangingPlaceListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onHangingPlace(@NotNull HangingPlaceEvent event) {
		Player player = event.getPlayer();
		if (
				BlockUtils.isCustomDecorMaterial(event.getBlock().getRelative(event.getBlockFace()).getType())
				|| (player != null
				&& PlayerUtils.isItemCustomDecor(player.getInventory().getItemInMainHand()))
		) {
			event.setCancelled(true);
		}
	}
}
