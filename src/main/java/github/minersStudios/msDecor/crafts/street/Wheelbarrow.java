package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Wheelbarrow {

    public Wheelbarrow(){
        craftWheelbarrow();
    }

    private void craftWheelbarrow(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("wheelbarrow"), CustomDecorMaterial.WHEELBARROW.getItemStack());
        shapedRecipe.shape(
                "S S",
                " C ",
                " I "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        shapedRecipe.setIngredient('C', Material.CAULDRON);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
