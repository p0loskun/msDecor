package com.github.minersstudios.msDecor.crafts.home.chairs;

import com.github.minersstudios.msDecor.Main;
import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallArmchair {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSmallOakArmchair());
		Bukkit.addRecipe(craftSmallSpruceArmchair());
		Bukkit.addRecipe(craftSmallBirchArmchair());
		Bukkit.addRecipe(craftSmallDarkOakArmchair());
		Bukkit.addRecipe(craftSmallJungleArmchair());
		Bukkit.addRecipe(craftSmallAcaciaArmchair());
		Bukkit.addRecipe(craftSmallWarpedArmchair());
		Bukkit.addRecipe(craftSmallCrimsonArmchair());
		Bukkit.addRecipe(craftSmallMangroveArmchair());
	}

	@Nonnull
	public static ShapedRecipe craftSmallOakArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallSpruceArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallDarkOakArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallBirchArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallJungleArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallAcaciaArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallWarpedArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallCrimsonArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSmallMangroveArmchair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_SMALL_ARMCHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LP ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_armchair");
		return shapedRecipe;
	}
}
