package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Heads {

    public static void addRecipes() {
        Bukkit.addRecipe(craftDeerHead());
        Bukkit.addRecipe(craftHoglinHead());
        Bukkit.addRecipe(craftZoglinHead());
    }

    @Nonnull
    public static ShapedRecipe craftDeerHead() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DEER_HEAD;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "BBS",
                " LS",
                "  S"
        );
        shapedRecipe.setIngredient('L', Material.LEATHER);
        shapedRecipe.setIngredient('B', Material.BONE);
        shapedRecipe.setIngredient('S', Material.SPRUCE_LOG);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftHoglinHead() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.HOGLIN_HEAD;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                " PS",
                "BBS",
                "  S"
        );
        shapedRecipe.setIngredient('P', Material.PORKCHOP);
        shapedRecipe.setIngredient('B', Material.BONE);
        shapedRecipe.setIngredient('S', Material.SPRUCE_LOG);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftZoglinHead() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ZOGLIN_HEAD;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                " FS",
                "BBS",
                "  S"
        );
        shapedRecipe.setIngredient('F', Material.ROTTEN_FLESH);
        shapedRecipe.setIngredient('B', Material.BONE);
        shapedRecipe.setIngredient('S', Material.SPRUCE_LOG);
        return shapedRecipe;
    }
}
