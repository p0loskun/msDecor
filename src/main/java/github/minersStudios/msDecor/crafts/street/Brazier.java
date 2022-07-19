package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Brazier {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBrazier());
    }

    @Nonnull
    public static ShapedRecipe craftBrazier() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BRAZIER;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "B B",
                "BBB",
                " I "
        );
        shapedRecipe.setIngredient('B', Material.IRON_BARS);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        return shapedRecipe;
    }
}
