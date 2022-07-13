package github.minersStudios.msDecor.crafts.home.chairs;

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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_oak_armchair"), CustomDecorMaterial.OAK_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_spruce_armchair"), CustomDecorMaterial.SPRUCE_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_dark_oak_armchair"), CustomDecorMaterial.DARK_OAK_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_birch_armchair"), CustomDecorMaterial.BIRCH_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_jungle_armchair"), CustomDecorMaterial.JUNGLE_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_acacia_armchair"), CustomDecorMaterial.ACACIA_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_warped_armchair"), CustomDecorMaterial.WARPED_SMALL_ARMCHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_crimson_armchair"), CustomDecorMaterial.CRIMSON_SMALL_ARMCHAIR.getItemStack());
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
