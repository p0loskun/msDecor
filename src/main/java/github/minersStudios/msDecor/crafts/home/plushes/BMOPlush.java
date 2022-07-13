package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BMOPlush {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBMOPlush());
    }

    @Nonnull
    public static ShapedRecipe craftBMOPlush() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("bmo_plush"), CustomDecorMaterial.BMO_PLUSH.getItemStack());
        shapedRecipe.shape(
                "   ",
                "II ",
                "DI "
        );
        shapedRecipe.setIngredient('D', Material.LIGHT_BLUE_DYE);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        return shapedRecipe;
    }
}
