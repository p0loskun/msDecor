package github.minersStudios.msDecor.crafts.home.cameras;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class OldCamera {

	public static void addRecipes() {
		Bukkit.addRecipe(craftOldCamera());
	}

	@Nonnull
	public static ShapedRecipe craftOldCamera() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OLD_CAMERA;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						" I ",
						" S ",
						"S S"
				).setIngredient('S', Material.STICK).setIngredient('I', Material.IRON_INGOT);
	}
}