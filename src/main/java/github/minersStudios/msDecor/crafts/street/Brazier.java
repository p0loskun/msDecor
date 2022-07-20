package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Brazier {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBrazier());
    }

    @Nonnull
    public static ShapedRecipe craftBrazier() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BRAZIER;
        return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "B B",
                        "BBB",
                        " I "
                )
                .setIngredient('B', Material.IRON_BARS)
                .setIngredient('I', Material.IRON_INGOT);
    }
}
