package github.minersStudios.msDecor.crafts.home.stools;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class SmallArmchair {

    public SmallArmchair(){
        craftSmallOakArmchair();
        craftSmallSpruceArmchair();
        craftSmallBirchArmchair();
        craftSmallDarkOakArmchair();
        craftSmallJungleArmchair();
        craftSmallAcaciaArmchair();
        craftSmallWarpedArmchair();
        craftSmallCrimsonArmchair();
    }

    private void craftSmallOakArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_oak_armchair"), CustomDecorMaterial.OAK_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallSpruceArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_spruce_armchair"), CustomDecorMaterial.SPRUCE_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallDarkOakArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_dark_oak_armchair"), CustomDecorMaterial.DARK_OAK_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallBirchArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_birch_armchair"), CustomDecorMaterial.BIRCH_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallJungleArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_jungle_armchair"), CustomDecorMaterial.JUNGLE_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallAcaciaArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_acacia_armchair"), CustomDecorMaterial.ACACIA_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallWarpedArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_warped_armchair"), CustomDecorMaterial.WARPED_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSmallCrimsonArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("small_crimson_armchair"), CustomDecorMaterial.CRIMSON_SMALL_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "LP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
