package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class BrownBearPlush {

    public BrownBearPlush(){
        craftBrownBearPlush();
    }

    private void craftBrownBearPlush(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("brown_bear_plush"), CustomDecorMaterial.BROWN_BEAR_PLUSH.getItemStack());
        shapedRecipe.shape(
                "   ",
                " W ",
                "W W"
        );
        shapedRecipe.setIngredient('W', Material.BROWN_WOOL);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
