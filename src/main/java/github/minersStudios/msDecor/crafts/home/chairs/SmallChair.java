package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SmallChair {

    public SmallChair(){
        craftSmallOakChair();
        craftSmallSpruceChair();
        craftSmallBirchChair();
        craftSmallDarkOakChair();
        craftSmallJungleChair();
        craftSmallAcaciaChair();
        craftSmallWarpedChair();
        craftSmallCrimsonChair();
    }

    private static void craftSmallOakChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_oak_chair"), CustomDecorMaterial.OAK_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallSpruceChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_spruce_chair"), CustomDecorMaterial.SPRUCE_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallDarkOakChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_dark_oak_chair"), CustomDecorMaterial.DARK_OAK_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallBirchChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_birch_chair"), CustomDecorMaterial.BIRCH_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallJungleChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_jungle_chair"), CustomDecorMaterial.JUNGLE_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallAcaciaChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_acacia_chair"), CustomDecorMaterial.ACACIA_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallWarpedChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_warped_chair"), CustomDecorMaterial.WARPED_SMALL_CHAIR.getItemStack());
        shapedRecipe.shape(
                "   ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSmallCrimsonChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_crimson_chair"), CustomDecorMaterial.CRIMSON_SMALL_CHAIR.getItemStack());
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
