package github.minersStudios.msDecor.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;

import javax.annotation.Nonnull;

public class PlaySwingAnimation {

    /**
     * Swings player hand
     *
     * @param player player who will swing hand
     * @param equipmentSlot equipment slot that checks which hand will swing
     */
    public PlaySwingAnimation(@Nonnull Player player, @Nonnull EquipmentSlot equipmentSlot) {
        if (equipmentSlot == EquipmentSlot.HAND) {
            player.swingMainHand();
        } else {
            player.swingOffHand();
        }
    }
}