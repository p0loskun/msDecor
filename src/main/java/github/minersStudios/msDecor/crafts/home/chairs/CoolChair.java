package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class CoolChair {

    public static void addRecipes(){
        Bukkit.addRecipe(craftCoolChair());
    }

    @Nonnull
    public static ShapedRecipe craftCoolChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cool_chair"), CustomDecorMaterial.COOL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "LLL",
                "I I"
        );
        shapedRecipe.setIngredient('I', Material.IRON_NUGGET);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
