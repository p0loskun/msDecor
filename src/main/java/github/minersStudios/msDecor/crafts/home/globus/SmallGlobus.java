package github.minersStudios.msDecor.crafts.home.globus;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallGlobus {

    public static void addRecipes(){
        Bukkit.addRecipe(craftSmallGlobus());
    }

    @Nonnull
    public static ShapedRecipe craftSmallGlobus(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_globus"), CustomDecorMaterial.SMALL_GLOBUS.getItemStack());
        shapedRecipe.shape(
                "   ",
                " M ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('M', Material.MAP);
        return shapedRecipe;
    }
}
