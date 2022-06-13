package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Ball {

    public Ball(){
        craftBall();
    }

    private static void craftBall(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("ball"), CustomDecorMaterial.BALL.getItemStack());
        shapedRecipe.shape(
                " S ",
                "CCC",
                "CCC"
        );
        shapedRecipe.setIngredient('S', Material.STRING);
        shapedRecipe.setIngredient('C', Material.CLAY_BALL);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
