package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Snowman {

    public Snowman(){
        craftSnowman();
    }

    private static void craftSnowman(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("snowman"), CustomDecorMaterial.SNOWMAN.getItemStack());
        shapedRecipe.shape(
                " W ",
                "SBS ",
                " B "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('B', Material.SNOW_BLOCK);
        shapedRecipe.setIngredient('W', Material.PURPLE_WOOL);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
