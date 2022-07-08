package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BrownBearPlush {

    public static void addRecipes(){
        Bukkit.addRecipe(craftBrownBearPlush());
    }

    @Nonnull
    public static ShapedRecipe craftBrownBearPlush(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("brown_bear_plush"), CustomDecorMaterial.BROWN_BEAR_PLUSH.getItemStack());
        shapedRecipe.shape(
                "   ",
                " W ",
                "W W"
        );
        shapedRecipe.setIngredient('W', Material.BROWN_WOOL);
        return shapedRecipe;
    }
}
