package com.github.minersstudios.msdecor.utils;

import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.Typed;
import com.github.minersstudios.msdecor.customdecor.christmas.Ball;
import com.github.minersstudios.msdecor.customdecor.christmas.SantaSock;
import com.github.minersstudios.msdecor.customdecor.christmas.Snowman;
import com.github.minersstudios.msdecor.customdecor.decorations.home.*;
import com.github.minersstudios.msdecor.customdecor.decorations.home.heads.DeerHead;
import com.github.minersstudios.msdecor.customdecor.decorations.home.heads.HoglinHead;
import com.github.minersstudios.msdecor.customdecor.decorations.home.heads.ZoglinHead;
import com.github.minersstudios.msdecor.customdecor.decorations.home.plushes.BMOPlush;
import com.github.minersstudios.msdecor.customdecor.decorations.home.plushes.BrownBearPlush;
import com.github.minersstudios.msdecor.customdecor.decorations.home.plushes.RacoonPlush;
import com.github.minersstudios.msdecor.customdecor.decorations.street.*;
import com.github.minersstudios.msdecor.customdecor.furniture.chairs.*;
import com.github.minersstudios.msdecor.customdecor.furniture.lamps.BigLamp;
import com.github.minersstudios.msdecor.customdecor.furniture.lamps.SmallLamp;
import com.github.minersstudios.msdecor.customdecor.furniture.nightstand.*;
import com.github.minersstudios.msdecor.customdecor.furniture.tables.BigTable;
import com.github.minersstudios.msdecor.customdecor.furniture.tables.SmallTable;
import com.github.minersstudios.msdecor.customdecor.halloween.SkeletonHand;
import com.github.minersstudios.msdecor.customdecor.other.Poop;
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

	public static final boolean isChristmas = true;
	public static final boolean isHalloween = false;

	private CustomDecorUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static void registerCustomDecors() {
		//<editor-fold desc="Custom decors">
		new Ball().register(isChristmas);
		new SantaSock().register(isChristmas);
		new Snowman().register(isChristmas);

		new DeerHead().register();
		new HoglinHead().register();
		new ZoglinHead().register();

		new BMOPlush().register();
		new BrownBearPlush().register();
		new RacoonPlush().register();

		new Cell().register();
		new CookingPot().register();
		new OldCamera().register();
		new Patefon().register();
		new Piggybank().register();
		new SmallClock().register();
		new SmallGlobus().register();

		new Bankomat().register();
		new Brazier().register();
		new FireHydrant().register();
		new IronTrashcan().register();
		new Wheelbarrow().register();

		new Armchair().register();
		new BarStool().register();
		new Chair().register();
		new CoolArmchair().register();
		new CoolChair().register();
		new RockingChair().register();
		new SmallArmchair().register();
		new SmallChair().register();

		new BigLamp().register();
		new SmallLamp().register();

		new BigTable().register();
		new SmallTable().register();

		new SkeletonHand().register(isHalloween);

		new Poop().register();

		new AcaciaNightstand().register();
		new BirchNightstand().register();
		new CrimsonNightstand().register();
		new DarkOakNightstand().register();
		new JungleNightstand().register();
		new MangroveNightstand().register();
		new OakNightstand().register();
		new SpruceNightstand().register();
		new WarpedNightstand().register();
		//</editor-fold>
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
