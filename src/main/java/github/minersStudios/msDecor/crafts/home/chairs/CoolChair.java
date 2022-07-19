package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class CoolChair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftCoolChair());
    }

    @Nonnull
    public static ShapedRecipe craftCoolChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.COOL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "LLL",
                "I I"
        );
        shapedRecipe.setIngredient('I', Material.IRON_NUGGET);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
