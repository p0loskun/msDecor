package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Ball {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBall());
    }

    @Nonnull
    public static ShapedRecipe craftBall() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("ball"), CustomDecorMaterial.BALL.getItemStack());
        shapedRecipe.shape(
                " S ",
                "CCC",
                "CCC"
        );
        shapedRecipe.setIngredient('S', Material.STRING);
        shapedRecipe.setIngredient('C', Material.CLAY_BALL);
        return shapedRecipe;
    }
}
