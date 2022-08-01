package com.github.MinersStudios.msDecor.listeners;

import com.github.MinersStudios.msDecor.listeners.block.BlockBreakListener;
import com.github.MinersStudios.msDecor.listeners.entity.EntityDamageByEntityListener;
import com.github.MinersStudios.msDecor.listeners.entity.HangingBreakListener;
import com.github.MinersStudios.msDecor.listeners.entity.HangingPlaceListener;
import com.github.MinersStudios.msDecor.listeners.mechanics.Brazier;
import com.github.MinersStudios.msDecor.listeners.mechanics.Lamps;
import com.github.MinersStudios.msDecor.listeners.mechanics.TrashCan;
import com.github.MinersStudios.msDecor.listeners.player.*;
import org.bukkit.plugin.PluginManager;

import static com.github.MinersStudios.msDecor.Main.plugin;

public class RegEvents {

	public static void init() {
		PluginManager pluginManager = plugin.getServer().getPluginManager();

		pluginManager.registerEvents(new BlockBreakListener(), plugin);

		pluginManager.registerEvents(new EntityDamageByEntityListener(), plugin);
		pluginManager.registerEvents(new HangingBreakListener(), plugin);
		pluginManager.registerEvents(new HangingPlaceListener(), plugin);

		pluginManager.registerEvents(new InventoryClickListener(), plugin);
		pluginManager.registerEvents(new InventoryCreativeListener(), plugin);
		pluginManager.registerEvents(new InventoryDragListener(), plugin);
		pluginManager.registerEvents(new PlayerInteractAtEntityListener(), plugin);
		pluginManager.registerEvents(new PlayerInteractEntityListener(), plugin);
		pluginManager.registerEvents(new PlayerInteractListener(), plugin);

		pluginManager.registerEvents(new Lamps(), plugin);
		pluginManager.registerEvents(new Brazier(), plugin);
		pluginManager.registerEvents(new TrashCan(), plugin);
	}
}
