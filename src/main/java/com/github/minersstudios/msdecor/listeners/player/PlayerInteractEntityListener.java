package com.github.minersstudios.msdecor.listeners.player;

import com.github.minersstudios.msdecor.utils.EntityUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerInteractEntityListener implements Listener {

	@EventHandler
	public void onPlayerInteractEntity(@NotNull PlayerInteractEntityEvent event) {
		event.setCancelled(EntityUtils.isCustomDecorEntity(event.getRightClicked()));
	}
}
