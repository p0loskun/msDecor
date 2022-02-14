package github.minersStudios.msDecor.crafts.street.trashcans;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class IronTrashcan {

    public IronTrashcan(){
        craftIronTrashcan();
    }

    private void craftIronTrashcan(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("iron_trashcan"), CustomDecorMaterial.IRON_TRASHCAN.getItemStack());
        shapedRecipe.shape(
                "III",
                "I I",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
