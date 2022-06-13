package github.minersStudios.msDecor.crafts.halloween;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SkeletonHand {

    public SkeletonHand(){
        craftSkeletonHand();
    }

    private static void craftSkeletonHand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("skeleton_hand"), CustomDecorMaterial.SKELETON_HAND.getItemStack());
        shapedRecipe.shape(
                "BBB",
                "BBB",
                " B "
        );
        shapedRecipe.setIngredient('B', Material.BONE);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
