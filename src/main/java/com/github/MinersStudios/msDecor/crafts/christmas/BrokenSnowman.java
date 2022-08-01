package com.github.MinersStudios.msDecor.crafts.christmas;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BrokenSnowman {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBrokenSnowman());
	}

	@Nonnull
	public static ShapedRecipe craftBrokenSnowman() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BROKEN_SNOWMAN;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"   ",
						" W ",
						"SSS"
				).setIngredient('S', Material.SNOW_BLOCK)
				.setIngredient('W', Material.PURPLE_WOOL);
	}
}
