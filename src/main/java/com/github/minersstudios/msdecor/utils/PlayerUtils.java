package com.github.minersstudios.msdecor.utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public final class PlayerUtils {

    private PlayerUtils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * @param itemStack item
     * @return True if item is custom block
     */
    public static boolean isItemCustomBlock(@NotNull ItemStack itemStack) {
        return itemStack.getType() == Material.PAPER
                && itemStack.getItemMeta() != null
                && itemStack.getItemMeta().hasCustomModelData();
    }

    /**
     * @param itemStack item
     * @return True if item is custom block
     */
    public static boolean isItemCustomDecor(@NotNull ItemStack itemStack) {
        return itemStack.getType() == Material.LEATHER_HORSE_ARMOR
                && itemStack.getItemMeta() != null
                && itemStack.getItemMeta().hasCustomModelData();
    }
}
