package github.minersStudios.msDecor.crafts.home.tables;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SmallTable {

    public SmallTable(){
        craftOakSmallTable();
        craftSpruceSmallTable();
        craftBirchSmallTable();
        craftDarkOakSmallTable();
        craftJungleSmallTable();
        craftAcaciaSmallTable();
        craftWarpedSmallTable();
        craftCrimsonSmallTable();
        craftOakPaintableSmallTable();
        craftSprucePaintableSmallTable();
        craftBirchPaintableSmallTable();
        craftDarkOakPaintableSmallTable();
        craftJunglePaintableSmallTable();
        craftAcaciaPaintableSmallTable();
        craftWarpedPaintableSmallTable();
        craftCrimsonPaintableSmallTable();
    }

    private void craftOakSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_small_table"), CustomDecorMaterial.OAK_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSpruceSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_small_table"), CustomDecorMaterial.SPRUCE_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftDarkOakSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_small_table"), CustomDecorMaterial.DARK_OAK_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftBirchSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_small_table"), CustomDecorMaterial.BIRCH_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftJungleSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_small_table"), CustomDecorMaterial.JUNGLE_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftAcaciaSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_small_table"), CustomDecorMaterial.ACACIA_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftWarpedSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_small_table"), CustomDecorMaterial.WARPED_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftCrimsonSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_small_table"), CustomDecorMaterial.CRIMSON_SMALL_TABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftOakPaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_paintable_small_table"), CustomDecorMaterial.OAK_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSprucePaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_paintable_small_table"), CustomDecorMaterial.SPRUCE_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftDarkOakPaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_paintable_small_table"), CustomDecorMaterial.DARK_OAK_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftBirchPaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_paintable_small_table"), CustomDecorMaterial.BIRCH_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftJunglePaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_paintable_small_table"), CustomDecorMaterial.JUNGLE_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftAcaciaPaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_paintable_small_table"), CustomDecorMaterial.ACACIA_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftWarpedPaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_paintable_small_table"), CustomDecorMaterial.WARPED_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftCrimsonPaintableSmallTable(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_paintable_small_table"), CustomDecorMaterial.CRIMSON_SMALL_TABLE_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
