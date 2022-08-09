package com.github.minersstudios.msDecor.crafts.christmas;

import com.github.minersstudios.msDecor.Main;
import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SantaSocks {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSantaSocks());
	}

	@Nonnull
	public static ShapedRecipe craftSantaSocks() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SANTA_SOCKS;
		return new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("L", "L", "LL")
				.setIngredient('L', Material.LEATHER);
	}
}
