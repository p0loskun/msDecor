package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;


public class SantaSocks {

    public static void addRecipes(){
        Bukkit.addRecipe(craftSantaSocks());
    }

    @Nonnull
    public static ShapedRecipe craftSantaSocks(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("santa_socks"), CustomDecorMaterial.SANTA_SOCKS.getItemStack());
        shapedRecipe.shape(
                " L ",
                " L",
                " LL"
        );
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
