package github.minersStudios.msDecor.crafts.halloween;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SkeletonHand {

    public static void addRecipes(){
        Bukkit.addRecipe(craftSkeletonHand());
    }

    @Nonnull
    public static ShapedRecipe craftSkeletonHand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("skeleton_hand"), CustomDecorMaterial.SKELETON_HAND.getItemStack());
        shapedRecipe.shape(
                "BBB",
                "BBB",
                " B "
        );
        shapedRecipe.setIngredient('B', Material.BONE);
        return shapedRecipe;
    }
}
