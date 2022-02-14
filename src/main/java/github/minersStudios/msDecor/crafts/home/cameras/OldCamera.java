package github.minersStudios.msDecor.crafts.home.cameras;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class OldCamera {

    public OldCamera(){
        craftOldCamera();
    }

    private void craftOldCamera(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("old_camera"), CustomDecorMaterial.CAMERA.getItemStack());
        shapedRecipe.shape(
                " I ",
                " S ",
                "S S"
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
