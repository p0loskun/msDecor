package github.minersStudios.msDecor;

import github.minersStudios.msDecor.crafts.RegCrafts;
import github.minersStudios.msDecor.listeners.RegEvents;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nullable;

public final class Main extends JavaPlugin {
    public static Main plugin;
    public static String pluginNameInLowerCase;
    public static CoreProtectAPI coreProtectAPI = new CoreProtectAPI();
    public static final boolean
            isChristmas = false,
            isHalloween = false;

    @Override
    public void onEnable() {
        plugin = this;
        coreProtectAPI = getCoreProtect();
        pluginNameInLowerCase = plugin.getName().toLowerCase();
        if (coreProtectAPI != null)
            coreProtectAPI.testAPI();
        RegEvents.init();
        RegCrafts.init();
    }

    @Nullable
    private CoreProtectAPI getCoreProtect() {
        Plugin coreProtect = getServer().getPluginManager().getPlugin("CoreProtect");
        if (coreProtect == null)
            return null;
        CoreProtectAPI coreProtectAPI = ((CoreProtect)coreProtect).getAPI();
        return !coreProtectAPI.isEnabled() || coreProtectAPI.APIVersion() < 9 ? null : coreProtectAPI;
    }
}
