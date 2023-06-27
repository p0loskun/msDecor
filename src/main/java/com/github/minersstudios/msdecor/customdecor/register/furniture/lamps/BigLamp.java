package com.github.minersstudios.msdecor.customdecor.register.furniture.lamps;

import com.github.minersstudios.mscore.utils.Badges;
import com.github.minersstudios.mscore.utils.ChatUtils;
import com.github.minersstudios.mscore.utils.MSDecorUtils;
import com.github.minersstudios.msdecor.MSDecor;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.Lightable;
import com.github.minersstudios.msdecor.customdecor.SoundGroup;
import com.google.common.collect.Lists;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BigLamp implements Lightable {
	private @NotNull NamespacedKey namespacedKey;
	private @NotNull ItemStack itemStack;
	private @NotNull SoundGroup soundGroup;
	private @NotNull HitBox hitBox;
	private @Nullable Facing facing;
	private @Nullable List<Recipe> recipes;
	private int firstLightLevel;
	private int secondLightLevel;

	public BigLamp() {
		this.namespacedKey = new NamespacedKey(MSDecor.getInstance(), "big_lamp");
		this.itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
		ItemMeta itemMeta = this.itemStack.getItemMeta();
		itemMeta.setCustomModelData(1151);
		itemMeta.displayName(ChatUtils.createDefaultStyledText("Большая лампа"));
		itemMeta.lore(Badges.PAINTABLE_LORE_LIST);
		itemMeta.getPersistentDataContainer().set(
				MSDecorUtils.CUSTOM_DECOR_TYPE_NAMESPACED_KEY,
				PersistentDataType.STRING,
				this.getNamespacedKey().getKey()
		);
		this.itemStack.setItemMeta(itemMeta);
		this.soundGroup = new SoundGroup(
				"custom.block.wood.place", 1.0f, 1.0f,
				"custom.block.wood.break", 1.0f, 1.0f
		);
		this.hitBox = HitBox.NORMAL_ARMOR_STAND;
		this.facing = Facing.FLOOR;
		this.firstLightLevel = 0;
		this.secondLightLevel = 15;
	}

	@Override
	public @Nullable List<Recipe> initRecipes() {
		ShapedRecipe shapedRecipe = new ShapedRecipe(this.namespacedKey, this.itemStack)
				.shape("L", "S", "S")
				.setIngredient('S', Material.STICK)
				.setIngredient('L', Material.LEATHER);
		this.recipes = Lists.newArrayList(shapedRecipe);
		return this.recipes;
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

	@Override
	public int getFirstLightLevel() {
		return this.firstLightLevel;
	}

	@Override
	public void setFirstLightLevel(int level) {
		this.firstLightLevel = level;
	}

	@Override
	public int getSecondLightLevel() {
		return this.secondLightLevel;
	}

	@Override
	public void setSecondLightLevel(int level) {
		this.secondLightLevel = level;
	}
}
