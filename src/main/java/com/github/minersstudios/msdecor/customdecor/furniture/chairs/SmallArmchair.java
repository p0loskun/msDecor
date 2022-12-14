package com.github.minersstudios.msdecor.customdecor.furniture.chairs;

import com.github.minersstudios.msdecor.Main;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.Sittable;
import com.github.minersstudios.msdecor.customdecor.SoundGroup;
import com.github.minersstudios.msdecor.customdecor.Typed;
import com.github.minersstudios.msdecor.utils.ChatUtils;
import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Locale;

public class SmallArmchair implements Sittable, Typed {
	private @NotNull NamespacedKey namespacedKey;
	private @NotNull ItemStack itemStack;
	private @Nullable SoundGroup soundGroup;
	private @Nullable List<Recipe> recipes;
	private double height;

	public SmallArmchair() {
		this.namespacedKey = new NamespacedKey(Main.getInstance(), "small_armchair");
		this.itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
		this.soundGroup = new SoundGroup(
				"custom.block.wood.place", 0.5f, 1.0f,
				"custom.block.wood.break", 0.5f, 1.0f
		);
		//<editor-fold desc="Recipes">
		ShapedRecipe acacia = new ShapedRecipe(Type.ACACIA.namespacedKey, this.createItemStack(Type.ACACIA))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('L', Material.LEATHER);
		acacia.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe birch = new ShapedRecipe(Type.BIRCH.namespacedKey, this.createItemStack(Type.BIRCH))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('L', Material.LEATHER);
		birch.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe crimson = new ShapedRecipe(Type.CRIMSON.namespacedKey, this.createItemStack(Type.CRIMSON))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('L', Material.LEATHER);
		crimson.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe darkOak = new ShapedRecipe(Type.DARK_OAK.namespacedKey, this.createItemStack(Type.DARK_OAK))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		darkOak.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe jungle = new ShapedRecipe(Type.JUNGLE.namespacedKey, this.createItemStack(Type.JUNGLE))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		jungle.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe oak = new ShapedRecipe(Type.OAK.namespacedKey, this.createItemStack(Type.OAK))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		oak.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe spruce = new ShapedRecipe(Type.SPRUCE.namespacedKey, this.createItemStack(Type.SPRUCE))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		spruce.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe warped = new ShapedRecipe(Type.WARPED.namespacedKey, this.createItemStack(Type.WARPED))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('L', Material.LEATHER);
		warped.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		ShapedRecipe mangrove = new ShapedRecipe(Type.MANGROVE.namespacedKey, this.createItemStack(Type.MANGROVE))
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		mangrove.setGroup(this.namespacedKey.getNamespace() + ":small_armchair");
		//</editor-fold>
		this.recipes = Lists.newArrayList(acacia, birch, crimson, darkOak, jungle, oak, spruce, warped, mangrove);
		this.height = 0.6d;
	}

	@Override
	public @NotNull NamespacedKey getNamespacedKey() {
		return this.namespacedKey;
	}

	@Override
	public void setNamespacedKey(@NotNull NamespacedKey namespacedKey) {
		this.namespacedKey = namespacedKey;
	}

	@Override
	public @NotNull ItemStack getItemStack() {
		return this.itemStack;
	}

	@Override
	public void setItemStack(@NotNull ItemStack itemStack) {
		this.itemStack = itemStack;
	}

	@Override
	public @Nullable SoundGroup getSoundGroup() {
		return this.soundGroup;
	}

	@Override
	public void setSoundGroup(@Nullable SoundGroup soundGroup) {
		this.soundGroup = soundGroup;
	}

	@Override
	public @Nullable List<Recipe> getRecipes() {
		return this.recipes;
	}

	@Override
	public void setRecipes(@Nullable List<Recipe> recipes) {
		this.recipes = recipes;
	}

	@Override
	public @NotNull CustomDecorData clone() {
		try {
			return (CustomDecorData) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public double getHeight() {
		return this.height;
	}

	@Override
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public Type @NotNull [] getTypes() {
		return Type.types;
	}

	enum Type implements Typed.Type {
		//<editor-fold desc="Types">
		ACACIA("Aкациевое маленькое кресло", 1020),
		BIRCH("Берёзовое маленькое кресло", 1021),
		CRIMSON( "Багровое маленькое кресло", 1022),
		DARK_OAK("Маленькое кресло из тёмного дуба", 1023),
		JUNGLE("Тропическое маленькое кресло", 1024),
		OAK("Дубовое маленькое кресло", 1025),
		SPRUCE("Еловое маленькое кресло", 1026),
		WARPED("Искажённое маленькое кресло", 1027),
		MANGROVE("Мангровое маленькое кресло", 1195);
		//</editor-fold>

		private final @NotNull NamespacedKey namespacedKey;
		private final @NotNull String itemName;
		private final int customModelData;
		private final @Nullable List<Component> lore;
		private final @NotNull HitBox hitBox;
		private final @Nullable Facing facing;

		private static final Type @NotNull [] types = values();

		Type(
				@NotNull String itemName,
				int customModelData
		) {
			this.namespacedKey = new NamespacedKey(Main.getInstance(), this.name().toLowerCase(Locale.ROOT) + "_small_armchair");
			this.itemName = itemName;
			this.customModelData = customModelData;
			this.lore = ChatUtils.PAINTABLE_LORE_COMPONENT;
			this.hitBox = HitBox.SOLID_FRAME;
			this.facing = Facing.FLOOR;
		}

		@Override
		public @NotNull NamespacedKey getNamespacedKey() {
			return this.namespacedKey;
		}

		@Override
		public @NotNull String getItemName() {
			return this.itemName;
		}

		@Override
		public int getCustomModelData() {
			return this.customModelData;
		}

		@Override
		public @Nullable List<Component> getLore() {
			return this.lore;
		}

		@Override
		public @NotNull HitBox getHitBox() {
			return this.hitBox;
		}

		@Override
		public @Nullable Facing getFacing() {
			return this.facing;
		}
	}
}
