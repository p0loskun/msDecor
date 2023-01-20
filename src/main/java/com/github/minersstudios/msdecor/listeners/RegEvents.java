package com.github.minersstudios.msdecor.listeners;

import com.github.minersstudios.msdecor.Main;
import com.github.minersstudios.msdecor.listeners.block.BlockBreakListener;
import com.github.minersstudios.msdecor.listeners.block.BlockPlaceListener;
import com.github.minersstudios.msdecor.listeners.entity.EntityChangeBlockListener;
import com.github.minersstudios.msdecor.listeners.entity.EntityDamageByEntityListener;
import com.github.minersstudios.msdecor.listeners.entity.HangingBreakListener;
import com.github.minersstudios.msdecor.listeners.inventory.InventoryClickListener;
import com.github.minersstudios.msdecor.listeners.inventory.InventoryCreativeListener;
import com.github.minersstudios.msdecor.listeners.inventory.InventoryDragListener;
import com.github.minersstudios.msdecor.listeners.mechanic.*;
import com.github.minersstudios.msdecor.listeners.player.*;
import org.bukkit.plugin.PluginManager;

public final class RegEvents {

	private RegEvents() {
		throw new IllegalStateException();
	}

	public static void init() {
		PluginManager pluginManager = Main.getInstance().getServer().getPluginManager();

		pluginManager.registerEvents(new BlockBreakListener(), Main.getInstance());
		pluginManager.registerEvents(new BlockPlaceListener(), Main.getInstance());

		pluginManager.registerEvents(new EntityChangeBlockListener(), Main.getInstance());
		pluginManager.registerEvents(new EntityDamageByEntityListener(), Main.getInstance());
		pluginManager.registerEvents(new HangingBreakListener(), Main.getInstance());

		pluginManager.registerEvents(new InventoryClickListener(), Main.getInstance());
		pluginManager.registerEvents(new InventoryCreativeListener(), Main.getInstance());
		pluginManager.registerEvents(new InventoryDragListener(), Main.getInstance());

		pluginManager.registerEvents(new PlayerInteractAtEntityListener(), Main.getInstance());
		pluginManager.registerEvents(new PlayerInteractEntityListener(), Main.getInstance());
		pluginManager.registerEvents(new PlayerInteractListener(), Main.getInstance());

		pluginManager.registerEvents(new PoopMechanic(), Main.getInstance());
		pluginManager.registerEvents(new SittableMechanic(), Main.getInstance());
		pluginManager.registerEvents(new BrazierMechanic(), Main.getInstance());
		pluginManager.registerEvents(new LampsMechanic(), Main.getInstance());
		pluginManager.registerEvents(new TrashcanMechanic(), Main.getInstance());
	}
}
