package com.github.minersstudios.msdecor.customdecor;

import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("unused")
public interface CustomDecorData extends Cloneable {
	@NotNull
	NamespacedKey getNamespacedKey();

	void setNamespacedKey(@NotNull NamespacedKey namespacedKey);

	@NotNull
	ItemStack getItemStack();

	void setItemStack(@NotNull ItemStack itemStack);

	@Nullable
	default SoundGroup getSoundGroup() {
		return null;
	}

	default void setSoundGroup(@Nullable SoundGroup soundGroup) {}

	@NotNull
	HitBox getHitBox();

	void setHitBox(@NotNull HitBox hitBox);

	@Nullable
	default Facing getFacing() {
		return null;
	}

	default void setFacing(@Nullable Facing facing) {}

	default @Nullable List<Recipe> getRecipes() {
		return null;
	}

	default void setRecipes(@Nullable List<Recipe> recipes) {}

	default boolean isShowInCraftsMenu() {
		return true;
	}

	default void setShowInCraftsMenu(boolean showInCraftsMenu) {}

	default void register() {
		CustomDecorUtils.CUSTOM_DECORS.put(this.getNamespacedKey().getKey(), this);
		List<Recipe> recipes = this.getRecipes();
		if (recipes == null) return;
		for (Recipe recipe : recipes) {
			Bukkit.addRecipe(recipe);
		}
	}

	@Contract("null -> false")
	default boolean isSimilar(@Nullable ItemStack itemStack) {
		if (
				itemStack == null
				|| itemStack.getType() != this.getItemStack().getType()
				|| !itemStack.hasItemMeta()
				|| !itemStack.getItemMeta().hasCustomModelData()
				|| !this.getItemStack().getItemMeta().hasCustomModelData()
		) return false;
		return itemStack.getItemMeta().getCustomModelData() == this.getItemStack().getItemMeta().getCustomModelData();
	}

	CustomDecorData clone();

	enum Facing {
		CEILING, FLOOR, WALL
	}

	enum HitBox {
		FRAME,
		SOLID_FRAME,
		STRUCTURE_FRAME,
		SMALL_ARMOR_STAND,
		STRUCTURE_SMALL_ARMOR_STAND,
		SOLID_SMALL_ARMOR_STAND,
		NORMAL_ARMOR_STAND,
		SOLID_NORMAL_ARMOR_STAND,
		STRUCTURE_NORMAL_ARMOR_STAND;

		/**
		 * @return True if hitbox of custom decor is barrier
		 */
		public boolean isSolidHitBox() {
			return switch (this) {
				case SOLID_FRAME,
						SOLID_SMALL_ARMOR_STAND,
						SOLID_NORMAL_ARMOR_STAND -> true;
				default -> false;
			};
		}

		/**
		 * @return True if hitbox of custom decor is structure void
		 */
		public boolean isStructureHitBox() {
			return switch (this) {
				case STRUCTURE_FRAME,
						STRUCTURE_SMALL_ARMOR_STAND,
						STRUCTURE_NORMAL_ARMOR_STAND -> true;
				default -> false;
			};
		}

		/**
		 * @return True if hitbox of custom decor is armor stand
		 */
		public boolean isArmorStand() {
			return switch (this) {
				case SOLID_SMALL_ARMOR_STAND,
						SOLID_NORMAL_ARMOR_STAND,
						NORMAL_ARMOR_STAND,
						SMALL_ARMOR_STAND,
						STRUCTURE_NORMAL_ARMOR_STAND,
						STRUCTURE_SMALL_ARMOR_STAND -> true;
				default -> false;
			};
		}
	}
}
