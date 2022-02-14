package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Patefon {

    public Patefon(){
        craftPatefon();
    }

    private void craftPatefon(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("patefon"), CustomDecorMaterial.PATEFON.getItemStack());
        shapedRecipe.shape(
                "   ",
                "   ",
                "SJS"
        );
        shapedRecipe.setIngredient('J', Material.JUKEBOX);
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
