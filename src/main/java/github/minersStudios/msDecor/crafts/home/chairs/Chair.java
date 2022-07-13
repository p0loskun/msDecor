package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Chair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftOakChair());
        Bukkit.addRecipe(craftSpruceChair());
        Bukkit.addRecipe(craftBirchChair());
        Bukkit.addRecipe(craftDarkOakChair());
        Bukkit.addRecipe(craftJungleChair());
        Bukkit.addRecipe(craftAcaciaChair());
        Bukkit.addRecipe(craftWarpedChair());
        Bukkit.addRecipe(craftCrimsonChair());
    }

    @Nonnull
    public static ShapedRecipe craftOakChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_chair"), CustomDecorMaterial.OAK_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_chair"), CustomDecorMaterial.SPRUCE_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_chair"), CustomDecorMaterial.DARK_OAK_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_chair"), CustomDecorMaterial.BIRCH_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_chair"), CustomDecorMaterial.JUNGLE_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_chair"), CustomDecorMaterial.ACACIA_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_chair"), CustomDecorMaterial.WARPED_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonChair() {
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_chair"), CustomDecorMaterial.CRIMSON_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
