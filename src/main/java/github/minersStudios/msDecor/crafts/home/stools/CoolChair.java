package github.minersStudios.msDecor.crafts.home.stools;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class CoolChair {

    public CoolChair(){
        craftCoolChair();
    }

    private void craftCoolChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cool_chair"), CustomDecorMaterial.COOL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "LLL",
                "I I"
        );
        shapedRecipe.setIngredient('I', Material.IRON_NUGGET);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
