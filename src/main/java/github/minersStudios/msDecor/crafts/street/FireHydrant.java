package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class FireHydrant {

    public FireHydrant(){
        craftFireHydrant();
    }

    private void craftFireHydrant(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("fire_hydrant"), CustomDecorMaterial.FIRE_HYDRANT.getItemStack());
        shapedRecipe.shape(
                " B ",
                " B ",
                "III"
        );
        shapedRecipe.setIngredient('B', Material.IRON_BLOCK);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
