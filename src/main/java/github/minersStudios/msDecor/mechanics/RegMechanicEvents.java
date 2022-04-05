package github.minersStudios.msDecor.mechanics;

import org.bukkit.plugin.PluginManager;

import static github.minersStudios.msDecor.Main.plugin;

public class RegMechanicEvents {
    /**
     * Registers custom mechanic events
     */
    public RegMechanicEvents(){
        PluginManager pluginManager = plugin.getServer().getPluginManager();

        pluginManager.registerEvents(new Lamps(), plugin);
    }
}
