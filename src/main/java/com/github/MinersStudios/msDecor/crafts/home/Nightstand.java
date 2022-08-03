package com.github.MinersStudios.msDecor.crafts.home;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Nightstand {

	public static void addRecipes() {
		Bukkit.addRecipe(craftAcaciaNightstand());
		Bukkit.addRecipe(craftBirchNightstand());
		Bukkit.addRecipe(craftCrimsonNightstand());
		Bukkit.addRecipe(craftDarkOakNightstand());
		Bukkit.addRecipe(craftJungleNightstand());
		Bukkit.addRecipe(craftOakNightstand());
		Bukkit.addRecipe(craftSpruceNightstand());
		Bukkit.addRecipe(craftWarpedNightstand());
		Bukkit.addRecipe(craftMangroveNightstand());
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJungleNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftOakNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSpruceNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangroveNightstand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_NIGHTSTAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"PPP",
						"PPP",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":nightstand");
		return shapedRecipe;
	}
}
