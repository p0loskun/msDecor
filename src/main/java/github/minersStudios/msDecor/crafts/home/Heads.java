package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Heads {

	public static void addRecipes() {
		Bukkit.addRecipe(craftDeerHead());
		Bukkit.addRecipe(craftHoglinHead());
		Bukkit.addRecipe(craftZoglinHead());
	}

	@Nonnull
	public static ShapedRecipe craftDeerHead() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DEER_HEAD;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						"BBS",
						" LS",
						"  S"
				)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('B', Material.BONE)
				.setIngredient('S', Material.SPRUCE_LOG);
	}

	@Nonnull
	public static ShapedRecipe craftHoglinHead() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.HOGLIN_HEAD;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						" PS",
						"BBS",
						"  S"
				)
				.setIngredient('P', Material.PORKCHOP)
				.setIngredient('B', Material.BONE)
				.setIngredient('S', Material.SPRUCE_LOG);
	}

	@Nonnull
	public static ShapedRecipe craftZoglinHead() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ZOGLIN_HEAD;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape(
						" FS",
						"BBS",
						"  S"
				)
				.setIngredient('F', Material.ROTTEN_FLESH)
				.setIngredient('B', Material.BONE)
				.setIngredient('S', Material.SPRUCE_LOG);
	}
}