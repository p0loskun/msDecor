package github.minersStudios.msDecor.crafts.home.lamps;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallLamp {

    public static void addRecipes(){
        Bukkit.addRecipe(craftSmallLamp());
    }

    @Nonnull
    public static ShapedRecipe craftSmallLamp(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_lamp"), CustomDecorMaterial.SMALL_LAMP.getItemStack());
        shapedRecipe.shape(
                "   ",
                " L ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
