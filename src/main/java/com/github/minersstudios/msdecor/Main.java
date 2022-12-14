package com.github.minersstudios.msdecor;

import com.github.minersstudios.msdecor.listeners.RegEvents;
import com.github.minersstudios.msdecor.utils.ChatUtils;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

import java.util.logging.Level;

public final class Main extends JavaPlugin {
    private static Main instance;
    private static CoreProtectAPI coreProtectAPI = new CoreProtectAPI();

    @Override
    public void onEnable() {
        long time = System.currentTimeMillis();
        this.load();
        if (this.isEnabled()) {
            ChatUtils.log(Level.INFO, ChatColor.GREEN + "Enabled in " + (System.currentTimeMillis() - time) + "ms");
        }
    }

    private void load() {
        instance = this;
        coreProtectAPI = getCoreProtect();
        if (coreProtectAPI != null) {
            coreProtectAPI.testAPI();
        }
        CustomDecorUtils.registerCustomDecors();
        RegEvents.init();
    }

    private @Nullable CoreProtectAPI getCoreProtect() {
        Plugin coreProtect = getServer().getPluginManager().getPlugin("CoreProtect");
        if (coreProtect == null) return null;
        CoreProtectAPI api = ((CoreProtect)coreProtect).getAPI();
        return !api.isEnabled() || api.APIVersion() < 9 ? null : api;
    }

    public static Main getInstance() {
        return instance;
    }

    public static CoreProtectAPI getCoreProtectAPI() {
        return coreProtectAPI;
    }
}
