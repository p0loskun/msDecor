package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

import static github.minersStudios.msDecor.Main.plugin;
import static github.minersStudios.msDecor.Main.pluginNameInLowerCase;

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
        Bukkit.addRecipe(craftMangroveRockingChair());
        Bukkit.addRecipe(craftOakPaintableRockingChair());
        Bukkit.addRecipe(craftSprucePaintableRockingChair());
        Bukkit.addRecipe(craftBirchPaintableRockingChair());
        Bukkit.addRecipe(craftDarkOakPaintableRockingChair());
        Bukkit.addRecipe(craftJunglePaintableRockingChair());
        Bukkit.addRecipe(craftAcaciaPaintableRockingChair());
        Bukkit.addRecipe(craftWarpedPaintableRockingChair());
        Bukkit.addRecipe(craftCrimsonPaintableRockingChair());
        Bukkit.addRecipe(craftMangrovePaintableRockingChair());
    }

    @Nonnull
    public static ShapedRecipe craftOakRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.SPRUCE_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.DARK_OAK_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.BIRCH_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.JUNGLE_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.ACACIA_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.WARPED_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.CRIMSON_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftMangroveRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_ROCKING_CHAIR;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PPP",
                        "PPP"
                )
                .setIngredient('P', Material.MANGROVE_PLANKS);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftOakPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.OAK_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSprucePaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.SPRUCE_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.DARK_OAK_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.BIRCH_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJunglePaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.JUNGLE_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.ACACIA_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.WARPED_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonPaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.CRIMSON_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftMangrovePaintableRockingChair() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_ROCKING_CHAIR_PAINTABLE;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
                .shape(
                        "P  ",
                        "PLP",
                        "PPP"
                )
                .setIngredient('P', Material.MANGROVE_PLANKS)
                .setIngredient('L', Material.LEATHER);
        shapedRecipe.setGroup(pluginNameInLowerCase + ":paintable_rocking_chair");
        return shapedRecipe;
    }
}
