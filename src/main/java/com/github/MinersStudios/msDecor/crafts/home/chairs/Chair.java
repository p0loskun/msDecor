package com.github.MinersStudios.msDecor.crafts.home.chairs;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Chair {

	public static void addRecipes() {
		Bukkit.addRecipe(craftOakChair());
		Bukkit.addRecipe(craftSpruceChair());
		Bukkit.addRecipe(craftBirchChair());
		Bukkit.addRecipe(craftDarkOakChair());
		Bukkit.addRecipe(craftJungleChair());
		Bukkit.addRecipe(craftAcaciaChair());
		Bukkit.addRecipe(craftWarpedChair());
		Bukkit.addRecipe(craftCrimsonChair());
		Bukkit.addRecipe(craftMangroveChair());
	}

	@Nonnull
	public static ShapedRecipe craftOakChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSpruceChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJungleChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangroveChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_CHAIR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance() , customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"P  ",
						"PLP",
						"P P"
				)
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('L', Material.LEATHER);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":chair");
		return shapedRecipe;
	}
}
