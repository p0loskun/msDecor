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
        return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        " B ",
                        " B ",
                        "III"
                )
                .setIngredient('B', Material.IRON_BLOCK)
                .setIngredient('I', Material.IRON_INGOT);
    }
}
