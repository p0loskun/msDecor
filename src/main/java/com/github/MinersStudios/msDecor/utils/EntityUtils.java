package com.github.MinersStudios.msDecor.utils;

import org.bukkit.Location;
import org.bukkit.Rotation;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;

import javax.annotation.Nonnull;
import java.util.NavigableMap;
import java.util.TreeMap;

public class EntityUtils {

	/**
	 * Rotates armor stand by player yaw
	 *
	 * @param armorStand armor stand entity used for rotate
	 * @param player     player used for rotate armor stand
	 */
	public static void rotateArmorStandByPlayer(@Nonnull ArmorStand armorStand, @Nonnull Player player) {
		Location armorStandLocation = armorStand.getLocation();
		switch (playerDirectionHandler(player)) {
			case 1 -> armorStandLocation.setYaw(0.0f);
			case 2 -> armorStandLocation.setYaw(45.0f);
			case 3 -> armorStandLocation.setYaw(90.0f);
			case 4 -> armorStandLocation.setYaw(135.0f);
			case 5 -> armorStandLocation.setYaw(180.0f);
			case 6 -> armorStandLocation.setYaw(-135.0f);
			case 7 -> armorStandLocation.setYaw(-90.0f);
			case 8 -> armorStandLocation.setYaw(-45.0f);
		}
		armorStand.teleport(armorStandLocation);
	}

	/**
	 * Rotates item frame item by player yaw
	 *
	 * @param itemFrame item frame entity used for rotate item
	 * @param player    player used for rotate item frame item
	 */
	public static void rotateItemFrameByPlayer(@Nonnull ItemFrame itemFrame, @Nonnull Player player) {
		switch (playerDirectionHandler(player)) {
			case 1 -> itemFrame.setRotation(Rotation.NONE);
			case 2 -> itemFrame.setRotation(Rotation.CLOCKWISE_45);
			case 3 -> itemFrame.setRotation(Rotation.CLOCKWISE);
			case 4 -> itemFrame.setRotation(Rotation.CLOCKWISE_135);
			case 5 -> itemFrame.setRotation(Rotation.FLIPPED);
			case 6 -> itemFrame.setRotation(Rotation.FLIPPED_45);
			case 7 -> itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE);
			case 8 -> itemFrame.setRotation(Rotation.COUNTER_CLOCKWISE_45);
		}
	}

	private static int playerDirectionHandler(@Nonnull Player player) {
		float playerYaw = player.getLocation().getYaw();
		playerYaw = (playerYaw + 360) % 360;
		NavigableMap<Float, Integer> map = new TreeMap<>();
		map.put(0.0f,  1);
		map.put(23.0f, 2);
		map.put(68.0f, 3);
		map.put(113.0f, 4);
		map.put(158.0f, 5);
		map.put(203.0f, 6);
		map.put(248.0f, 7);
		map.put(293.0f, 8);
		map.put(338.0f, 1);
		return map.floorEntry(playerYaw).getValue();
	}
}
