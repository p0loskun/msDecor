package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class CoolArmchair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftCoolArmchair());
    }

    @Nonnull
    public static ShapedRecipe craftCoolArmchair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cool_armchair"), CustomDecorMaterial.COOL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "L  ",
                "LLL",
                "I I"
        );
        shapedRecipe.setIngredient('I', Material.IRON_NUGGET);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
