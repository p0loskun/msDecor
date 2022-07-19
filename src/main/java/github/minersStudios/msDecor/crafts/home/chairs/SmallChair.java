package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallChair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftSmallOakChair());
        Bukkit.addRecipe(craftSmallSpruceChair());
        Bukkit.addRecipe(craftSmallBirchChair());
        Bukkit.addRecipe(craftSmallDarkOakChair());
        Bukkit.addRecipe(craftSmallJungleChair());
        Bukkit.addRecipe(craftSmallAcaciaChair());
        Bukkit.addRecipe(craftSmallWarpedChair());
        Bukkit.addRecipe(craftSmallCrimsonChair());
    }

    @Nonnull
    public static ShapedRecipe craftSmallOakChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallSpruceChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallDarkOakChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallBirchChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallJungleChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallAcaciaChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallWarpedChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallCrimsonChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
