package github.minersStudios.msDecor.crafts.home.tables;

import github.minersStudios.msDecor.Main;
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_TABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_TABLE_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
