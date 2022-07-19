package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Patefon {

    public static void addRecipes() {
        Bukkit.addRecipe(craftPatefon());
    }

    @Nonnull
    public static ShapedRecipe craftPatefon() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.PATEFON;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "   ",
                "SJS"
        );
        shapedRecipe.setIngredient('J', Material.JUKEBOX);
        shapedRecipe.setIngredient('S', Material.SPRUCE_PLANKS);
        return shapedRecipe;
    }
}
