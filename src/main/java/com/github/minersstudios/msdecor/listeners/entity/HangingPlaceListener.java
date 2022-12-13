package com.github.minersstudios.msdecor.listeners.entity;

import com.github.minersstudios.msdecor.customdecor.Sittable;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingPlaceEvent;

import javax.annotation.Nonnull;

public class HangingPlaceListener implements Listener {

	@EventHandler
	public void onHangingPlace(@Nonnull HangingPlaceEvent event) {
		if (event.getItemStack() == null || event.getPlayer() == null) return;
		Block clickedBlock = event.getBlock();
		for (Entity nearbyEntity : clickedBlock.getWorld().getNearbyEntities(clickedBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
			if (nearbyEntity.getScoreboardTags().contains("customDecor")) {
				if (CustomDecorUtils.getCustomDecorDataByEntity(nearbyEntity) instanceof Sittable) {
					event.setCancelled(true);
					event.getItemStack().setAmount(event.getItemStack().getAmount() + 1);
					event.getPlayer().updateInventory();
				}
			}
		}
	}
}
