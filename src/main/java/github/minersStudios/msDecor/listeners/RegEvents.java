package github.minersStudios.msDecor.listeners;

import github.minersStudios.msDecor.listeners.block.*;
import github.minersStudios.msDecor.listeners.player.*;
import org.bukkit.plugin.PluginManager;

import static github.minersStudios.msDecor.Main.plugin;

public class RegEvents {
    /**
     * Registers default events
     */
    public RegEvents(){
        PluginManager pluginManager = plugin.getServer().getPluginManager();

        pluginManager.registerEvents(new ExplosionListener(), plugin);
        pluginManager.registerEvents(new BreakCustomDecorListener(), plugin);
        pluginManager.registerEvents(new BreakBlockListener(), plugin);
        pluginManager.registerEvents(new PlaceCustomDecorListener(), plugin);
        pluginManager.registerEvents(new ItemFrameInteractListener(), plugin);
        pluginManager.registerEvents(new ArmorStandInteractListener(), plugin);
        pluginManager.registerEvents(new HorseArmorListener(), plugin);
        pluginManager.registerEvents(new CreativeCopyBlockListener(), plugin);
    }
}
