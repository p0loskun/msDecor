package com.github.MinersStudios.msDecor.crafts.home.tables;

import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import com.github.MinersStudios.msDecor.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

import static com.github.MinersStudios.msDecor.Main.pluginNameInLowerCase;

public class BigTable {

	public static void addRecipes() {
		Bukkit.addRecipe(craftOakBigTable());
		Bukkit.addRecipe(craftSpruceBigTable());
		Bukkit.addRecipe(craftBirchBigTable());
		Bukkit.addRecipe(craftDarkOakBigTable());
		Bukkit.addRecipe(craftJungleBigTable());
		Bukkit.addRecipe(craftAcaciaBigTable());
		Bukkit.addRecipe(craftWarpedBigTable());
		Bukkit.addRecipe(craftCrimsonBigTable());
		Bukkit.addRecipe(craftMangroveBigTable());
		Bukkit.addRecipe(craftOakPaintableBigTable());
		Bukkit.addRecipe(craftSprucePaintableBigTable());
		Bukkit.addRecipe(craftBirchPaintableBigTable());
		Bukkit.addRecipe(craftDarkOakPaintableBigTable());
		Bukkit.addRecipe(craftJunglePaintableBigTable());
		Bukkit.addRecipe(craftAcaciaPaintableBigTable());
		Bukkit.addRecipe(craftWarpedPaintableBigTable());
		Bukkit.addRecipe(craftCrimsonPaintableBigTable());
		Bukkit.addRecipe(craftMangrovePaintableBigTable());
	}

	@Nonnull
	public static ShapedRecipe craftOakBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSpruceBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJungleBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangroveBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_BIG_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftOakPaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSprucePaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakPaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchPaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJunglePaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaPaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedPaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonPaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangrovePaintableBigTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_BIG_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PLP",
						"P P",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_big_table");
		return shapedRecipe;
	}
}
