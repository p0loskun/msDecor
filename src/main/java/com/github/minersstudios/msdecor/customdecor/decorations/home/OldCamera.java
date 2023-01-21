package com.github.minersstudios.msdecor.customdecor.decorations.home;

import com.github.minersstudios.msdecor.Main;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.SoundGroup;
import com.github.minersstudios.msdecor.utils.ChatUtils;
import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OldCamera implements CustomDecorData {
	private @NotNull NamespacedKey namespacedKey;
	private @NotNull ItemStack itemStack;
	private @NotNull SoundGroup soundGroup;
	private @NotNull HitBox hitBox;
	private @Nullable Facing facing;
	private @Nullable List<Recipe> recipes;

	public OldCamera() {
		this.namespacedKey = new NamespacedKey(Main.getInstance(), "old_camera");
		this.itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
		ItemMeta itemMeta = this.itemStack.getItemMeta();
		itemMeta.setCustomModelData(1150);
		itemMeta.displayName(ChatUtils.createDefaultStyledName("Камера"));
		this.itemStack.setItemMeta(itemMeta);
		this.soundGroup = new SoundGroup(
				"custom.block.wood.place", 1.0f, 1.0f,
				"custom.block.wood.break", 1.0f, 1.0f
		);
		this.hitBox = HitBox.NORMAL_ARMOR_STAND;
		this.facing = Facing.FLOOR;
		ShapedRecipe shapedRecipe = new ShapedRecipe(this.namespacedKey, this.itemStack)
				.shape(
						" I ",
						" S ",
						"S S"
				)
				.setIngredient('S', Material.STICK)
				.setIngredient('I', Material.IRON_INGOT);
		this.recipes = Lists.newArrayList(shapedRecipe);
	}

	@Override
	public @NotNull NamespacedKey getNamespacedKey() {
		return this.namespacedKey;
	}

	@Override
	public void setNamespacedKey(@NotNull NamespacedKey namespacedKey) {
		this.namespacedKey = namespacedKey;
	}

	@Override
	public @NotNull ItemStack getItemStack() {
		return this.itemStack;
	}

	@Override
	public void setItemStack(@NotNull ItemStack itemStack) {
		this.itemStack = itemStack;
	}

	@Override
	public @NotNull SoundGroup getSoundGroup() {
		return this.soundGroup;
	}

	@Override
	public void setSoundGroup(@NotNull SoundGroup soundGroup) {
		this.soundGroup = soundGroup;
	}

	@Override
	public @NotNull HitBox getHitBox() {
		return this.hitBox;
	}

	@Override
	public void setHitBox(@NotNull HitBox hitBox) {
		this.hitBox = hitBox;
	}

	@Override
	public @Nullable Facing getFacing() {
		return this.facing;
	}

	@Override
	public void setFacing(@Nullable Facing facing) {
		this.facing = facing;
	}

	@Override
	public @Nullable List<Recipe> getRecipes() {
		return this.recipes;
	}

	@Override
	public void setRecipes(@Nullable List<Recipe> recipes) {
		this.recipes = recipes;
	}

	@Override
	public @NotNull CustomDecorData clone() {
		try {
			return (CustomDecorData) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException(e);
		}
	}
}
