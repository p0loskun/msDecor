package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BrokenSnowman {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBrokenSnowman());
    }

    @Nonnull
    public static ShapedRecipe craftBrokenSnowman() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("broken_snowman"), CustomDecorMaterial.BROKEN_SNOWMAN.getItemStack());
        shapedRecipe.shape(
                "   ",
                " W ",
                "SSS"
        );
        shapedRecipe.setIngredient('S', Material.SNOW_BLOCK);
        shapedRecipe.setIngredient('W', Material.PURPLE_WOOL);
        return shapedRecipe;
    }
}
