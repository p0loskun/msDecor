package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class BMOPlush {

    public BMOPlush(){
        craftBMOPlush();
    }

    private static void craftBMOPlush(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("bmo_plush"), CustomDecorMaterial.BMO_PLUSH.getItemStack());
        shapedRecipe.shape(
                "   ",
                "II ",
                "DI "
        );
        shapedRecipe.setIngredient('D', Material.LIGHT_BLUE_DYE);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
