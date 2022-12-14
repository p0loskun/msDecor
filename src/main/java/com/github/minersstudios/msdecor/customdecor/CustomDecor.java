package com.github.minersstudios.msdecor.customdecor;

import com.github.minersstudios.msdecor.Main;
import com.github.minersstudios.msdecor.utils.BlockUtils;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import com.github.minersstudios.msdecor.utils.EntityUtils;
import com.github.minersstudios.msdecor.utils.PlayerUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CustomDecor {
	private final Block block;
	private final Player player;
	private ItemStack itemInHand;
	@Nullable private CustomDecorData customDecorData;

	public CustomDecor(@NotNull Block block, @Nullable Player player) {
		this.block = block;
		this.player = player;
	}

	/**
	 * Sets custom decor
	 *
	 * @param customDecorData custom decor that will be placed
	 * @param blockFace           block face on which the frame is to be spawned
	 */
	public void setCustomDecor(@NotNull CustomDecorData customDecorData, @NotNull BlockFace blockFace, @Nullable EquipmentSlot hand, @Nullable Component customName) {
		if (this.player == null) return;
		Bukkit.getScheduler().runTask(Main.getInstance(), () -> {
			this.customDecorData = customDecorData;
			this.itemInHand = hand != null ? this.player.getInventory().getItem(hand) : customDecorData.getItemStack();
			if (customDecorData.getHitBox().isArmorStand()) {
				this.summonArmorStand(customName);
			} else {
				this.summonItemFrame(blockFace, customName);
			}
			if (hand != null) {
				this.itemInHand.setAmount(this.player.getGameMode() == GameMode.SURVIVAL ? this.itemInHand.getAmount() - 1 : this.itemInHand.getAmount());
				PlayerUtils.swingHand(player, hand);
			}
			this.setHitBox();
			this.playPlaceSound();
			Main.getCoreProtectAPI().logPlacement(this.player.getName(), this.block.getLocation(), Material.VOID_AIR, this.block.getBlockData());
		});
	}

	/**
	 * Breaks custom block vanillish
	 */
	public void breakCustomDecor() {
		Location blockLocation = this.block.getLocation();
		World world = this.block.getWorld();
		for (Entity nearbyEntity : this.block.getWorld().getNearbyEntities(blockLocation.clone().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
			if (
					nearbyEntity instanceof ItemFrame itemFrame
					&& itemFrame.getItem().getItemMeta() != null
			) {
				this.customDecorData = CustomDecorUtils.getCustomDecorDataByEntity(nearbyEntity);
				if (this.customDecorData == null) return;
				itemFrame.remove();
				if (this.player == null || this.player.getGameMode() == GameMode.SURVIVAL) {
					ItemStack itemStack = this.customDecorData.getItemStack();
					ItemMeta itemMeta = itemStack.getItemMeta();
					itemMeta.displayName(nearbyEntity.name());
					itemStack.setItemMeta(itemMeta);
					world.dropItemNaturally(blockLocation, itemStack);
				}
			}
		}
		if (this.customDecorData == null) {
			for (Entity nearbyEntity : block.getWorld().getNearbyEntities(blockLocation.clone().add(0.5d, 0.0d, 0.5d), 0.2d, 0.3d, 0.2d)) {
				if (
						nearbyEntity instanceof ArmorStand armorStand
						&& armorStand.getEquipment().getHelmet() != null
						&& armorStand.getEquipment().getHelmet().getItemMeta() != null
				) {
					this.customDecorData = CustomDecorUtils.getCustomDecorDataByEntity(armorStand);
					if (this.customDecorData == null) return;
					armorStand.remove();
					if (this.player == null || this.player.getGameMode() == GameMode.SURVIVAL) {
						world.dropItemNaturally(blockLocation, this.customDecorData.getItemStack());
					}
				}
			}
		}
		this.playBreakSound();
		if (BlockUtils.isCustomDecorMaterial(this.block.getType())) {
			this.block.setType(Material.AIR);
		}
		Main.getCoreProtectAPI().logRemoval(this.player != null ? this.player.getName() : null, this.block.getLocation(), Material.VOID_AIR, this.block.getBlockData());
	}

	private void summonArmorStand(@Nullable Component customName) {
		if (this.player == null || this.customDecorData == null) return;
		this.block.getWorld().spawn(this.block.getLocation().add(0.5d, 0.0d, 0.5d), ArmorStand.class, (armorStand) -> {
			armorStand.setGravity(false);
			armorStand.setMarker(this.customDecorData.getHitBox().isSolidHitBox() || this.customDecorData.getHitBox().isStructureHitBox());
			armorStand.setSmall(
					this.customDecorData.getHitBox() == CustomDecorData.HitBox.SMALL_ARMOR_STAND
					|| this.customDecorData.getHitBox() == CustomDecorData.HitBox.SOLID_SMALL_ARMOR_STAND
					|| this.customDecorData.getHitBox() == CustomDecorData.HitBox.STRUCTURE_SMALL_ARMOR_STAND
			);
			armorStand.setVisible(false);
			armorStand.setCollidable(false);
			armorStand.addScoreboardTag("customDecor");

			ItemStack itemStack = this.itemInHand.clone();
			ItemMeta itemMeta = itemStack.getItemMeta();
			assert itemMeta != null;
			itemMeta.displayName(customName != null ? customName : itemMeta.displayName());
			itemStack.setItemMeta(itemMeta);
			armorStand.getEquipment().setHelmet(itemStack);

			EntityUtils.rotateArmorStandByPlayer(armorStand, this.player);
		});
	}

	private void summonItemFrame(BlockFace blockFace, @Nullable Component customName) {
		if (this.player == null || this.customDecorData == null || this.itemInHand.getItemMeta() == null) return;
		this.block.getWorld().spawn(this.block.getLocation().add(0.5d, 0.0d, 0.5d), ItemFrame.class, (itemFrame) -> {
			itemFrame.setItemDropChance(0.0f);
			itemFrame.customName(customName != null ? customName : this.itemInHand.getItemMeta().displayName());
			itemFrame.setVisible(false);
			itemFrame.setSilent(true);
			itemFrame.setFixed(this.customDecorData.getHitBox() != CustomDecorData.HitBox.FRAME);
			itemFrame.setFacingDirection(blockFace, true);
			itemFrame.addScoreboardTag("customDecor");

			ItemStack itemStack = this.itemInHand.clone();
			ItemMeta itemMeta = itemStack.getItemMeta();
			assert itemMeta != null;
			itemMeta.displayName(null);
			itemStack.setItemMeta(itemMeta);
			itemFrame.setItem(itemStack);

			if (this.customDecorData.getFacing() != CustomDecorData.Facing.WALL) {
				EntityUtils.rotateItemFrameByPlayer(itemFrame, this.player);
			}
		});
	}

	private void setHitBox() {
		if (this.customDecorData == null) return;
		Bukkit.getScheduler().runTask(Main.getInstance(), () -> {
			this.block.setType(
					this.customDecorData.getHitBox().isStructureHitBox() ? Material.STRUCTURE_VOID
							: this.customDecorData.getHitBox().isSolidHitBox() ? Material.BARRIER
							: Material.LIGHT
			);
			if (this.block.getType() != Material.LIGHT) return;
			Levelled level = (Levelled) this.block.getBlockData();
			level.setLevel(this.customDecorData instanceof Lightable lightable ? lightable.getFirstLightLevel() : 0);
			this.block.setBlockData(level, true);
		});
	}

	public void playPlaceSound() {
		if (this.customDecorData == null) return;
		SoundGroup soundGroup = this.customDecorData.getSoundGroup();
		if (soundGroup == null || soundGroup.getPlaceSound() == null) return;
		this.block.getWorld().playSound(
				this.block.getLocation().toCenterLocation(),
				soundGroup.getPlaceSound(),
				soundGroup.getPlaceSoundVolume(),
				soundGroup.getPlaceSoundPitch()
		);
	}

	public void playBreakSound() {
		if (this.customDecorData == null) return;
		SoundGroup soundGroup = this.customDecorData.getSoundGroup();
		if (soundGroup == null || soundGroup.getBreakSound() == null) return;
		this.block.getWorld().playSound(
				this.block.getLocation().toCenterLocation(),
				soundGroup.getBreakSound(),
				soundGroup.getBreakSoundVolume(),
				soundGroup.getBreakSoundPitch()
		);
	}
}
