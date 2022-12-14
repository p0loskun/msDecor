package com.github.minersstudios.msdecor.listeners.entity;

import com.github.minersstudios.msdecor.customdecor.CustomDecor;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import com.github.minersstudios.msdecor.utils.EntityUtils;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.jetbrains.annotations.NotNull;

public class EntityDamageByEntityListener implements Listener {

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onEntityDamageByEntity(@NotNull EntityDamageByEntityEvent event) {
		Entity entity = event.getEntity();
		event.setCancelled(EntityUtils.isCustomDecorEntity(entity));
		if (
				!(event.getDamager() instanceof Player player)
				|| player.getGameMode() == GameMode.ADVENTURE
				|| CustomDecorUtils.getCustomDecorDataByEntity(entity) == null
				|| !EntityUtils.isCustomDecorEntity(entity)
		) return;
		if (
				player.isSneaking()
				&& player.getGameMode() == GameMode.SURVIVAL
				|| player.getGameMode() == GameMode.CREATIVE
		) {
			new CustomDecor(entity.getLocation().getBlock(), player).breakCustomDecor();
		}
	}
}
