package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class RockingChair {

    public static void addRecipes() {
        Bukkit.addRecipe(craftOakRockingChair());
        Bukkit.addRecipe(craftSpruceRockingChair());
        Bukkit.addRecipe(craftBirchRockingChair());
        Bukkit.addRecipe(craftDarkOakRockingChair());
        Bukkit.addRecipe(craftJungleRockingChair());
        Bukkit.addRecipe(craftAcaciaRockingChair());
        Bukkit.addRecipe(craftWarpedRockingChair());
        Bukkit.addRecipe(craftCrimsonRockingChair());
        Bukkit.addRecipe(craftOakPaintableRockingChair());
        Bukkit.addRecipe(craftSprucePaintableRockingChair());
        Bukkit.addRecipe(craftBirchPaintableRockingChair());
        Bukkit.addRecipe(craftDarkOakPaintableRockingChair());
        Bukkit.addRecipe(craftJunglePaintableRockingChair());
        Bukkit.addRecipe(craftAcaciaPaintableRockingChair());
        Bukkit.addRecipe(craftWarpedPaintableRockingChair());
        Bukkit.addRecipe(craftCrimsonPaintableRockingChair());
    }

    @Nonnull
    public static ShapedRecipe craftOakRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftOakPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSprucePaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJunglePaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}
