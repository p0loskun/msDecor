package github.minersStudios.msDecor.crafts.home.lamps;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class BigLamp {

    public BigLamp(){
        craftBigLamp();
    }

    private void craftBigLamp(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("big_lamp"), CustomDecorMaterial.BIG_LAMP.getItemStack());
        shapedRecipe.shape(
                " L ",
                " S ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
