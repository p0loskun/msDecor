package github.minersStudios.msDecor.objects;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.utils.BlockUtils;
import github.minersStudios.msDecor.utils.EntityUtils;
import github.minersStudios.msDecor.utils.PlayerUtils;
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

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static github.minersStudios.msDecor.Main.coreProtectAPI;

public class CustomDecor {
	private final Block block;
	private final Player player;
	private ItemStack itemInHand;
	@Nullable private CustomDecorMaterial customDecorMaterial;

	public CustomDecor(@Nonnull Block block, @Nullable Player player) {
		this.block = block;
		this.player = player;
	}

	/**
	 * Sets custom decor
	 *
	 * @param customDecorMaterial custom decor that will be placed
	 * @param blockFace block face on which the frame is to be spawned
	 */
	public void setCustomDecor(@Nonnull CustomDecorMaterial customDecorMaterial, @Nonnull BlockFace blockFace, @Nonnull EquipmentSlot hand) {
		if (this.player == null) return;
		Bukkit.getScheduler().runTask(Main.plugin, () -> {
			this.customDecorMaterial = customDecorMaterial;
			this.itemInHand = this.player.getInventory().getItem(hand);
			if (customDecorMaterial.getHitBox().isArmorStand()) {
				this.summonArmorStand();
			} else {
				this.summonItemFrame(blockFace);
			}
			this.setHitBox();
			PlayerUtils.swingHand(player, hand);
			this.playPlaceSound();
			this.itemInHand.setAmount(this.player.getGameMode() == GameMode.SURVIVAL ? this.itemInHand.getAmount() - 1 : this.itemInHand.getAmount());
			coreProtectAPI.logPlacement(this.player.getName(), this.block.getLocation(), Material.VOID_AIR, this.block.getBlockData());
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
				this.customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(nearbyEntity, true);
				if (this.customDecorMaterial == null) return;
				itemFrame.remove();
				if (this.player == null || this.player.getGameMode() == GameMode.SURVIVAL) {
					ItemStack itemStack = itemFrame.getItem();
					ItemMeta itemMeta = itemStack.getItemMeta();
					itemMeta.displayName(nearbyEntity.name());
					itemMeta.setCustomModelData(this.customDecorMaterial.getItemCustomModelData());
					itemStack.setItemMeta(itemMeta);
					world.dropItemNaturally(blockLocation, itemStack);
				}
			}
		}
		if (this.customDecorMaterial == null) {
			for (Entity nearbyEntity : block.getWorld().getNearbyEntities(blockLocation.clone().add(0.5d, 0.0d, 0.5d), 0.2d, 0.3d, 0.2d)) {
				if (
						nearbyEntity instanceof ArmorStand armorStand
						&& armorStand.getEquipment().getHelmet() != null
						&& armorStand.getEquipment().getHelmet().getItemMeta() != null
				) {
					this.customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(armorStand, true);
					if (this.customDecorMaterial == null) return;
					armorStand.remove();
					if (this.player == null || this.player.getGameMode() == GameMode.SURVIVAL) {
						ItemStack itemStack = armorStand.getEquipment().getHelmet();
						ItemMeta itemMeta = itemStack.getItemMeta();
						itemMeta.setCustomModelData(this.customDecorMaterial.getItemCustomModelData());
						itemStack.setItemMeta(itemMeta);
						world.dropItemNaturally(blockLocation, itemStack);
					}
				}
			}
		}
		this.playBreakSound();
		if (BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(this.block.getType()) || this.block.getType() == Material.LIGHT)
			this.block.setType(Material.AIR);
		coreProtectAPI.logRemoval(this.player != null ? this.player.getName() : null, this.block.getLocation(), Material.VOID_AIR, this.block.getBlockData());
	}

