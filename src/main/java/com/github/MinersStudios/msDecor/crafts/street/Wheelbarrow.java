package com.github.MinersStudios.msDecor.crafts.street;

import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import com.github.MinersStudios.msDecor.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Wheelbarrow {

	public static void addRecipes() {
		Bukkit.addRecipe(craftWheelbarrow());
	}

	@Nonnull
	public static ShapedRecipe craftWheelbarrow() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WHEELBARROW;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"S S",
						" C ",
						" I "
				).setIngredient('S', Material.STICK)
				.setIngredient('I', Material.IRON_INGOT)
				.setIngredient('C', Material.CAULDRON);
	}
}
