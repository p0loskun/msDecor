package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Cell {

    public static void addRecipes() {
        Bukkit.addRecipe(craftCell());
    }

    @Nonnull
    public static ShapedRecipe craftCell() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CELL;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                " C ",
                "BBB",
                "BBB"
        );
        shapedRecipe.setIngredient('B', Material.IRON_BARS);
        shapedRecipe.setIngredient('C', Material.CHAIN);
        return shapedRecipe;
    }
}
