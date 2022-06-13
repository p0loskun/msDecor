package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class BrokenSnowman {

    public BrokenSnowman(){
        craftBrokenSnowman();
    }

    private static void craftBrokenSnowman(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("broken_snowman"), CustomDecorMaterial.BROKEN_SNOWMAN.getItemStack());
        shapedRecipe.shape(
                "   ",
                " W ",
                "SSS"
        );
        shapedRecipe.setIngredient('S', Material.SNOW_BLOCK);
        shapedRecipe.setIngredient('W', Material.PURPLE_WOOL);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
