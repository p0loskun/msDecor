package github.minersStudios.msDecor.crafts.home.lamps;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SmallLamp {

    public SmallLamp(){
        craftSmallLamp();
    }

    private void craftSmallLamp(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_lamp"), CustomDecorMaterial.SMALL_LAMP.getItemStack());
        shapedRecipe.shape(
                "   ",
                " L ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
