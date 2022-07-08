package github.minersStudios.msDecor.crafts.home.lamps;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BigLamp {

    public static void addRecipes(){
        Bukkit.addRecipe(craftBigLamp());
    }

    @Nonnull
    public static ShapedRecipe craftBigLamp(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("big_lamp"), CustomDecorMaterial.BIG_LAMP.getItemStack());
        shapedRecipe.shape(
                " L ",
                " S ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
