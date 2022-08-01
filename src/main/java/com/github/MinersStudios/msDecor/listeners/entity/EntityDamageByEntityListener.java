package com.github.MinersStudios.msDecor.listeners.entity;

import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import com.github.MinersStudios.msDecor.objects.CustomDecor;
import org.bukkit.GameMode;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import javax.annotation.Nonnull;

public class EntityDamageByEntityListener implements Listener {

	@EventHandler
	public void onEntityDamageByEntity(@Nonnull EntityDamageByEntityEvent event) {
		Entity entity = event.getEntity();
		event.setCancelled(entity.getScoreboardTags().contains("customDecor"));
		if (
				!(event.getDamager() instanceof Player player)
				|| player.getGameMode() == GameMode.ADVENTURE
				|| CustomDecorMaterial.getCustomDecorMaterialByEntity(entity, true) == null
				|| !entity.getScoreboardTags().contains("customDecor")
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
