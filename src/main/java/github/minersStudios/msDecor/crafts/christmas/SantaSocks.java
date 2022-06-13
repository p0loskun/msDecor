package github.minersStudios.msDecor.crafts.christmas;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SantaSocks {

    public SantaSocks(){
        craftSantaSocks();
    }

    private static void craftSantaSocks(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("santa_socks"), CustomDecorMaterial.SANTA_SOCKS.getItemStack());
        shapedRecipe.shape(
                " L ",
                " L",
                " LL"
        );
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
