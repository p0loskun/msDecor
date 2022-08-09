package com.github.minersstudios.msDecor.listeners.player;

import com.github.minersstudios.msDecor.utils.PlayerUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class InventoryDragListener implements Listener {

	@EventHandler
	public void onInventoryDrag(@Nonnull InventoryDragEvent event) {
		ItemStack itemStack = event.getNewItems().get(1);
		event.setCancelled(itemStack != null && PlayerUtils.isItemCustomDecor(itemStack) && event.getRawSlots().contains(1) && event.getInventory() instanceof HorseInventory);
	}
}
