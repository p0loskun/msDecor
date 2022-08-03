package com.github.MinersStudios.msDecor.crafts.home.chairs;

import com.github.MinersStudios.msDecor.Main;
import com.github.MinersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class CoolChair {

	public static void addRecipes() {
		Bukkit.addRecipe(craftCoolChair());
	}

	@Nonnull
	public static ShapedRecipe craftCoolChair() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.COOL_CHAIR;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("LLL", "IAI")
				.setIngredient('I', Material.IRON_NUGGET)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
	}
}
