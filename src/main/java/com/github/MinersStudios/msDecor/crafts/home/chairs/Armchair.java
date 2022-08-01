package com.github.MinersStudios.msDecor.crafts.home.chairs;

import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

import static com.github.MinersStudios.msDecor.Main.plugin;
import static com.github.MinersStudios.msDecor.Main.pluginNameInLowerCase;

public class Armchair {

	public static void addRecipes() {
		Bukkit.addRecipe(craftOakArmchair());
		Bukkit.addRecipe(craftSpruceArmchair());
		Bukkit.addRecipe(craftBirchArmchair());
		Bukkit.addRecipe(craftDarkOakArmchair());
		Bukkit.addRecipe(craftJungleArmchair());
		Bukkit.addRecipe(craftAcaciaArmchair());
		Bukkit.addRecipe(craftWarpedArmchair());
		Bukkit.addRecipe(craftCrimsonArmchair());
		Bukkit.addRecipe(craftMangroveArmchair());
	}

	@Nonnull
	public static ShapedRecipe craftOakArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSpruceArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJungleArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangroveArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(pluginNameInLowerCase + ":armchair");
		return shapedRecipe;
	}
}
