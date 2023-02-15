package com.github.minersstudios.msdecor.customdecor;

import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import com.google.common.collect.Lists;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.block.BlockFace;
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

	@NotNull SoundGroup getSoundGroup();

	void setSoundGroup(@NotNull SoundGroup soundGroup);

	@NotNull HitBox getHitBox();

	void setHitBox(@NotNull HitBox hitBox);

	@Nullable Facing getFacing();

	void setFacing(@Nullable Facing facing);

	default @Nullable List<Recipe> getRecipes() {
		return null;
	}

	default void setRecipes(@Nullable List<Recipe> recipes) {}

	default boolean isShowInCraftsMenu() {
		return true;
	}

	default void setShowInCraftsMenu(boolean showInCraftsMenu) {}

	default void register() {
		this.register(true);
	}

	default void register(boolean regRecipes) {
		if (this instanceof FullTyped fullTyped) {
			for (Typed.Type type : fullTyped.getTypes()) {
				CustomDecorUtils.CUSTOM_DECORS.put(type.getNamespacedKey().getKey(), fullTyped.createCustomDecorData(type));
			}
		} else {
			CustomDecorUtils.CUSTOM_DECORS.put(this.getNamespacedKey().getKey(), this);
		}
		if (regRecipes) {
			List<Recipe> recipes = this.getRecipes();
			if (recipes != null) {
				for (Recipe recipe : recipes) {
					Bukkit.addRecipe(recipe);
				}
				if (isShowInCraftsMenu()) {
					CustomDecorUtils.CUSTOM_DECOR_RECIPES.addAll(recipes);
				}
			}
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
		CEILING(Lists.newArrayList(BlockFace.DOWN)),
		FLOOR(Lists.newArrayList(BlockFace.UP)),
		WALL(Lists.newArrayList(BlockFace.WEST, BlockFace.EAST, BlockFace.NORTH, BlockFace.SOUTH));

		private final List<BlockFace> blockFaces;

		Facing(@NotNull List<BlockFace> blockFaces) {
			this.blockFaces = blockFaces;
		}

		@Contract("null -> false")
		public boolean hasFace(@Nullable BlockFace blockFace) {
			if (blockFace == null) return false;
			return this.blockFaces.contains(blockFace);
		}
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
		 * @return True if hit-box of custom decor is barrier
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
		 * @return True if hit-box of custom decor is structure void
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
		 * @return True if hit-box of custom decor is armor stand
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
