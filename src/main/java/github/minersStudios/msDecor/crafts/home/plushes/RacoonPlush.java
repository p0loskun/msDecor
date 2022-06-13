package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class RacoonPlush {

    public RacoonPlush(){
        craftRacoonPlush();
    }

    private static void craftRacoonPlush(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("racoon_plush"), CustomDecorMaterial.RACOON_PLUSH.getItemStack());
        shapedRecipe.shape(
                "   ",
                "WWW",
                "WWW"
        );
        shapedRecipe.setIngredient('W', Material.GRAY_WOOL);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
