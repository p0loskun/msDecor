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
			case NONE -> armorStandLocation.setYaw(0.0f);
			case CLOCKWISE_45 -> armorStandLocation.setYaw(45.0f);
			case CLOCKWISE -> armorStandLocation.setYaw(90.0f);
			case CLOCKWISE_135 -> armorStandLocation.setYaw(135.0f);
			case FLIPPED -> armorStandLocation.setYaw(180.0f);
			case FLIPPED_45 -> armorStandLocation.setYaw(-135.0f);
			case COUNTER_CLOCKWISE -> armorStandLocation.setYaw(-90.0f);
			case COUNTER_CLOCKWISE_45 -> armorStandLocation.setYaw(-45.0f);
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
		itemFrame.setRotation(playerDirectionHandler(player));
	}

	private static Rotation playerDirectionHandler(@Nonnull Player player) {
		float playerYaw = player.getLocation().getYaw();
		playerYaw = (playerYaw + 360) % 360;
		NavigableMap<Float, Rotation> map = new TreeMap<>();
		map.put(0.0f,  Rotation.NONE);
		map.put(23.0f, Rotation.CLOCKWISE_45);
		map.put(68.0f, Rotation.CLOCKWISE);
		map.put(113.0f, Rotation.CLOCKWISE_135);
		map.put(158.0f, Rotation.FLIPPED);
		map.put(203.0f, Rotation.FLIPPED_45);
		map.put(248.0f, Rotation.COUNTER_CLOCKWISE);
		map.put(293.0f, Rotation.COUNTER_CLOCKWISE_45);
		map.put(338.0f, Rotation.NONE);
		return map.floorEntry(playerYaw).getValue();
	}
}
