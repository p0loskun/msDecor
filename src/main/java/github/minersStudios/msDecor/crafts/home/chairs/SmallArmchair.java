package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallArmchair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftSmallOakArmchair());
        Bukkit.addRecipe(craftSmallSpruceArmchair());
        Bukkit.addRecipe(craftSmallBirchArmchair());
        Bukkit.addRecipe(craftSmallDarkOakArmchair());
        Bukkit.addRecipe(craftSmallJungleArmchair());
        Bukkit.addRecipe(craftSmallAcaciaArmchair());
        Bukkit.addRecipe(craftSmallWarpedArmchair());
        Bukkit.addRecipe(craftSmallCrimsonArmchair());
    }

    @Nonnull
    public static ShapedRecipe craftSmallOakArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallSpruceArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallDarkOakArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallBirchArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallJungleArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallAcaciaArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallWarpedArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallCrimsonArmchair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_ARMCHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
