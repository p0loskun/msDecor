package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Wheelbarrow {

    public static void addRecipes() {
        Bukkit.addRecipe(craftWheelbarrow());
    }

    @Nonnull
    public static ShapedRecipe craftWheelbarrow() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("wheelbarrow"), CustomDecorMaterial.WHEELBARROW.getItemStack());
        shapedRecipe.shape(
                "S S",
                " C ",
                " I "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        shapedRecipe.setIngredient('C', Material.CAULDRON);
        return shapedRecipe;
    }
}
