package github.minersStudios.msDecor.crafts.home.lamps;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallLamp {

	public static void addRecipes() {
		Bukkit.addRecipe(craftSmallLamp());
	}

	@Nonnull
	public static ShapedRecipe craftSmallLamp() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SMALL_LAMP;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("L", "S")
				.setIngredient('S', Material.STICK)
				.setIngredient('L', Material.LEATHER);
	}
}