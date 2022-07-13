package github.minersStudios.msDecor.crafts.street.trashcans;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class IronTrashcan {

    public static void addRecipes() {
        Bukkit.addRecipe(craftIronTrashcan());
    }

    @Nonnull
    public static ShapedRecipe craftIronTrashcan() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("iron_trashcan"), CustomDecorMaterial.IRON_TRASHCAN.getItemStack());
        shapedRecipe.shape(
                "III",
                "I I",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        return shapedRecipe;
    }
}
