package github.minersStudios.msDecor.crafts.street;

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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("brazier"), CustomDecorMaterial.BRAZIER.getItemStack());
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
