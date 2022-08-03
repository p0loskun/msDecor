package com.github.MinersStudios.msDecor.crafts.halloween;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SkeletonHand {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSkeletonHand());
	}

	@Nonnull
	public static ShapedRecipe craftSkeletonHand() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SKELETON_HAND;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"BBB",
						"BBB",
						" B "
				).setIngredient('B', Material.BONE);
	}
}
