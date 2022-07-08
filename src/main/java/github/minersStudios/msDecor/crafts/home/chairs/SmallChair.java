package github.minersStudios.msDecor.crafts.home.chairs;

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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_oak_chair"), CustomDecorMaterial.OAK_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallSpruceChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_spruce_chair"), CustomDecorMaterial.SPRUCE_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallDarkOakChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_dark_oak_chair"), CustomDecorMaterial.DARK_OAK_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallBirchChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_birch_chair"), CustomDecorMaterial.BIRCH_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallJungleChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_jungle_chair"), CustomDecorMaterial.JUNGLE_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallAcaciaChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_acacia_chair"), CustomDecorMaterial.ACACIA_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallWarpedChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_warped_chair"), CustomDecorMaterial.WARPED_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallCrimsonChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_crimson_chair"), CustomDecorMaterial.CRIMSON_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
