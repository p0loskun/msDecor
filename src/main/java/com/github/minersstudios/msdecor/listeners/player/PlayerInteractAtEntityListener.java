package com.github.minersstudios.msdecor.listeners.player;

import com.github.minersstudios.msdecor.utils.EntityUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerInteractAtEntityListener implements Listener {

	@EventHandler
	public void onPlayerInteractAtEntity(@NotNull PlayerInteractAtEntityEvent event) {
		event.setCancelled(EntityUtils.isCustomDecorEntity(event.getRightClicked()));
	}
}
