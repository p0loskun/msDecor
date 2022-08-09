package com.github.minersstudios.msDecor.crafts.halloween;

import com.github.minersstudios.msDecor.Main;
import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
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
