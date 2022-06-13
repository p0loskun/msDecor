package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Brazier {

    public Brazier(){
        craftBrazier();
    }

    private static void craftBrazier(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("brazier"), CustomDecorMaterial.BRAZIER.getItemStack());
        shapedRecipe.shape(
                "B B",
                "BBB",
                " I "
        );
        shapedRecipe.setIngredient('B', Material.IRON_BARS);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
