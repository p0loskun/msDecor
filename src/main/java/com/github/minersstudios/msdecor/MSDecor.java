package com.github.minersstudios.msdecor;

import com.github.minersstudios.mscore.MSPlugin;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

public final class MSDecor extends MSPlugin {
    private static MSDecor instance;
    private static CoreProtectAPI coreProtectAPI = new CoreProtectAPI();

    @Override
    public void enable() {
        instance = this;

        coreProtectAPI = getCoreProtect();
        if (coreProtectAPI != null) {
            coreProtectAPI.testAPI();
        }

        CustomDecorUtils.registerCustomDecors();
    }

    private @Nullable CoreProtectAPI getCoreProtect() {
        Plugin coreProtect = getServer().getPluginManager().getPlugin("CoreProtect");
        if (coreProtect == null) return null;
        CoreProtectAPI api = ((CoreProtect)coreProtect).getAPI();
        return !api.isEnabled() || api.APIVersion() < 9 ? null : api;
    }

    public static MSDecor getInstance() {
        return instance;
    }

    public static CoreProtectAPI getCoreProtectAPI() {
        return coreProtectAPI;
    }
}
