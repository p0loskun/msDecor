package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Armchair {

    public static void addRecipes(){
        Bukkit.addRecipe(craftOakArmchair());
        Bukkit.addRecipe(craftSpruceArmchair());
        Bukkit.addRecipe(craftBirchArmchair());
        Bukkit.addRecipe(craftDarkOakArmchair());
        Bukkit.addRecipe(craftJungleArmchair());
        Bukkit.addRecipe(craftAcaciaArmchair());
        Bukkit.addRecipe(craftWarpedArmchair());
        Bukkit.addRecipe(craftCrimsonArmchair());
    }

    @Nonnull
    public static ShapedRecipe craftOakArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_armchair"), CustomDecorMaterial.OAK_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_armchair"), CustomDecorMaterial.SPRUCE_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_armchair"), CustomDecorMaterial.DARK_OAK_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_armchair"), CustomDecorMaterial.BIRCH_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_armchair"), CustomDecorMaterial.JUNGLE_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_armchair"), CustomDecorMaterial.ACACIA_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_armchair"), CustomDecorMaterial.WARPED_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonArmchair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_armchair"), CustomDecorMaterial.CRIMSON_ARMCHAIR.getItemStack());
        shapedRecipe.shape(
                "PP ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
