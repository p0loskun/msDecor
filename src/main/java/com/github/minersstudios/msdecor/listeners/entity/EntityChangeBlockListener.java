package com.github.minersstudios.msdecor.listeners.entity;

import com.github.minersstudios.msdecor.utils.BlockUtils;
import org.bukkit.block.Block;
import org.bukkit.entity.FallingBlock;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class EntityChangeBlockListener implements Listener {

	@EventHandler
	public void onEntityChangeBlock(@NotNull EntityChangeBlockEvent event) {
		Block block = event.getBlock();
		if (
				!(event.getEntity() instanceof FallingBlock)
				|| !BlockUtils.isCustomDecorMaterial(block.getType())
		) return;
		event.setCancelled(true);
		block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(event.getTo()));
	}
}
