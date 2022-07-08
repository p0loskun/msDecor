package github.minersStudios.msDecor.crafts.home.tables;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BigTable {

    public static void addRecipes(){
        Bukkit.addRecipe(craftOakBigTable());
        Bukkit.addRecipe(craftSpruceBigTable());
        Bukkit.addRecipe(craftBirchBigTable());
        Bukkit.addRecipe(craftDarkOakBigTable());
        Bukkit.addRecipe(craftJungleBigTable());
        Bukkit.addRecipe(craftAcaciaBigTable());
        Bukkit.addRecipe(craftWarpedBigTable());
        Bukkit.addRecipe(craftCrimsonBigTable());
        Bukkit.addRecipe(craftOakPaintableBigTable());
        Bukkit.addRecipe(craftSprucePaintableBigTable());
        Bukkit.addRecipe(craftBirchPaintableBigTable());
        Bukkit.addRecipe(craftDarkOakPaintableBigTable());
        Bukkit.addRecipe(craftJunglePaintableBigTable());
        Bukkit.addRecipe(craftAcaciaPaintableBigTable());
        Bukkit.addRecipe(craftWarpedPaintableBigTable());
        Bukkit.addRecipe(craftCrimsonPaintableBigTable());
    }

    @Nonnull
    public static ShapedRecipe craftOakBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_big_table"), CustomDecorMaterial.OAK_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_big_table"), CustomDecorMaterial.SPRUCE_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_big_table"), CustomDecorMaterial.DARK_OAK_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_big_table"), CustomDecorMaterial.BIRCH_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_big_table"), CustomDecorMaterial.JUNGLE_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_big_table"), CustomDecorMaterial.ACACIA_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_big_table"), CustomDecorMaterial.WARPED_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_big_table"), CustomDecorMaterial.CRIMSON_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftOakPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_paintable_big_table"), CustomDecorMaterial.OAK_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSprucePaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_paintable_big_table"), CustomDecorMaterial.SPRUCE_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_paintable_big_table"), CustomDecorMaterial.DARK_OAK_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_paintable_big_table"), CustomDecorMaterial.BIRCH_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJunglePaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_paintable_big_table"), CustomDecorMaterial.JUNGLE_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_paintable_big_table"), CustomDecorMaterial.ACACIA_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_paintable_big_table"), CustomDecorMaterial.WARPED_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_paintable_big_table"), CustomDecorMaterial.CRIMSON_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
