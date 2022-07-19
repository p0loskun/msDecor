package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Nightstand {

    public static void addRecipes() {
        Bukkit.addRecipe(craftAcaciaNightstand());
        Bukkit.addRecipe(craftBirchNightstand());
        Bukkit.addRecipe(craftCrimsonNightstand());
        Bukkit.addRecipe(craftDarkOakNightstand());
        Bukkit.addRecipe(craftJungleNightstand());
        Bukkit.addRecipe(craftOakNightstand());
        Bukkit.addRecipe(craftSpruceNightstand());
        Bukkit.addRecipe(craftWarpedNightstand());
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftOakNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedNightstand() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_NIGHTSTAND;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        return shapedRecipe;
    }
}
