package github.minersStudios.msDecor.mechanics;

import org.bukkit.plugin.PluginManager;

import static github.minersStudios.msDecor.Main.plugin;

public class RegMechanicEvents {

    public RegMechanicEvents() {
        PluginManager pluginManager = plugin.getServer().getPluginManager();

        pluginManager.registerEvents(new Lamps(), plugin);
        pluginManager.registerEvents(new Brazier(), plugin);
        pluginManager.registerEvents(new TrashCan(), plugin);
    }
}
