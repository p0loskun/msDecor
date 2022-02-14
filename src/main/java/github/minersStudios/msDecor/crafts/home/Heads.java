package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Heads {

    public Heads(){
        craftDeerHead();
        craftHoglinHead();
        craftZoglinHead();
    }

    private void craftDeerHead(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("deer_head"), CustomDecorMaterial.DEER_HEAD.getItemStack());
        shapedRecipe.shape(
                "BBS",
                " LS",
                "  S"
        );
        shapedRecipe.setIngredient('L', Material.LEATHER);
        shapedRecipe.setIngredient('B', Material.BONE);
        shapedRecipe.setIngredient('S', Material.SPRUCE_LOG);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftHoglinHead(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("hoglin_head"), CustomDecorMaterial.HOGLIN_HEAD.getItemStack());
        shapedRecipe.shape(
                " PS",
                "BBS",
                "  S"
        );
        shapedRecipe.setIngredient('P', Material.PORKCHOP);
        shapedRecipe.setIngredient('B', Material.BONE);
        shapedRecipe.setIngredient('S', Material.SPRUCE_LOG);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftZoglinHead(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("zoglin_head"), CustomDecorMaterial.ZOGLIN_HEAD.getItemStack());
        shapedRecipe.shape(
                " FS",
                "BBS",
                "  S"
        );
        shapedRecipe.setIngredient('F', Material.ROTTEN_FLESH);
        shapedRecipe.setIngredient('B', Material.BONE);
        shapedRecipe.setIngredient('S', Material.SPRUCE_LOG);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
