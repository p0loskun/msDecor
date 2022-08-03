package com.github.MinersStudios.msDecor;

import com.github.MinersStudios.msDecor.crafts.RegCrafts;
import com.github.MinersStudios.msDecor.listeners.RegEvents;
import lombok.Getter;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nullable;

public final class Main extends JavaPlugin {
    @Getter private static Main instance;
    @Getter private static String pluginNameInLowerCase;
    @Getter private static CoreProtectAPI coreProtectAPI = new CoreProtectAPI();
    public static final boolean
            isChristmas = false,
            isHalloween = false;

    @Override
    public void onEnable() {
        instance = this;
        coreProtectAPI = getCoreProtect();
        pluginNameInLowerCase = instance.getName().toLowerCase();
        if (coreProtectAPI != null) {
            coreProtectAPI.testAPI();
        }
        RegEvents.init();
        RegCrafts.init();
    }

    @Nullable
    private CoreProtectAPI getCoreProtect() {
        Plugin coreProtect = getServer().getPluginManager().getPlugin("CoreProtect");
        if (coreProtect == null) return null;
        CoreProtectAPI coreProtectAPI = ((CoreProtect)coreProtect).getAPI();
        return !coreProtectAPI.isEnabled() || coreProtectAPI.APIVersion() < 9 ? null : coreProtectAPI;
    }
}
