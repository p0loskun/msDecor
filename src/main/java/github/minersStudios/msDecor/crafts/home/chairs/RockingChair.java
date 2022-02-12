package github.minersStudios.msDecor.crafts.home.chairs;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class RockingChair {

    public RockingChair(){
        craftOakRockingChair();
        craftSpruceRockingChair();
        craftBirchRockingChair();
        craftDarkOakRockingChair();
        craftJungleRockingChair();
        craftAcaciaRockingChair();
        craftWarpedRockingChair();
        craftCrimsonRockingChair();
        craftOakPaintableRockingChair();
        craftSprucePaintableRockingChair();
        craftBirchPaintableRockingChair();
        craftDarkOakPaintableRockingChair();
        craftJunglePaintableRockingChair();
        craftAcaciaPaintableRockingChair();
        craftWarpedPaintableRockingChair();
        craftCrimsonPaintableRockingChair();
    }

    private void craftOakRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_rocking_chair"), CustomDecorMaterial.OAK_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSpruceRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_rocking_chair"), CustomDecorMaterial.SPRUCE_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftDarkOakRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_rocking_chair"), CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftBirchRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_rocking_chair"), CustomDecorMaterial.BIRCH_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftJungleRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_rocking_chair"), CustomDecorMaterial.JUNGLE_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftAcaciaRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_rocking_chair"), CustomDecorMaterial.ACACIA_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftWarpedRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_rocking_chair"), CustomDecorMaterial.WARPED_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftCrimsonRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_rocking_chair"), CustomDecorMaterial.CRIMSON_ROCKING_CHAIR.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PPP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftOakPaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("oak_paintable_rocking_chair"), CustomDecorMaterial.OAK_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P', Material.OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftSprucePaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("spruce_paintable_rocking_chair"), CustomDecorMaterial.SPRUCE_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.SPRUCE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftDarkOakPaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("dark_oak_paintable_rocking_chair"), CustomDecorMaterial.DARK_OAK_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.DARK_OAK_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftBirchPaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("birch_paintable_rocking_chair"), CustomDecorMaterial.BIRCH_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.BIRCH_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftJunglePaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("jungle_paintable_rocking_chair"), CustomDecorMaterial.JUNGLE_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.JUNGLE_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftAcaciaPaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("acacia_paintable_rocking_chair"), CustomDecorMaterial.ACACIA_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.ACACIA_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftWarpedPaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("warped_paintable_rocking_chair"), CustomDecorMaterial.WARPED_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.WARPED_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftCrimsonPaintableRockingChair(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("crimson_paintable_rocking_chair"), CustomDecorMaterial.CRIMSON_ROCKING_CHAIR_PAINTABLE.getItemStack());
        shapedRecipe.shape(
                "P  ",
                "PLP",
                "PPP"
        );
        shapedRecipe.setIngredient('P',Material.CRIMSON_PLANKS);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
