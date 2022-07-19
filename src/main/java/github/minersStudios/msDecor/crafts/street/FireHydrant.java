package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class FireHydrant {

    public static void addRecipes() {
        Bukkit.addRecipe(craftFireHydrant());
    }

    @Nonnull
    public static ShapedRecipe craftFireHydrant() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.FIRE_HYDRANT;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                " B ",
                " B ",
                "III"
        );
        shapedRecipe.setIngredient('B', Material.IRON_BLOCK);
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        return shapedRecipe;
    }
}
