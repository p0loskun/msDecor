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
        Location armorStandLocation = armorStand.getLocation();
        float playerRotation = player.getLocation().getYaw();
        if (playerRotation > 25 && playerRotation < 65) {
            armorStandLocation.setYaw(45);
        } else if (playerRotation > 65 && playerRotation < 120) {
            armorStandLocation.setYaw(90);
        } else if (playerRotation > 120 && playerRotation < 140) {
            armorStandLocation.setYaw(135);
        } else if (playerRotation > 140 && playerRotation < 180) {
            armorStandLocation.setYaw(180);
        } else if (playerRotation < 25 && playerRotation > -25) {
            armorStandLocation.setYaw(0);
        } else if (playerRotation < -25 && playerRotation > -65) {
            armorStandLocation.setYaw(-45);
        } else if (playerRotation < -65 && playerRotation > -120) {
            armorStandLocation.setYaw(-90);
        } else if (playerRotation < -120 && playerRotation > -150) {
            armorStandLocation.setYaw(-135);
        } else if (playerRotation < -150 && playerRotation > -180) {
            armorStandLocation.setYaw(-180);
        }
        armorStand.teleport(armorStandLocation);
    }

    /**
     * Rotates item frame item by player yaw
     *
     * @param itemFrame item frame entity used for rotate item
     * @param player player used for rotate item frame item
     */
    public void rotateItemFrameByPlayer(@Nonnull ItemFrame itemFrame, @Nonnull Player player){
        float playerRotation = player.getLocation().getYaw();
        if (playerRotation > 25 && playerRotation < 65) {
            itemFrame.setRotation(Rotation.CLOCKWISE_45);
        } else if (playerRotation > 65 && playerRotation < 120) {
            itemFrame.setRotation(Rotation.CLOCKWISE);
        } else if (playerRotation > 120 && playerRotation < 140) {
            itemFrame.setRotation(Rotation.CLOCKWISE_135);
        } else if (playerRotation > 140 && playerRotation < 180) {
            itemFrame.setRotation(Rotation.FLIPPED);
        } else if (playerRotation < 25 && playerRotation > -25) {
            itemFrame.setRotation(Rotation.NONE);
        } else if (playerRotation < -25 && playerRotation > -65) {
            itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE_45);
        } else if (playerRotation < -65 && playerRotation > -120) {
            itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE);
        } else if (playerRotation < -120 && playerRotation > -150) {
            itemFrame.setRotation(Rotation.FLIPPED_45);
        } else if (playerRotation < -150 && playerRotation > -180) {
            itemFrame.setRotation(Rotation.FLIPPED);
        }
    }
}
