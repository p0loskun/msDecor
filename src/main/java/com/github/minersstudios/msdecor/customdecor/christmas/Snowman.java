package com.github.minersstudios.msdecor.customdecor.christmas;

import com.github.minersstudios.msdecor.Main;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.SoundGroup;
import com.github.minersstudios.msdecor.customdecor.Typed;
import com.github.minersstudios.msdecor.customdecor.Wrenchable;
import com.github.minersstudios.msdecor.utils.ChatUtils;
import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Locale;

public class Snowman implements Wrenchable {
	private @NotNull NamespacedKey namespacedKey;
	private @NotNull ItemStack itemStack;
	private @NotNull SoundGroup soundGroup;
	private @NotNull HitBox hitBox;
	private @Nullable Facing facing;
	private @Nullable List<Recipe> recipes;

	public Snowman() {
		this.namespacedKey = new NamespacedKey(Main.getInstance(), "snowman");
		this.itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
		this.itemStack.setItemMeta(this.createItemStack(Type.DEFAULT).getItemMeta());
		this.soundGroup = new SoundGroup(
				"block.snow.place", 1.0f, 1.0f,
				"block.snow.break", 1.0f, 1.0f
		);
		this.hitBox = HitBox.NORMAL_ARMOR_STAND;
		ShapedRecipe shapedRecipe = new ShapedRecipe(this.namespacedKey, this.createItemStack(Type.DEFAULT))
				.shape(
						" L ",
						"SBS",
						" B "
				).setIngredient('S', Material.STICK)
				.setIngredient('B', Material.SNOW_BLOCK)
				.setIngredient('L', Material.LEATHER);
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

	@Override
	public Type @NotNull [] getTypes() {
		return Type.types;
	}

	public enum Type implements Typed.Type {
		//<editor-fold desc="Types">
		DEFAULT("Снеговик", 1187),
		BROKEN("Сломаный снеговик", 1188);
		//</editor-fold>

		private final @NotNull NamespacedKey namespacedKey;
		private final @NotNull String itemName;
		private final int customModelData;
		private final @Nullable List<Component> lore;
		private final @NotNull HitBox hitBox;
		private final @Nullable Facing facing;

		private static final Type @NotNull [] types = values();

		Type(
				@NotNull String itemName,
				int customModelData
		) {
			this.namespacedKey = new NamespacedKey(Main.getInstance(), this.name().toLowerCase(Locale.ROOT) + "_snowman");
			this.itemName = itemName;
			this.customModelData = customModelData;
			this.lore = Lists.newArrayList(
					ChatUtils.PAINTABLE_LORE_COMPONENT.get(0),
					ChatUtils.WRENCHABLE_LORE_COMPONENT.get(0)
			);
			this.hitBox = HitBox.NORMAL_ARMOR_STAND;
			this.facing = Facing.FLOOR;
		}

		@Override
		public @NotNull NamespacedKey getNamespacedKey() {
			return this.namespacedKey;
		}

		@Override
		public @NotNull String getItemName() {
			return this.itemName;
		}

		@Override
		public int getCustomModelData() {
			return this.customModelData;
		}

		@Override
		public @Nullable List<Component> getLore() {
			return this.lore;
		}

		@Override
		public @NotNull HitBox getHitBox() {
			return this.hitBox;
		}

		@Override
		public @Nullable Facing getFacing() {
			return this.facing;
		}
	}
}
