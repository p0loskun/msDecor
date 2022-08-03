package com.github.MinersStudios.msDecor.crafts.home.clocks;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallClock {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSmallClock());
	}

	@Nonnull
	public static ShapedRecipe craftSmallClock() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SMALL_CLOCK;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"LLL",
						"LCL",
						"LLL"
				).setIngredient('C', Material.CLOCK)
				.setIngredient('L', Material.CLAY_BALL);
	}
}
