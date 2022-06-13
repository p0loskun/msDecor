package github.minersStudios.msDecor.crafts.home.tables;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class BigTable {

    public BigTable(){
        craftOakBigTable();
        craftSpruceBigTable();
        craftBirchBigTable();
        craftDarkOakBigTable();
        craftJungleBigTable();
        craftAcaciaBigTable();
        craftWarpedBigTable();
        craftCrimsonBigTable();
        craftOakPaintableBigTable();
        craftSprucePaintableBigTable();
        craftBirchPaintableBigTable();
        craftDarkOakPaintableBigTable();
        craftJunglePaintableBigTable();
        craftAcaciaPaintableBigTable();
        craftWarpedPaintableBigTable();
        craftCrimsonPaintableBigTable();
    }

    private static void craftOakBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_big_table"), CustomDecorMaterial.OAK_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSpruceBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_big_table"), CustomDecorMaterial.SPRUCE_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftDarkOakBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_big_table"), CustomDecorMaterial.DARK_OAK_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftBirchBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_big_table"), CustomDecorMaterial.BIRCH_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftJungleBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_big_table"), CustomDecorMaterial.JUNGLE_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftAcaciaBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_big_table"), CustomDecorMaterial.ACACIA_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftWarpedBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_big_table"), CustomDecorMaterial.WARPED_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftCrimsonBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_big_table"), CustomDecorMaterial.CRIMSON_BIG_TABLE.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftOakPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_paintable_big_table"), CustomDecorMaterial.OAK_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSprucePaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_paintable_big_table"), CustomDecorMaterial.SPRUCE_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftDarkOakPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_paintable_big_table"), CustomDecorMaterial.DARK_OAK_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftBirchPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_paintable_big_table"), CustomDecorMaterial.BIRCH_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftJunglePaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_paintable_big_table"), CustomDecorMaterial.JUNGLE_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftAcaciaPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_paintable_big_table"), CustomDecorMaterial.ACACIA_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftWarpedPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_paintable_big_table"), CustomDecorMaterial.WARPED_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftCrimsonPaintableBigTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_paintable_big_table"), CustomDecorMaterial.CRIMSON_BIG_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "PLP",
                "P P",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
