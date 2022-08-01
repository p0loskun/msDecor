package com.github.MinersStudios.msDecor.crafts.street.trashcans;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class IronTrashcan {

	public static void addRecipes() {
		Bukkit.addRecipe(craftIronTrashcan());
	}

	@Nonnull
	public static ShapedRecipe craftIronTrashcan() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.IRON_TRASHCAN;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"III",
						"I I",
						"III"
				).setIngredient('I', Material.IRON_INGOT);
	}
}
