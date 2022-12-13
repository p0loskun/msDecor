package com.github.minersstudios.msdecor.listeners.inventory;

import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import com.github.minersstudios.msdecor.utils.PlayerUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import javax.annotation.Nonnull;

public class InventoryClickListener implements Listener {

	@EventHandler
	public void onInventoryClick(@Nonnull InventoryClickEvent event) {
		ItemStack cursor = event.getCursor(),
				currentItem = event.getCurrentItem();
		event.setCancelled(
				event.getInventory() instanceof HorseInventory
				&& (cursor != null
				&& !(event.getClickedInventory() instanceof PlayerInventory)
				&& cursor.getItemMeta() != null
				&& cursor.getItemMeta().hasCustomModelData()
				&& PlayerUtils.isItemCustomDecor(cursor)
				&& CustomDecorUtils.getCustomDecorDataByItem(cursor) != null
				|| event.getClick().isShiftClick()
				&& currentItem != null
				&& currentItem.getItemMeta() != null
				&& currentItem.getItemMeta().hasCustomModelData()
				&& PlayerUtils.isItemCustomDecor(currentItem)
				&& CustomDecorUtils.getCustomDecorDataByItem(currentItem) != null)
		);
	}
}
