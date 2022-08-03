package com.github.MinersStudios.msDecor.crafts.home;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Patefon {

	public static void addRecipes() {
		Bukkit.addRecipe(craftPatefon());
	}

	@Nonnull
	public static ShapedRecipe craftPatefon() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PATEFON;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("SJS")
				.setIngredient('J', Material.JUKEBOX)
				.setIngredient('S', Material.SPRUCE_PLANKS);
	}
}
