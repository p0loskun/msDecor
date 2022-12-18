package com.github.minersstudios.msdecor.listeners.player;

import com.github.minersstudios.msdecor.customdecor.CustomDecor;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.utils.BlockUtils;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import com.github.minersstudios.msdecor.utils.PlayerUtils;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Directional;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PlayerInteractListener implements Listener {

	@EventHandler
	public void onPlayerInteract(@NotNull PlayerInteractEvent event) {
		if (event.getClickedBlock() == null || event.getHand() == null) return;
		Action action = event.getAction();
		BlockFace blockFace = event.getBlockFace();
		Block clickedBlock = event.getClickedBlock(),
				blockAtFace = clickedBlock.getRelative(blockFace),
				replaceableBlock = BlockUtils.REPLACE.contains(clickedBlock.getType()) ? clickedBlock : clickedBlock.getRelative(blockFace);
		Player player = event.getPlayer();
		GameMode gameMode = player.getGameMode();
		EquipmentSlot hand = event.getHand();
		ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
		if (PlayerUtils.isItemCustomBlock(itemInMainHand)) return;
		if (hand != EquipmentSlot.HAND && PlayerUtils.isItemCustomDecor(itemInMainHand)) {
			hand = EquipmentSlot.HAND;
		}
		ItemStack itemInHand = player.getInventory().getItem(hand);
		if (
				action == Action.RIGHT_CLICK_BLOCK
				&& PlayerUtils.isItemCustomDecor(itemInHand)
				&& (event.getHand() == EquipmentSlot.HAND || hand == EquipmentSlot.OFF_HAND)
				&& gameMode != GameMode.ADVENTURE
				&& gameMode != GameMode.SPECTATOR
				&& ((!clickedBlock.getType().isInteractable() || Tag.STAIRS.isTagged(clickedBlock.getType())) || (player.isSneaking() && clickedBlock.getType().isInteractable()) || clickedBlock.getType() == Material.NOTE_BLOCK)
				&& BlockUtils.REPLACE.contains(clickedBlock.getRelative(blockFace).getType())
		) {
			BlockUtils.removeBlock(replaceableBlock.getLocation());
			CustomDecorData customDecorData = CustomDecorUtils.getCustomDecorDataWithFace(itemInHand, blockFace);
			if (customDecorData == null) return;
			for (Entity nearbyEntity : player.getWorld().getNearbyEntities(replaceableBlock.getLocation().toCenterLocation(), 0.5d, 0.5d, 0.5d)) {
				if (
						nearbyEntity.getType() != EntityType.DROPPED_ITEM
						&& (customDecorData.getHitBox().isSolidHitBox()
						|| nearbyEntity.getType() == EntityType.ARMOR_STAND
						|| nearbyEntity.getType() == EntityType.ITEM_FRAME)
				) return;
			}
			CustomDecor customDecor = new CustomDecor(replaceableBlock, player, customDecorData);
			CustomDecorData.Facing facing = customDecorData.getFacing();
			if (
					facing == null || blockFace != BlockFace.DOWN
					&& replaceableBlock.getLocation().add(0.5d, -1.0d, 0.5d).getBlock().getType().isSolid()
					&& facing == CustomDecorData.Facing.FLOOR
			) {
				customDecor.setCustomDecor(BlockFace.UP, hand, null);
			} else if (
					blockFace != BlockFace.UP
					&& replaceableBlock.getLocation().add(0.5d, 1.0d, 0.5d).getBlock().getType().isSolid()
					&& facing == CustomDecorData.Facing.CEILING
			) {
				customDecor.setCustomDecor(BlockFace.DOWN, hand, null);
			} else if (
					blockFace != BlockFace.UP
					&& blockFace != BlockFace.DOWN
					&& facing == CustomDecorData.Facing.WALL
			) {
				customDecor.setCustomDecor(blockFace, hand, null);
			}
		} else if (
				action == Action.LEFT_CLICK_BLOCK
				&& BlockUtils.isCustomDecorMaterial(clickedBlock.getType())
				&& (player.isSneaking() && player.getGameMode() == GameMode.SURVIVAL
				|| gameMode == GameMode.SURVIVAL && clickedBlock.getType() == Material.STRUCTURE_VOID
				|| gameMode == GameMode.CREATIVE)
		) {
			CustomDecorData customDecorData = CustomDecorUtils.getCustomDecorDataByLocation(clickedBlock.getLocation().toCenterLocation());
			if (customDecorData == null) return;
			new CustomDecor(clickedBlock, player, customDecorData).breakCustomDecor();
		}

		event.setCancelled(
				action == Action.RIGHT_CLICK_BLOCK
				&& itemInHand.getType() == Material.LAVA_BUCKET
				&& BlockUtils.isCustomDecorMaterial(blockAtFace.getType())
		);

		event.setCancelled(
				action == Action.RIGHT_CLICK_BLOCK
				&& Tag.SHULKER_BOXES.isTagged(clickedBlock.getType())
				&& clickedBlock.getBlockData() instanceof Directional directional
				&& BlockUtils.isCustomDecorMaterial(clickedBlock.getRelative(directional.getFacing()).getType())
		);
	}
}