	/**
	 * Summons armor stand with custom decor item like hat
	 */
	private void summonArmorStand() {
		if (this.player == null || this.customDecorMaterial == null) return;
		this.block.getWorld().spawn(this.block.getLocation().add(0.5d, 0.0d, 0.5d), ArmorStand.class, (armorStand) -> {
			armorStand.setGravity(false);
			armorStand.setMarker(this.customDecorMaterial.getHitBox().isSolidHitBox() || this.customDecorMaterial.getHitBox().isStructureHitBox());
			armorStand.setSmall(this.customDecorMaterial.getHitBox() == CustomDecorMaterial.HitBox.SMALL_ARMOR_STAND || this.customDecorMaterial.getHitBox() == CustomDecorMaterial.HitBox.SOLID_SMALL_ARMOR_STAND || this.customDecorMaterial.getHitBox() == CustomDecorMaterial.HitBox.STRUCTURE_SMALL_ARMOR_STAND);
			armorStand.setVisible(false);
			armorStand.setCollidable(false);
			armorStand.addScoreboardTag("customDecor");

			ItemStack itemStack = this.itemInHand.clone();
			ItemMeta itemMeta = itemStack.getItemMeta();
			assert itemMeta != null;
			itemMeta.displayName(itemMeta.displayName());
			itemStack.setItemMeta(itemMeta);
			armorStand.getEquipment().setHelmet(itemStack);

			EntityUtils.rotateArmorStandByPlayer(armorStand, this.player);
		});
	}

	/**
	 * Summons item frame with custom decor item
	 *
	 * @param blockFace block face on which the frame is to be spawned
	 */
	private void summonItemFrame(BlockFace blockFace) {
		if (this.player == null || this.customDecorMaterial == null || this.itemInHand.getItemMeta() == null) return;
		this.block.getWorld().spawn(this.block.getLocation().add(0.5d, 0.0d, 0.5d), ItemFrame.class, (itemFrame) -> {
			itemFrame.setItemDropChance(0.0f);
			itemFrame.customName(this.itemInHand.getItemMeta().displayName());
			itemFrame.setVisible(false);
			itemFrame.setSilent(true);
			itemFrame.setFixed(this.customDecorMaterial.getHitBox() != CustomDecorMaterial.HitBox.FRAME);
			itemFrame.setFacingDirection(blockFace);
			itemFrame.addScoreboardTag("customDecor");

			ItemStack itemStack = this.itemInHand.clone();
			ItemMeta itemMeta = itemStack.getItemMeta();
			assert itemMeta != null;
			itemMeta.displayName(null);
			itemStack.setItemMeta(itemMeta);
			itemFrame.setItem(itemStack);

			if (this.customDecorMaterial.getFacing() != CustomDecorMaterial.Facing.WALL)
				EntityUtils.rotateItemFrameByPlayer(itemFrame, this.player);
		});
	}

	/**
	 * Sets custom decor hitbox
	 */
	private void setHitBox() {
		if (this.customDecorMaterial == null) return;
		Bukkit.getScheduler().runTask(Main.plugin, () -> {
			this.block.setType(
					this.customDecorMaterial.getHitBox().isStructureHitBox() ? Material.STRUCTURE_VOID
							: this.customDecorMaterial.getHitBox().isSolidHitBox() ? Material.BARRIER
							: Material.LIGHT
			);
			if (this.block.getType() != Material.LIGHT) return;
			Levelled level = (Levelled) this.block.getBlockData();
			level.setLevel(this.customDecorMaterial.name().contains("_FIRE") ? 15 : 0);
			this.block.setBlockData(level, true);
		});
	}

	/**
	 * Plays custom decor place sound
	 */
	public void playPlaceSound() {
		if (this.customDecorMaterial == null || this.customDecorMaterial.getPlaceSound() == null) return;
		if (this.customDecorMaterial.getPlaceSound() == Sound.BLOCK_WOOD_PLACE) {
			this.block.getWorld().playSound(this.block.getLocation().clone().add(0.5d, 0.5d, 0.5d), "custom.block.wood.place", 1.0f, this.customDecorMaterial.getPitch());
		} else {
			this.block.getWorld().playSound(this.block.getLocation().clone().add(0.5d, 0.5d, 0.5d), this.customDecorMaterial.getPlaceSound(), 1.0f, this.customDecorMaterial.getPitch());
		}
	}

	/**
	 * Plays custom decor break sound
	 */
	public void playBreakSound() {
		if (this.customDecorMaterial == null || this.customDecorMaterial.getBreakSound() == null) return;
		if (this.customDecorMaterial.getBreakSound() == Sound.BLOCK_WOOD_BREAK) {
			this.block.getWorld().playSound(this.block.getLocation().clone().add(0.5d, 0.5d, 0.5d), "custom.block.wood.break", 1.0f, this.customDecorMaterial.getPitch());
		} else {
			this.block.getWorld().playSound(this.block.getLocation().clone().add(0.5d, 0.5d, 0.5d), this.customDecorMaterial.getBreakSound(), 1.0f, this.customDecorMaterial.getPitch());
		}
	}
}