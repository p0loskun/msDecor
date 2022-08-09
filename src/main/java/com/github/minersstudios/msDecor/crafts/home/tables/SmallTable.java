package com.github.minersstudios.msDecor.crafts.home.tables;

import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
import com.github.minersstudios.msDecor.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class SmallTable {

	public static void addRecipes() {
		Bukkit.addRecipe(craftOakSmallTable());
		Bukkit.addRecipe(craftSpruceSmallTable());
		Bukkit.addRecipe(craftBirchSmallTable());
		Bukkit.addRecipe(craftDarkOakSmallTable());
		Bukkit.addRecipe(craftJungleSmallTable());
		Bukkit.addRecipe(craftAcaciaSmallTable());
		Bukkit.addRecipe(craftWarpedSmallTable());
		Bukkit.addRecipe(craftCrimsonSmallTable());
		Bukkit.addRecipe(craftMangroveSmallTable());
		Bukkit.addRecipe(craftOakPaintableSmallTable());
		Bukkit.addRecipe(craftSprucePaintableSmallTable());
		Bukkit.addRecipe(craftBirchPaintableSmallTable());
		Bukkit.addRecipe(craftDarkOakPaintableSmallTable());
		Bukkit.addRecipe(craftJunglePaintableSmallTable());
		Bukkit.addRecipe(craftAcaciaPaintableSmallTable());
		Bukkit.addRecipe(craftWarpedPaintableSmallTable());
		Bukkit.addRecipe(craftCrimsonPaintableSmallTable());
		Bukkit.addRecipe(craftMangrovePaintableSmallTable());
	}

	@Nonnull
	public static ShapedRecipe craftOakSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSpruceSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJungleSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangroveSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_SMALL_TABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("PPP", "PAP")
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftOakPaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.OAK_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.OAK_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftSprucePaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.SPRUCE_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.SPRUCE_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftDarkOakPaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.DARK_OAK_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.DARK_OAK_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftBirchPaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIRCH_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.BIRCH_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftJunglePaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.JUNGLE_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.JUNGLE_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftAcaciaPaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.ACACIA_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.ACACIA_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftWarpedPaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.WARPED_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.WARPED_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftCrimsonPaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.CRIMSON_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.CRIMSON_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}

	@Nonnull
	public static ShapedRecipe craftMangrovePaintableSmallTable() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.MANGROVE_SMALL_TABLE_PAINTABLE;
		ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.getInstance(), customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("ALA", "PPP", "PAP")
				.setIngredient('P', Material.MANGROVE_PLANKS)
				.setIngredient('L', Material.LEATHER)
				.setIngredient('A', Material.AIR);
		shapedRecipe.setGroup(Main.getPluginNameInLowerCase() + ":paintable_small_table");
		return shapedRecipe;
	}
}
