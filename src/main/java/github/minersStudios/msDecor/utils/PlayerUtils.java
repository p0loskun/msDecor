package github.minersStudios.msDecor.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class PlayerUtils {

    /**
     * Swings hand/offhand
     *
     * @param player player
     * @param equipmentSlot hand
     */
    public static void swingHand(@Nonnull Player player, @Nonnull EquipmentSlot equipmentSlot) {
        if (equipmentSlot == EquipmentSlot.HAND) {
            player.swingMainHand();
        } else {
            player.swingOffHand();
        }
    }

    /**
     * @param itemStack item
     * @return True if item is custom block
     */
    public static boolean isItemCustomBlock(@Nonnull ItemStack itemStack) {
        return itemStack.getType() == Material.PAPER && itemStack.getItemMeta() != null && itemStack.getItemMeta().hasCustomModelData();
    }

    /**
     * @param itemStack item
     * @return True if item is custom block
     */
    public static boolean isItemCustomDecor(@Nonnull ItemStack itemStack) {
        return itemStack.getType() == Material.LEATHER_HORSE_ARMOR && itemStack.getItemMeta() != null && itemStack.getItemMeta().hasCustomModelData();
    }
}