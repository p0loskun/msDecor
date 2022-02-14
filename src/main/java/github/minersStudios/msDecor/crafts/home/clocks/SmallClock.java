package github.minersStudios.msDecor.crafts.home.clocks;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SmallClock {

    public SmallClock(){
        craftSmallClock();
    }

    private void craftSmallClock(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_clock"), CustomDecorMaterial.SMALL_CLOCK.getItemStack());
        shapedRecipe.shape(
                "LLL",
                "LCL",
                "LLL"
        );
        shapedRecipe.setIngredient('C', Material.CLOCK);
        shapedRecipe.setIngredient('L', Material.CLAY_BALL);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
