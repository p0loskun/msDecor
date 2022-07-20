package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class CookingPot {

    public static void addRecipes() {
        Bukkit.addRecipe(craftCookingPot());
    }

    @Nonnull
    public static ShapedRecipe craftCookingPot() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.COOKING_POT;
        return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("ISI", "III")
                .setIngredient('I', Material.IRON_INGOT)
                .setIngredient('S', Material.STICK);
    }
}
