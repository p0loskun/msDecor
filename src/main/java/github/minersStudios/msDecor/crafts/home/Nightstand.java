package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Nightstand {

    public Nightstand(){
        craftAcaciaNightstand();
        craftBirchNightstand();
        craftCrimsonNightstand();
        craftDarkOakNightstand();
        craftJungleNightstand();
        craftOakNightstand();
        craftSpruceNightstand();
        craftWarpedNightstand();
    }

    private void craftAcaciaNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_nightstand"), CustomDecorMaterial.ACACIA_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.ACACIA_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftBirchNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_nightstand"), CustomDecorMaterial.BIRCH_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.BIRCH_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftCrimsonNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_nightstand"), CustomDecorMaterial.CRIMSON_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CRIMSON_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftDarkOakNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_nightstand"), CustomDecorMaterial.DARK_OAK_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DARK_OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftJungleNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_nightstand"), CustomDecorMaterial.JUNGLE_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.JUNGLE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftOakNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_nightstand"), CustomDecorMaterial.OAK_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSpruceNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_nightstand"), CustomDecorMaterial.SPRUCE_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.SPRUCE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftWarpedNightstand(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_nightstand"), CustomDecorMaterial.WARPED_NIGHTSTAND.getItemStack());
        shapedRecipe.shape(
                "PPP",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.WARPED_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
