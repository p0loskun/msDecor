package github.minersStudios.msDecor.crafts.home.clocks;

import github.minersStudios.msDecor.Main;
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SMALL_CLOCK;
        return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "LLL",
                        "LCL",
                        "LLL"
                )
                .setIngredient('C', Material.CLOCK)
                .setIngredient('L', Material.CLAY_BALL);
    }
}
