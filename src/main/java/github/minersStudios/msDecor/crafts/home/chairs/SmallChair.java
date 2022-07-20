package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

import static github.minersStudios.msDecor.Main.pluginNameInLowerCase;

public class SmallChair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftSmallOakChair());
        Bukkit.addRecipe(craftSmallSpruceChair());
        Bukkit.addRecipe(craftSmallBirchChair());
        Bukkit.addRecipe(craftSmallDarkOakChair());
        Bukkit.addRecipe(craftSmallJungleChair());
        Bukkit.addRecipe(craftSmallAcaciaChair());
        Bukkit.addRecipe(craftSmallWarpedChair());
        Bukkit.addRecipe(craftSmallCrimsonChair());
        Bukkit.addRecipe(craftSmallMangroveChair());
    }

    @Nonnull
    public static ShapedRecipe craftSmallOakChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.OAK_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallSpruceChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.SPRUCE_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallDarkOakChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.DARK_OAK_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallBirchChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.BIRCH_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallJungleChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.JUNGLE_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallAcaciaChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.ACACIA_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallWarpedChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.WARPED_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallCrimsonChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.CRIMSON_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSmallMangroveChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_SMALL_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape("PLP", "PAP")
                .setIngredient('P', Material.MANGROVE_PLANKS)
                .setIngredient('L', Material.LEATHER)
                .setIngredient('A', Material.AIR);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":small_chair");
        return shapedRecipe;
    }
}
