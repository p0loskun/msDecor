package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BarStool {

    public static void addRecipes(){
        Bukkit.addRecipe(craftBarStool());
    }

    @Nonnull
    public static ShapedRecipe craftBarStool(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("bar_stool"), CustomDecorMaterial.BAR_STOOL.getItemStack());
        shapedRecipe.shape(
                "ILI",
                " I ",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
