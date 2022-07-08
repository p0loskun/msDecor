package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class RacoonPlush {

    public static void addRecipes(){
        Bukkit.addRecipe(craftRacoonPlush());
    }

    @Nonnull
    public static ShapedRecipe craftRacoonPlush(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("racoon_plush"), CustomDecorMaterial.RACOON_PLUSH.getItemStack());
        shapedRecipe.shape(
                "   ",
                "WWW",
                "WWW"
        );
        shapedRecipe.setIngredient('W', Material.GRAY_WOOL);
        return shapedRecipe;
    }
}
