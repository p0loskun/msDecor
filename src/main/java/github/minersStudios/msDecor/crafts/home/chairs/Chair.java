package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Chair {

    public Chair(){
        craftOakChair();
        craftSpruceChair();
        craftBirchChair();
        craftDarkOakChair();
        craftJungleChair();
        craftAcaciaChair();
        craftWarpedChair();
        craftCrimsonChair();
    }

    private static void craftOakChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_chair"), CustomDecorMaterial.OAK_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftSpruceChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_chair"), CustomDecorMaterial.SPRUCE_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftDarkOakChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_chair"), CustomDecorMaterial.DARK_OAK_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftBirchChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_chair"), CustomDecorMaterial.BIRCH_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftJungleChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_chair"), CustomDecorMaterial.JUNGLE_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftAcaciaChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_chair"), CustomDecorMaterial.ACACIA_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftWarpedChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_chair"), CustomDecorMaterial.WARPED_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private static void craftCrimsonChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_chair"), CustomDecorMaterial.CRIMSON_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
