package com.github.minersstudios.msDecor.listeners;

import com.github.minersstudios.msDecor.Main;
import com.github.minersstudios.msDecor.listeners.block.BlockBreakListener;
import com.github.minersstudios.msDecor.listeners.entity.EntityDamageByEntityListener;
import com.github.minersstudios.msDecor.listeners.entity.HangingBreakListener;
import com.github.minersstudios.msDecor.listeners.entity.HangingPlaceListener;
import com.github.minersstudios.msDecor.listeners.mechanics.Brazier;
import com.github.minersstudios.msDecor.listeners.mechanics.Lamps;
import com.github.minersstudios.msDecor.listeners.mechanics.TrashCan;
import com.github.minersstudios.msDecor.listeners.player.*;
import org.bukkit.plugin.PluginManager;

public class RegEvents {

	public static void init() {
		PluginManager pluginManager = Main.getInstance().getServer().getPluginManager();

		pluginManager.registerEvents(new BlockBreakListener(), Main.getInstance());

		pluginManager.registerEvents(new EntityDamageByEntityListener(), Main.getInstance());
		pluginManager.registerEvents(new HangingBreakListener(), Main.getInstance());
		pluginManager.registerEvents(new HangingPlaceListener(), Main.getInstance());

		pluginManager.registerEvents(new InventoryClickListener(), Main.getInstance());
		pluginManager.registerEvents(new InventoryCreativeListener(), Main.getInstance());
		pluginManager.registerEvents(new InventoryDragListener(), Main.getInstance());
		pluginManager.registerEvents(new PlayerInteractAtEntityListener(), Main.getInstance());
		pluginManager.registerEvents(new PlayerInteractEntityListener(), Main.getInstance());
		pluginManager.registerEvents(new PlayerInteractListener(), Main.getInstance());

		pluginManager.registerEvents(new Lamps(), Main.getInstance());
		pluginManager.registerEvents(new Brazier(), Main.getInstance());
		pluginManager.registerEvents(new TrashCan(), Main.getInstance());
	}
}
