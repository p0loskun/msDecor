package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Armchair {

    public Armchair(){
        craftOakArmchair();
        craftSpruceArmchair();
        craftBirchArmchair();
        craftDarkOakArmchair();
        craftJungleArmchair();
        craftAcaciaArmchair();
        craftWarpedArmchair();
        craftCrimsonArmchair();
    }

    private void craftOakArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_armchair"), CustomDecorMaterial.OAK_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSpruceArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_armchair"), CustomDecorMaterial.SPRUCE_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftDarkOakArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_armchair"), CustomDecorMaterial.DARK_OAK_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftBirchArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_armchair"), CustomDecorMaterial.BIRCH_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftJungleArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_armchair"), CustomDecorMaterial.JUNGLE_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftAcaciaArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_armchair"), CustomDecorMaterial.ACACIA_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftWarpedArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_armchair"), CustomDecorMaterial.WARPED_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftCrimsonArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_armchair"), CustomDecorMaterial.CRIMSON_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
