package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Snowman {

    public static void addRecipes(){
        Bukkit.addRecipe(craftSnowman());
    }

    @Nonnull
    public static ShapedRecipe craftSnowman(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("snowman"), CustomDecorMaterial.SNOWMAN.getItemStack());
        shapedRecipe.shape(
                " W ",
                "SBS ",
                " B "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('B', Material.SNOW_BLOCK);
        shapedRecipe.setIngredient('W', Material.PURPLE_WOOL);
        return shapedRecipe;
    }
}
