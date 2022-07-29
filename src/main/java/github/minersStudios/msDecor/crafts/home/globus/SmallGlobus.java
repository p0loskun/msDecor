package github.minersStudios.msDecor.crafts.home.globus;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
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
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("M", "S")
				.setIngredient('S', Material.STICK)
				.setIngredient('M', Material.MAP);
	}
}