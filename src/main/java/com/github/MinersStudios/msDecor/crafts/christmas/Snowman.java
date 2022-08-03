package com.github.MinersStudios.msDecor.crafts.christmas;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Snowman {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSnowman());
	}

	@Nonnull
	public static ShapedRecipe craftSnowman() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SNOWMAN;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						" W ",
						"SBS ",
						" B "
				).setIngredient('S', Material.STICK)
				.setIngredient('B', Material.SNOW_BLOCK)
				.setIngredient('W', Material.PURPLE_WOOL);
	}
}
