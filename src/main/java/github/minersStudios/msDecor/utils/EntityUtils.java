package github.minersStudios.msDecor.utils;

import org.bukkit.Location;
import org.bukkit.Rotation;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;

public class EntityUtils {
    private float playerRotation;

    /**
     * Rotates armor stand by player yaw
     *
     * @param armorStand armor stand entity used for rotate
     * @param player player used for rotate armor stand
     */
    public void rotateArmorStandByPlayer(@Nonnull ArmorStand armorStand, @Nonnull Player player){
        Location armorStandLocation = armorStand.getLocation();
        playerRotation = player.getLocation().getYaw();
        if (playerRotation >= 25 && playerRotation <= 64 && playerRotation != 45)
            armorStandLocation.setYaw(45);
        else if (playerRotation >= 65 && playerRotation <= 119 && playerRotation != 90)
            armorStandLocation.setYaw(90);
        else if (playerRotation >= 120 && playerRotation <= 139 && playerRotation != 135)
            armorStandLocation.setYaw(135);
        else if (playerRotation >= 140 && playerRotation <= 180 && playerRotation != 180)
            armorStandLocation.setYaw(180);
        else if (playerRotation >= -26 && playerRotation <= 24 && playerRotation != 0)
            armorStandLocation.setYaw(0);
        else if (playerRotation <= -25 && playerRotation >= -64 && playerRotation != -45)
            armorStandLocation.setYaw(-45);
        else if (playerRotation <= -65 && playerRotation >= -119 && playerRotation != -90)
            armorStandLocation.setYaw(-90);
        else if (playerRotation <= -120 && playerRotation >= -150 && playerRotation != -135)
            armorStandLocation.setYaw(-135);
        else if (playerRotation <= -151 && playerRotation >= -179)
            armorStandLocation.setYaw(-180);
        armorStand.teleport(armorStandLocation);
    }

    /**
     * Rotates item frame item by player yaw
     *
     * @param itemFrame item frame entity used for rotate item
     * @param player player used for rotate item frame item
     */
    public void rotateItemFrameByPlayer(@Nonnull ItemFrame itemFrame, @Nonnull Player player){
        playerRotation = player.getLocation().getYaw();
        if (playerRotation >= 25 && playerRotation <= 64 && playerRotation != 45)
            itemFrame.setRotation(Rotation.CLOCKWISE_45);
        else if (playerRotation >= 65 && playerRotation <= 119 && playerRotation != 90)
            itemFrame.setRotation(Rotation.CLOCKWISE);
        else if (playerRotation >= 120 && playerRotation <= 139 && playerRotation != 135)
            itemFrame.setRotation(Rotation.CLOCKWISE_135);
        else if (playerRotation >= 140 && playerRotation <= 180 && playerRotation != 180)
            itemFrame.setRotation(Rotation.FLIPPED);
        else if (playerRotation >= -26 && playerRotation <= 24 && playerRotation != 0)
            itemFrame.setRotation(Rotation.NONE);
        else if (playerRotation <= -25 && playerRotation >= -64 && playerRotation != -45)
            itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE_45);
        else if (playerRotation <= -65 && playerRotation >= -119 && playerRotation != -90)
            itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE);
        else if (playerRotation <= -120 && playerRotation >= -150 && playerRotation != -135)
            itemFrame.setRotation(Rotation.FLIPPED_45);
        else if (playerRotation <= -151 && playerRotation >= -179)
            itemFrame.setRotation(Rotation.FLIPPED);
    }
}
