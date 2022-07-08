package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Nightstand {

    public static void addRecipes(){
        Bukkit.addRecipe(craftAcaciaNightstand());
        Bukkit.addRecipe(craftBirchNightstand());
        Bukkit.addRecipe(craftCrimsonNightstand());
        Bukkit.addRecipe(craftDarkOakNightstand());
        Bukkit.addRecipe(craftJungleNightstand());
        Bukkit.addRecipe(craftOakNightstand());
        Bukkit.addRecipe(craftSpruceNightstand());
        Bukkit.addRecipe(craftWarpedNightstand());
    }

    @Nonnull
    public static ShapedRecipe craftAcaciaNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_nightstand"), CustomDecorMaterial.ACACIA_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftBirchNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_nightstand"), CustomDecorMaterial.BIRCH_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftCrimsonNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_nightstand"), CustomDecorMaterial.CRIMSON_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftDarkOakNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_nightstand"), CustomDecorMaterial.DARK_OAK_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftJungleNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_nightstand"), CustomDecorMaterial.JUNGLE_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftOakNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_nightstand"), CustomDecorMaterial.OAK_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftSpruceNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_nightstand"), CustomDecorMaterial.SPRUCE_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftWarpedNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_nightstand"), CustomDecorMaterial.WARPED_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        return shapedRecipe;
    }
}
