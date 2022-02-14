package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import static github.minersStudios.msDecor.Main.plugin;

public class Piggybank {

    public Piggybank(){
        craftPiggybank();
        craftPiggybankDiamond();
        craftPiggybankEmerald();
        craftPiggybankGold();
        craftPiggybankIron();
        craftPiggybankNetherite();
    }

    private void craftPiggybank(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank"), CustomDecorMaterial.PIGGYBANK.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CLAY);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftPiggybankDiamond(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_diamond"), CustomDecorMaterial.PIGGYBANK_DIAMOND.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DIAMOND_BLOCK);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftPiggybankEmerald(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_emerald"), CustomDecorMaterial.PIGGYBANK_EMERALD.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.EMERALD_BLOCK);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftPiggybankGold(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_gold"), CustomDecorMaterial.PIGGYBANK_GOLD.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.GOLD_BLOCK);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftPiggybankIron(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_iron"), CustomDecorMaterial.PIGGYBANK_IRON.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.IRON_BLOCK);
        plugin.getServer().addRecipe(shapedRecipe);
    }

    private void craftPiggybankNetherite(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_netherite"), CustomDecorMaterial.PIGGYBANK_NETHERITE.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.NETHERITE_BLOCK);
        plugin.getServer().addRecipe(shapedRecipe);
    }
}
