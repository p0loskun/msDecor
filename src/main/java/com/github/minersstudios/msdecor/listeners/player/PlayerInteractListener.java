package com.github.minersstudios.msdecor.listeners.player;

import com.github.minersstudios.msdecor.customdecor.CustomDecor;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.Sittable;
import com.github.minersstudios.msdecor.utils.BlockUtils;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import com.github.minersstudios.msdecor.utils.PlayerUtils;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class PlayerInteractListener implements Listener {

	@EventHandler
	public void onPlayerInteract(@Nonnull PlayerInteractEvent event) {
		if (event.getClickedBlock() == null || event.getHand() == null) return;
		Block clickedBlock = event.getClickedBlock(),
				blockAtFace = clickedBlock.getRelative(event.getBlockFace()),
				replaceableBlock = BlockUtils.REPLACE.contains(clickedBlock.getType()) ? clickedBlock : clickedBlock.getRelative(event.getBlockFace());
		Player player = event.getPlayer();
		GameMode gameMode = player.getGameMode();
		EquipmentSlot hand = event.getHand();
		ItemStack itemInHand,
				itemInMainHand = player.getInventory().getItemInMainHand();
		if (PlayerUtils.isItemCustomBlock(itemInMainHand)) return;
		if (hand != EquipmentSlot.HAND && PlayerUtils.isItemCustomDecor(itemInMainHand)) {
			hand = EquipmentSlot.HAND;
		}
		itemInHand = player.getInventory().getItem(hand);
		if (
				event.getAction() == Action.RIGHT_CLICK_BLOCK
				&& PlayerUtils.isItemCustomDecor(itemInHand)
				&& (event.getHand() == EquipmentSlot.HAND || hand == EquipmentSlot.OFF_HAND)
				&& gameMode != GameMode.ADVENTURE
				&& gameMode != GameMode.SPECTATOR
				&& ((!clickedBlock.getType().isInteractable() || Tag.STAIRS.isTagged(clickedBlock.getType())) || (player.isSneaking() && clickedBlock.getType().isInteractable()) || clickedBlock.getType() == Material.NOTE_BLOCK)
				&& BlockUtils.REPLACE.contains(clickedBlock.getRelative(event.getBlockFace()).getType())
		) {
			BlockUtils.removeBlock(replaceableBlock.getLocation());
			CustomDecorData customDecorData = CustomDecorUtils.getCustomDecorDataByItem(itemInHand);
			if (customDecorData == null) return;
			for (Entity nearbyEntity : player.getWorld().getNearbyEntities(replaceableBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
				if (
						nearbyEntity.getType() != EntityType.DROPPED_ITEM
						&& (customDecorData.getHitBox().isSolidHitBox()
						|| nearbyEntity.getType() == EntityType.ARMOR_STAND
						|| nearbyEntity.getType() == EntityType.ITEM_FRAME)
				) return;
			}
			CustomDecor customDecor = new CustomDecor(replaceableBlock, player);
			if (
					customDecorData.getFacing() == null || event.getBlockFace() != BlockFace.DOWN
					&& replaceableBlock.getLocation().add(0.5d, -1.0d, 0.5d).getBlock().getType().isSolid()
					&& customDecorData.getFacing() == CustomDecorData.Facing.FLOOR
			) {
				customDecor.setCustomDecor(customDecorData, BlockFace.UP, hand, null);
			} else if (
					event.getBlockFace() != BlockFace.UP
					&& replaceableBlock.getLocation().add(0.5d, 1.0d, 0.5d).getBlock().getType().isSolid()
					&& customDecorData.getFacing() == CustomDecorData.Facing.CEILING
			) {
				customDecor.setCustomDecor(customDecorData, BlockFace.DOWN, hand, null);
			} else if (
					event.getBlockFace() != BlockFace.UP
					&& event.getBlockFace() != BlockFace.DOWN
					&& customDecorData.getFacing() == CustomDecorData.Facing.WALL
			) {
				customDecor.setCustomDecor(customDecorData, event.getBlockFace(), hand, null);
			}
		} else if (
				event.getAction() == Action.LEFT_CLICK_BLOCK
				&& BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(clickedBlock.getType())
				&& (player.isSneaking() && player.getGameMode() == GameMode.SURVIVAL
				|| gameMode == GameMode.SURVIVAL && clickedBlock.getType() == Material.STRUCTURE_VOID
				|| gameMode == GameMode.CREATIVE)
		) {
			CustomDecor customDecor = new CustomDecor(clickedBlock, player);
			customDecor.breakCustomDecor();
		} else if (
				event.getAction() == Action.RIGHT_CLICK_BLOCK
				&& !player.isSneaking()
				&& clickedBlock.getType() == Material.BARRIER
				&& (!itemInHand.getType().isBlock() || itemInHand.getType() == Material.AIR)
				&& !PlayerUtils.isItemCustomBlock(itemInHand)
				&& event.getHand() == EquipmentSlot.HAND
				&& gameMode != GameMode.SPECTATOR
				&& !clickedBlock.getRelative(BlockFace.UP).getType().isSolid()
		) {
			for (Entity nearbyEntity : player.getWorld().getNearbyEntities(clickedBlock.getLocation().clone().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
				if (nearbyEntity.getType() == EntityType.ARMOR_STAND || nearbyEntity.getType() == EntityType.ITEM_FRAME) {
					CustomDecorData customDecorData = CustomDecorUtils.getCustomDecorDataByEntity(nearbyEntity);
					if (customDecorData instanceof Sittable sittable) {
						player.swingMainHand();
						for (Entity entity : player.getWorld().getNearbyEntities(clickedBlock.getLocation().clone().add(0.5d, sittable.getHeight(), 0.5d), 0.5d, 0.5d, 0.5d)) {
							if (entity.getType() == EntityType.PLAYER) return;
						}
						com.github.minersstudios.msUtils.utils.PlayerUtils.setSitting(player, clickedBlock.getLocation().clone().add(0.5d, sittable.getHeight(), 0.5d), null);
					}
				}
			}
		}
		event.setCancelled(event.getAction() == Action.RIGHT_CLICK_BLOCK && (blockAtFace.getType() == Material.STRUCTURE_VOID || blockAtFace.getType() == Material.LIGHT));
	}
}
