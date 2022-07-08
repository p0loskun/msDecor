package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class CookingPot {

    public static void addRecipes(){
        Bukkit.addRecipe(craftCookingPot());
    }

    @Nonnull
    public static ShapedRecipe craftCookingPot(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cooking_pot"), CustomDecorMaterial.COOKING_POT.getItemStack());
        shapedRecipe.shape(
                "   ",
                "ISI",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        shapedRecipe.setIngredient('S', Material.STICK);
        return shapedRecipe;
    }
}
