package github.minersStudios.msDecor.crafts.home.globus;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SmallGlobus {

    public SmallGlobus(){
        craftSmallGlobus();
    }

    private void craftSmallGlobus(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_globus"), CustomDecorMaterial.SMALL_GLOBUS.getItemStack());
        shapedRecipe.shape(
                "   ",
                " M ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('M', Material.MAP);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
