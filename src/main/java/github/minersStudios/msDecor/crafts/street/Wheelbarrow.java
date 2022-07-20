package github.minersStudios.msDecor.crafts.street;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Wheelbarrow {

    public static void addRecipes() {
        Bukkit.addRecipe(craftWheelbarrow());
    }

    @Nonnull
    public static ShapedRecipe craftWheelbarrow() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WHEELBARROW;
        return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "S S",
                        " C ",
                        " I "
                )
                .setIngredient('S', Material.STICK)
                .setIngredient('I', Material.IRON_INGOT)
                .setIngredient('C', Material.CAULDRON);
    }
}
