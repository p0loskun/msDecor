package com.github.MinersStudios.msDecor.crafts.home.chairs;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BarStool {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBarStool());
	}

	@Nonnull
	public static ShapedRecipe craftBarStool() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BAR_STOOL;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"ILI",
						" I ",
						"III"
				).setIngredient('I', Material.IRON_INGOT)
				.setIngredient('L', Material.LEATHER);
	}
}
