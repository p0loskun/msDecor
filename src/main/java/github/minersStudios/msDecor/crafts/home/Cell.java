package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Cell {

    public Cell(){
        craftCell();
    }

    private static void craftCell(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("cell"), CustomDecorMaterial.CELL.getItemStack());
        shapedRecipe.shape(
                " C ",
                "BBB",
                "BBB"
        );
        shapedRecipe.setIngredient('B', Material.IRON_BARS);
        shapedRecipe.setIngredient('C', Material.CHAIN);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
