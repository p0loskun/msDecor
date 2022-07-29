package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Ball {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBall());
	}

	@Nonnull
	public static ShapedRecipe craftBall() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BALL;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
		shapedRecipe.shape(
				" S ",
				"CCC",
				"CCC"
		);
		shapedRecipe.setIngredient('S', Material.STRING);
		shapedRecipe.setIngredient('C', Material.CLAY_BALL);
		return shapedRecipe;
	}
}