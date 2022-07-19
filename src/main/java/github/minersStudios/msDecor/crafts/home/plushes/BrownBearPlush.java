package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BrownBearPlush {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBrownBearPlush());
    }

    @Nonnull
    public static ShapedRecipe craftBrownBearPlush() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BROWN_BEAR_PLUSH;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                " W ",
                "W W"
        );
        shapedRecipe.setIngredient('W', Material.BROWN_WOOL);
        return shapedRecipe;
    }
}
