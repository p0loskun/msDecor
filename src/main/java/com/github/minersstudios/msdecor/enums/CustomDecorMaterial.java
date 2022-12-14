package com.github.minersstudios.msdecor.enums;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.Style;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public enum CustomDecorMaterial {
	//<editor-fold desc="Custom decor materials">
	ACACIA_NIGHTSTAND("Акациевая тумбочка", 1086, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	ACACIA_NIGHTSTAND_2_LEFT(null, 1087, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	ACACIA_NIGHTSTAND_2_MIDDLE(null, 1088, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	ACACIA_NIGHTSTAND_2_RIGHT(null, 1089, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	ACACIA_NIGHTSTAND_3_LEFT(null, 1090, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	ACACIA_NIGHTSTAND_3_MIDDLE(null, 1091, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	ACACIA_NIGHTSTAND_3_RIGHT(null, 1092, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	BIRCH_NIGHTSTAND("Берёзовая тумбочка", 1093, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BIRCH_NIGHTSTAND_2_LEFT(null, 1094, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BIRCH_NIGHTSTAND_2_MIDDLE(null, 1095, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BIRCH_NIGHTSTAND_2_RIGHT(null, 1096, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BIRCH_NIGHTSTAND_3_LEFT(null, 1097, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BIRCH_NIGHTSTAND_3_MIDDLE(null, 1098, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BIRCH_NIGHTSTAND_3_RIGHT(null, 1099, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	CRIMSON_NIGHTSTAND("Багровая тумбочка", 1100, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	CRIMSON_NIGHTSTAND_2_LEFT(null, 1101, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	CRIMSON_NIGHTSTAND_2_MIDDLE(null, 1102, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	CRIMSON_NIGHTSTAND_2_RIGHT(null, 1103, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	CRIMSON_NIGHTSTAND_3_LEFT(null, 1104, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	CRIMSON_NIGHTSTAND_3_MIDDLE(null, 1105, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	CRIMSON_NIGHTSTAND_3_RIGHT(null, 1106, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	DARK_OAK_NIGHTSTAND("Тумбочка из тёмного дуба", 1107, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	DARK_OAK_NIGHTSTAND_2_LEFT(null, 1108, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	DARK_OAK_NIGHTSTAND_2_MIDDLE(null, 1109, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	DARK_OAK_NIGHTSTAND_2_RIGHT(null, 1110, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	DARK_OAK_NIGHTSTAND_3_LEFT(null, 1111, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	DARK_OAK_NIGHTSTAND_3_MIDDLE(null, 1112, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	DARK_OAK_NIGHTSTAND_3_RIGHT(null, 1113, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	JUNGLE_NIGHTSTAND("Тропическая тумбочка", 1114, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	JUNGLE_NIGHTSTAND_2_LEFT(null, 1115, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	JUNGLE_NIGHTSTAND_2_MIDDLE(null, 1116, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	JUNGLE_NIGHTSTAND_2_RIGHT(null, 1117, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	JUNGLE_NIGHTSTAND_3_LEFT(null, 1118, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	JUNGLE_NIGHTSTAND_3_MIDDLE(null, 1119, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	JUNGLE_NIGHTSTAND_3_RIGHT(null, 1120, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	OAK_NIGHTSTAND("Дубовая тумбочка", 1121, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	OAK_NIGHTSTAND_2_LEFT(null, 1122, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	OAK_NIGHTSTAND_2_MIDDLE(null, 1123, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	OAK_NIGHTSTAND_2_RIGHT(null, 1124, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	OAK_NIGHTSTAND_3_LEFT(null, 1125, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	OAK_NIGHTSTAND_3_MIDDLE(null, 1126, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	OAK_NIGHTSTAND_3_RIGHT(null, 1127, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	SPRUCE_NIGHTSTAND("Еловая тумбочка", 1128, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	SPRUCE_NIGHTSTAND_2_LEFT(null, 1129, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	SPRUCE_NIGHTSTAND_2_MIDDLE(null, 1130, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	SPRUCE_NIGHTSTAND_2_RIGHT(null, 1131, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	SPRUCE_NIGHTSTAND_3_LEFT(null, 1132, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	SPRUCE_NIGHTSTAND_3_MIDDLE(null, 1133, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	SPRUCE_NIGHTSTAND_3_RIGHT(null, 1134, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	WARPED_NIGHTSTAND("Искажённая тумбочка", 1135, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	WARPED_NIGHTSTAND_2_LEFT(null, 1136, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	WARPED_NIGHTSTAND_2_MIDDLE(null, 1137, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	WARPED_NIGHTSTAND_2_RIGHT(null, 1138, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	WARPED_NIGHTSTAND_3_LEFT(null, 1139, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	WARPED_NIGHTSTAND_3_MIDDLE(null, 1140, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	WARPED_NIGHTSTAND_3_RIGHT(null, 1141, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	MANGROVE_NIGHTSTAND("Мангровая тумбочка", 1203, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	MANGROVE_NIGHTSTAND_2_LEFT(null, 1204, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	MANGROVE_NIGHTSTAND_2_MIDDLE(null, 1205, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	MANGROVE_NIGHTSTAND_2_RIGHT(null, 1206, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	MANGROVE_NIGHTSTAND_3_LEFT(null, 1207, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	MANGROVE_NIGHTSTAND_3_MIDDLE(null, 1208, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	MANGROVE_NIGHTSTAND_3_RIGHT(null, 1209, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),

	SNOWMAN("Снеговик", 1187, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	BROKEN_SNOWMAN("Сломаный снеговик", 1188, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, Facing.FLOOR, null),
	//</editor-fold>
	;

	private final String itemName;
	private final int itemCustomModelData;
	private final List<Component> lore;
	private final Sound placeSound;
	private final Sound breakSound;
	private final float pitch;
	private final HitBox hitBox;
	private final Facing facing;
	private final Double height;
	private static final CustomDecorMaterial[] customDecorMaterials = values();

	CustomDecorMaterial(
			@Nullable String itemName,
			int itemCustomModelData,
			@Nullable Sound placeSound,
			@Nullable Sound breakSound,
			float pitch,
			@NotNull HitBox hitBox,
			@Nullable Facing facing,
			@Nullable List<Component> lore,
			@Nullable Double height
	) {
		this.itemName = itemName;
		this.itemCustomModelData = itemCustomModelData;
		this.placeSound = placeSound;
		this.breakSound = breakSound;
		this.pitch = pitch;
		this.hitBox = hitBox;
		this.facing = facing;
		this.lore = lore;
		this.height = height;
	}

	CustomDecorMaterial(
			@Nullable String itemName,
			int itemCustomModelData,
			@Nullable Sound placeSound,
			@Nullable Sound breakSound,
			float pitch,
			@NotNull HitBox hitBox,
			@Nullable Facing facing,
			@Nullable List<Component> lore
	) {
		this(itemName, itemCustomModelData, placeSound, breakSound, pitch, hitBox, facing, lore, null);
	}


	/**
	 * @return Custom decor item
	 */
	@NotNull
	public ItemStack getItemStack() {
		ItemStack itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
		ItemMeta itemMeta = itemStack.getItemMeta();
		assert itemMeta != null;
		itemMeta.setCustomModelData(this.itemCustomModelData);
		if (this.itemName != null) {
			itemMeta.displayName(Component.text(this.itemName).style(Style.style(
					NamedTextColor.WHITE,
					TextDecoration.OBFUSCATED.withState(false),
					TextDecoration.BOLD.withState(false),
					TextDecoration.ITALIC.withState(false),
					TextDecoration.STRIKETHROUGH.withState(false),
					TextDecoration.UNDERLINED.withState(false)))
			);
		}
		if (this.lore != null) {
			itemMeta.lore(this.lore);
		}
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

	public int getItemCustomModelData() {
		return itemCustomModelData;
	}

	@Nullable
	public Sound getPlaceSound() {
		return placeSound;
	}

	@Nullable
	public Sound getBreakSound() {
		return breakSound;
	}

	public float getPitch() {
		return pitch;
	}

	@NotNull
	public HitBox getHitBox() {
		return hitBox;
	}

	@Nullable
	public Facing getFacing() {
		return facing;
	}

	@Nullable
	public Double getHeight() {
		return height;
	}

	public enum Facing {
		CEILING, FLOOR, WALL
	}

	public enum HitBox {
		FRAME,
		SOLID_FRAME,
		STRUCTURE_FRAME,
		SMALL_ARMOR_STAND,
		STRUCTURE_SMALL_ARMOR_STAND,
		SOLID_SMALL_ARMOR_STAND,
		NORMAL_ARMOR_STAND,
		SOLID_NORMAL_ARMOR_STAND,
		STRUCTURE_NORMAL_ARMOR_STAND;

		/**
		 * @return True if hitbox of custom decor is barrier
		 */
		public boolean isSolidHitBox() {
			return switch (this) {
				case SOLID_FRAME,
						SOLID_SMALL_ARMOR_STAND,
						SOLID_NORMAL_ARMOR_STAND -> true;
				default -> false;
			};
		}

		/**
		 * @return True if hitbox of custom decor is structure void
		 */
		public boolean isStructureHitBox() {
			return switch (this) {
				case STRUCTURE_FRAME,
						STRUCTURE_SMALL_ARMOR_STAND,
						STRUCTURE_NORMAL_ARMOR_STAND -> true;
				default -> false;
			};
		}

		/**
		 * @return True if hitbox of custom decor is armor stand
		 */
		public boolean isArmorStand() {
			return switch (this) {
				case SOLID_SMALL_ARMOR_STAND,
						SOLID_NORMAL_ARMOR_STAND,
						NORMAL_ARMOR_STAND,
						SMALL_ARMOR_STAND,
						STRUCTURE_NORMAL_ARMOR_STAND,
						STRUCTURE_SMALL_ARMOR_STAND -> true;
				default -> false;
			};
		}
	}
}
