package github.minersStudios.msDecor.crafts.home.clocks;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallClock {

    public static void addRecipes() {
        Bukkit.addRecipe(craftSmallClock());
    }

    @Nonnull
    public static ShapedRecipe craftSmallClock() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_clock"), CustomDecorMaterial.SMALL_CLOCK.getItemStack());
        shapedRecipe.shape(
                "LLL",
                "LCL",
                "LLL"
        );
        shapedRecipe.setIngredient('C', Material.CLOCK);
        shapedRecipe.setIngredient('L', Material.CLAY_BALL);
        return shapedRecipe;
    }
}
