package com.github.minersstudios.msDecor.crafts.home.globus;

import com.github.minersstudios.msDecor.Main;
import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallGlobus {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSmallGlobus());
	}

	@Nonnull
	public static ShapedRecipe craftSmallGlobus() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SMALL_GLOBUS;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("M", "S")
				.setIngredient('S', Material.STICK)
				.setIngredient('M', Material.MAP);
	}
}
