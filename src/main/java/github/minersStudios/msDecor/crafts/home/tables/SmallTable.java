package github.minersStudios.msDecor.crafts.home.tables;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallTable {

    public static void addRecipes() {
        Bukkit.addRecipe(craftOakSmallTable());
        Bukkit.addRecipe(craftSpruceSmallTable());
        Bukkit.addRecipe(craftBirchSmallTable());
        Bukkit.addRecipe(craftDarkOakSmallTable());
        Bukkit.addRecipe(craftJungleSmallTable());
        Bukkit.addRecipe(craftAcaciaSmallTable());
        Bukkit.addRecipe(craftWarpedSmallTable());
        Bukkit.addRecipe(craftCrimsonSmallTable());
        Bukkit.addRecipe(craftOakPaintableSmallTable());
        Bukkit.addRecipe(craftSprucePaintableSmallTable());
        Bukkit.addRecipe(craftBirchPaintableSmallTable());
        Bukkit.addRecipe(craftDarkOakPaintableSmallTable());
        Bukkit.addRecipe(craftJunglePaintableSmallTable());
        Bukkit.addRecipe(craftAcaciaPaintableSmallTable());
        Bukkit.addRecipe(craftWarpedPaintableSmallTable());
        Bukkit.addRecipe(craftCrimsonPaintableSmallTable());
    }

    @Nonnull
    public static ShapedRecipe craftOakSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_small_table"), CustomDecorMaterial.OAK_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_small_table"), CustomDecorMaterial.SPRUCE_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_small_table"), CustomDecorMaterial.DARK_OAK_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_small_table"), CustomDecorMaterial.BIRCH_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_small_table"), CustomDecorMaterial.JUNGLE_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_small_table"), CustomDecorMaterial.ACACIA_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_small_table"), CustomDecorMaterial.WARPED_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_small_table"), CustomDecorMaterial.CRIMSON_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftOakPaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_paintable_small_table"), CustomDecorMaterial.OAK_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSprucePaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_paintable_small_table"), CustomDecorMaterial.SPRUCE_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakPaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_paintable_small_table"), CustomDecorMaterial.DARK_OAK_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchPaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_paintable_small_table"), CustomDecorMaterial.BIRCH_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJunglePaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_paintable_small_table"), CustomDecorMaterial.JUNGLE_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaPaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_paintable_small_table"), CustomDecorMaterial.ACACIA_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedPaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_paintable_small_table"), CustomDecorMaterial.WARPED_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonPaintableSmallTable() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_paintable_small_table"), CustomDecorMaterial.CRIMSON_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                " L ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
