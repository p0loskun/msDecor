package github.minersStudios.msDecor.utils;

import org.bukkit.Location;
import org.bukkit.Rotation;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class EntityUtils {

    /**
     * Rotates armor stand by player yaw
     *
     * @param armorStand armor stand entity used for rotate
     * @param player player used for rotate armor stand
     */
    public void rotateArmorStandByPlayer(@Nonnull ArmorStand armorStand, @Nonnull Player player){
        Location location = armorStand.getLocation();
        if (player.getLocation().getYaw() >= 25 && player.getLocation().getYaw() <= 64 && player.getLocation().getYaw() != 45) location.setYaw(45);
        if (player.getLocation().getYaw() >= 65 && player.getLocation().getYaw() <= 119 && player.getLocation().getYaw() != 90) location.setYaw(90);
        if (player.getLocation().getYaw() >= 120 && player.getLocation().getYaw() <= 139 && player.getLocation().getYaw() != 135) location.setYaw(135);
        if (player.getLocation().getYaw() >= 140 && player.getLocation().getYaw() <= 180 && player.getLocation().getYaw() != 180) location.setYaw(180);
        if (player.getLocation().getYaw() >= -26 && player.getLocation().getYaw() <= 24 && player.getLocation().getYaw() != 0 && player.getLocation().getYaw() != -180) location.setYaw(0);
        if (player.getLocation().getYaw() <= -25 && player.getLocation().getYaw() >= -64 && player.getLocation().getYaw() != -45) location.setYaw(-45);
        if (player.getLocation().getYaw() <= -65 && player.getLocation().getYaw() >= -119 && player.getLocation().getYaw() != -90) location.setYaw(-90);
        if (player.getLocation().getYaw() <= -120 && player.getLocation().getYaw() >= -150 && player.getLocation().getYaw() != -135) location.setYaw(-135);
        if (player.getLocation().getYaw() <= -151 && player.getLocation().getYaw() >= -179 && player.getLocation().getYaw() != -180 && player.getLocation().getYaw() != 0) location.setYaw(-180);
        armorStand.teleport(location);
    }

    /**
     * Rotates item frame item by player yaw
     *
     * @param itemFrame item frame entity used for rotate item
     * @param player player used for rotate item frame item
     */
    public void rotateItemFrameByPlayer(@Nonnull ItemFrame itemFrame, @Nonnull Player player){
        if (player.getLocation().getYaw() >= 25 && player.getLocation().getYaw() <= 64 && player.getLocation().getYaw() != 45) itemFrame.setRotation(Rotation.CLOCKWISE_45);
        if (player.getLocation().getYaw() >= 65 && player.getLocation().getYaw() <= 119 && player.getLocation().getYaw() != 90) itemFrame.setRotation(Rotation.CLOCKWISE);
        if (player.getLocation().getYaw() >= 120 && player.getLocation().getYaw() <= 139 && player.getLocation().getYaw() != 135) itemFrame.setRotation(Rotation.CLOCKWISE_135);
        if (player.getLocation().getYaw() >= 140 && player.getLocation().getYaw() <= 180 && player.getLocation().getYaw() != 180) itemFrame.setRotation(Rotation.FLIPPED);
        if (player.getLocation().getYaw() >= -26 && player.getLocation().getYaw() <= 24 && player.getLocation().getYaw() != 0 && player.getLocation().getYaw() != -180) itemFrame.setRotation(Rotation.NONE);
        if (player.getLocation().getYaw() <= -25 && player.getLocation().getYaw() >= -64 && player.getLocation().getYaw() != -45) itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE_45);
        if (player.getLocation().getYaw() <= -65 && player.getLocation().getYaw() >= -119 && player.getLocation().getYaw() != -90) itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE);
        if (player.getLocation().getYaw() <= -120 && player.getLocation().getYaw() >= -150 && player.getLocation().getYaw() != -135) itemFrame.setRotation(Rotation.FLIPPED_45);
        if (player.getLocation().getYaw() <= -151 && player.getLocation().getYaw() >= -179 && player.getLocation().getYaw() != -180 && player.getLocation().getYaw() != 0) itemFrame.setRotation(Rotation.FLIPPED);
    }
}
