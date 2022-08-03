package com.github.MinersStudios.msDecor.crafts.christmas;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Ball {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBall());
	}

	@Nonnull
	public static ShapedRecipe craftBall() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BALL;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						" S ",
						"CCC",
						"CCC"
				).setIngredient('S', Material.STRING)
				.setIngredient('C', Material.CLAY_BALL);
	}
}
