package com.github.minersstudios.msdecor.utils;

import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.Typed;
import com.github.minersstudios.msdecor.customdecor.decorations.SmallChair;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public final class CustomDecorUtils {
	public static final Map<String, CustomDecorData> CUSTOM_DECORS = new HashMap<>();

	private CustomDecorUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static void registerCustomDecors() {
		new SmallChair().register();
	}

	@Contract("null -> null")
	public static @Nullable CustomDecorData getCustomDecorDataByItem(@Nullable ItemStack itemStack) {
		for (CustomDecorData customDecorData : CUSTOM_DECORS.values()) {
			if (customDecorData.isSimilar(itemStack)) {
				return customDecorData;
			}
			if (customDecorData instanceof Typed typed) {
				Typed.Type type = typed.getType(itemStack);
				if (type != null) {
					return typed.createCustomDecorData(type);
				}
			}
		}
		return null;
	}

	@Contract("null -> null")
	public static @Nullable CustomDecorData getCustomDecorDataByEntity(@Nullable Entity entity) {
		if (entity instanceof ArmorStand armorStand) {
			return getCustomDecorDataByItem(armorStand.getEquipment().getHelmet());
		} else if (entity instanceof ItemFrame itemFrame) {
			return getCustomDecorDataByItem(itemFrame.getItem());
		}
		return null;
	}
}
