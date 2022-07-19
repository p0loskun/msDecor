package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.Main;
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BROKEN_SNOWMAN;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
