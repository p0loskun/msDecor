package github.minersStudios.msDecor.crafts.halloween;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SkeletonHand {

    public static void addRecipes() {
        Bukkit.addRecipe(craftSkeletonHand());
    }

    @Nonnull
    public static ShapedRecipe craftSkeletonHand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SKELETON_HAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "BBB",
                "BBB",
                " B "
        );
        shapedRecipe.setIngredient('B', Material.BONE);
        return shapedRecipe;
    }
}
