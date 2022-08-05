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
		int playerYaw = (int)player.getLocation().getYaw();
		if (playerYaw<0) {playerYaw+=360;}
		NavigableMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		map.put(0,  1);
		map.put(23, 2);
		map.put(68, 3);
		map.put(113,4);
		map.put(158,5);
		map.put(203,6);
		map.put(248,7);
		map.put(293,8);
		map.put(338,1);
		return map.floorEntry(playerYaw).getValue();
	}

	/**
	 * Rotates item frame item by player yaw
	 *
	 * @param itemFrame item frame entity used for rotate item
	 * @param player    player used for rotate item frame item
	 */
	public static void rotateItemFrameByPlayer(@Nonnull ItemFrame frame, @Nonnull Player player) {
		int value = playerDirHandler(player);
		switch (value) {
			case 1 -> frame.setRotation(Rotation.NONE);
			case 2 -> frame.setRotation(Rotation.CLOCKWISE_45);
			case 3 -> frame.setRotation(Rotation.CLOCKWISE);
			case 4 -> frame.setRotation(Rotation.CLOCKWISE_135);
			case 5 -> frame.setRotation(Rotation.FLIPPED);
			case 6 -> frame.setRotation(Rotation.FLIPPED_45);
			case 7 -> frame.setRotation(Rotation.COUNTER_CLOCKWISE);
			case 8 -> frame.setRotation(Rotation.COUNTER_CLOCKWISE_45);
		}
	}
}
