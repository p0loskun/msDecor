package github.minersStudios.msDecor.crafts.home;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class Piggybank {

    public static void addRecipes(){
        Bukkit.addRecipe(craftPiggybank());
        Bukkit.addRecipe(craftPiggybankDiamond());
        Bukkit.addRecipe(craftPiggybankEmerald());
        Bukkit.addRecipe(craftPiggybankGold());
        Bukkit.addRecipe(craftPiggybankIron());
        Bukkit.addRecipe(craftPiggybankNetherite());
    }

    @Nonnull
    public static ShapedRecipe craftPiggybank(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank"), CustomDecorMaterial.PIGGYBANK.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.CLAY);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftPiggybankDiamond(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_diamond"), CustomDecorMaterial.PIGGYBANK_DIAMOND.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.DIAMOND_BLOCK);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftPiggybankEmerald(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_emerald"), CustomDecorMaterial.PIGGYBANK_EMERALD.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.EMERALD_BLOCK);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftPiggybankGold(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_gold"), CustomDecorMaterial.PIGGYBANK_GOLD.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.GOLD_BLOCK);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftPiggybankIron(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_iron"), CustomDecorMaterial.PIGGYBANK_IRON.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.IRON_BLOCK);
        return shapedRecipe;
    }

    @Nonnull
    public static ShapedRecipe craftPiggybankNetherite(){
        ShapedRecipe shapedRecipe = new ShapedRecipe(NamespacedKey.minecraft("piggybank_netherite"), CustomDecorMaterial.PIGGYBANK_NETHERITE.getItemStack());
        shapedRecipe.shape(
                "  P",
                "PPP",
                "P P"
        );
        shapedRecipe.setIngredient('P', Material.NETHERITE_BLOCK);
        return shapedRecipe;
    }
}
