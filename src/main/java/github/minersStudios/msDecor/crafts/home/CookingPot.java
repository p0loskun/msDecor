package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class CookingPot {

    public CookingPot(){
        craftCookingPot();
    }

    private static void craftCookingPot(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cooking_pot"), CustomDecorMaterial.COOKING_POT.getItemStack());
        shapedRecipe.shape(
                "   ",
                "ISI",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        shapedRecipe.setIngredient('S', Material.STICK);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
