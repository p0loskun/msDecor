package com.github.MinersStudios.msDecor.utils;

import org.bukkit.Location;
import org.bukkit.Rotation;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import java.util.TreeMap;
import java.util.NavigableMap;
import javax.annotation.Nonnull;

public class EntityUtils {

	/**
	 * Rotates armor stand by player yaw
	 *
	 * @param armorStand armor stand entity used for rotate
	 * @param player     player used for rotate armor stand
	 */
	public static void rotateArmorStandByPlayer(@Nonnull ArmorStand armorStand, @Nonnull Player player) {
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

	private static int playerDirHandler(Player player) {
		int player_yaw = (int) player.getLocation().getYaw();
		NavigableMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		// Second half (0..-180)
		map.put(-180,5);
		map.put(-135,6);
		map.put(-90,7);
		map.put(-45,8);
		// First half (0..180)
		map.put(0,0);
		map.put(45,1);
		map.put(90,2);
		map.put(135,3);
		map.put(180,4);

		return map.floorEntry(player_yaw).getValue();
	}

	/**
	 * Rotates item frame item by player yaw
	 *
	 * @param itemFrame item frame entity used for rotate item
	 * @param player    player used for rotate item frame item
	 */
	public static void rotateItemFrameByPlayer(@Nonnull ItemFrame frame, @Nonnull Player player) {
		int value = playerDirHandler(player);
		if (value == 1) {
			frame.setRotation(Rotation.CLOCKWISE_45);
			return;
		} if (value == 2) {
			frame.setRotation(Rotation.CLOCKWISE);
			return;
		} if (value == 3) {
			frame.setRotation(Rotation.CLOCKWISE_135);
			return;
		} if (value == 4) {
			frame.setRotation(Rotation.FLIPPED);
			return;
		} if (value == 5) {
			frame.setRotation(Rotation.FLIPPED_45);
			return;
		} if (value == 6) {
			frame.setRotation(Rotation.COUNTER_CLOCKWISE);
			return;
		} if (value == 7) {
			frame.setRotation(Rotation.COUNTER_CLOCKWISE_45);
			return;
		}
		frame.setRotation(Rotation.NONE);
	}
}
