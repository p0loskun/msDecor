package com.github.minersstudios.msDecor.crafts.home.lamps;

import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
import com.github.minersstudios.msDecor.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BigLamp {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBigLamp());
	}

	@Nonnull
	public static ShapedRecipe craftBigLamp() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIG_LAMP;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("L", "S", "S")
				.setIngredient('S', Material.STICK)
				.setIngredient('L', Material.LEATHER);
	}
}
