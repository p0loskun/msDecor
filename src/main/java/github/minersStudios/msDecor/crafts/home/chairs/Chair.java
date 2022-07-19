package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.Main;
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
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
