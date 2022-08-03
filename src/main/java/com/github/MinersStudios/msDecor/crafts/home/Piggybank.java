package com.github.MinersStudios.msDecor.crafts.home;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Piggybank {

	public static void addRecipes() {
		Bukkit.addRecipe(craftPiggybank());
		Bukkit.addRecipe(craftPiggybankDiamond());
		Bukkit.addRecipe(craftPiggybankEmerald());
		Bukkit.addRecipe(craftPiggybankGold());
		Bukkit.addRecipe(craftPiggybankIron());
		Bukkit.addRecipe(craftPiggybankNetherite());
	}

	@Nonnull
	public static ShapedRecipe craftPiggybank() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PIGGYBANK;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"  P",
						"PPP",
						"P P"
				).setIngredient('P', Material.CLAY);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":piggybank");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftPiggybankDiamond() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PIGGYBANK_DIAMOND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"  P",
						"PPP",
						"P P"
				).setIngredient('P', Material.DIAMOND_BLOCK);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":piggybank");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftPiggybankEmerald() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PIGGYBANK_EMERALD;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"  P",
						"PPP",
						"P P"
				).setIngredient('P', Material.EMERALD_BLOCK);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":piggybank");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftPiggybankGold() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PIGGYBANK_GOLD;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"  P",
						"PPP",
						"P P"
				).setIngredient('P', Material.GOLD_BLOCK);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":piggybank");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftPiggybankIron() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PIGGYBANK_IRON;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"  P",
						"PPP",
						"P P"
				).setIngredient('P', Material.IRON_BLOCK);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":piggybank");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftPiggybankNetherite() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PIGGYBANK_NETHERITE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"  P",
						"PPP",
						"P P"
				).setIngredient('P', Material.NETHERITE_BLOCK);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":piggybank");
		return shapedRecipe;
	}
}
