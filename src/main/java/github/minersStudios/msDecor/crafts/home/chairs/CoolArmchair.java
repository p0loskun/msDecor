package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class CoolArmchair {

    public CoolArmchair(){
        craftCoolArmchair();
    }

    private static void craftCoolArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cool_armchair"), CustomDecorMaterial.COOL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "L  ",
                "LLL",
                "I I"
        );
        shapedRecipe.setIngredient('I', Material.IRON_NUGGET);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
