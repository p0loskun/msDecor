package github.minersStudios.msDecor.crafts.home.chairs;

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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_rocking_chair"), CustomDecorMaterial.OAK_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_rocking_chair"), CustomDecorMaterial.SPRUCE_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_rocking_chair"), CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_rocking_chair"), CustomDecorMaterial.BIRCH_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_rocking_chair"), CustomDecorMaterial.JUNGLE_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_rocking_chair"), CustomDecorMaterial.ACACIA_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_rocking_chair"), CustomDecorMaterial.WARPED_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_rocking_chair"), CustomDecorMaterial.CRIMSON_ROCKING_CHAIR.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_paintable_rocking_chair"), CustomDecorMaterial.OAK_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_paintable_rocking_chair"), CustomDecorMaterial.SPRUCE_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_paintable_rocking_chair"), CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_paintable_rocking_chair"), CustomDecorMaterial.BIRCH_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_paintable_rocking_chair"), CustomDecorMaterial.JUNGLE_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_paintable_rocking_chair"), CustomDecorMaterial.ACACIA_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_paintable_rocking_chair"), CustomDecorMaterial.WARPED_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_paintable_rocking_chair"), CustomDecorMaterial.CRIMSON_ROCKING_CHAIR_PAINTABLE.getItemStack());
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
