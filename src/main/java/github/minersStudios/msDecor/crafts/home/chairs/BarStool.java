package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class BarStool {

    public BarStool(){
        craftBarStool();
    }

    private void craftBarStool(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("bar_stool"), CustomDecorMaterial.BAR_STOOL.getItemStack());
        shapedRecipe.shape(
                "ILI",
                " I ",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
