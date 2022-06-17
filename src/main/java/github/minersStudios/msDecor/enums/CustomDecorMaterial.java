package github.minersStudios.msDecor.enums;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/**
 * CustomDecorMaterial enum with decor parameters
 */
public enum CustomDecorMaterial {
    ACACIA_SMALL_CHAIR("Aкациевый стул", 1000, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    BIRCH_SMALL_CHAIR("Берёзовый стул", 1001, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    CRIMSON_SMALL_CHAIR("Багровый стул", 1002, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    DARK_OAK_SMALL_CHAIR("Стул из тёмного дуба", 1003, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    JUNGLE_SMALL_CHAIR("Тропический стул", 1004, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    OAK_SMALL_CHAIR("Дубовый стул", 1005, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    SPRUCE_SMALL_CHAIR("Еловый стул", 1006, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),
    WARPED_SMALL_CHAIR("Искажённый стул", 1007, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.75d),

    ACACIA_CHAIR("Aкациевый стул со спинкой", 1008, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    BIRCH_CHAIR("Берёзовый стул со спинкой", 1009, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    CRIMSON_CHAIR("Багровый стул со спинкой", 1010, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    DARK_OAK_CHAIR("Стул из тёмного дуба со спинкой", 1011, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    JUNGLE_CHAIR("Тропический стул со спинкой", 1012, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    OAK_CHAIR("Дубовый стул со спинкой", 1013, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    SPRUCE_CHAIR("Еловый стул со спинкой", 1014, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    WARPED_CHAIR("Искажённый стул со спинкой", 1015, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),

    COOL_ARMCHAIR("Стильное кресло", 1016, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.65d),
    COOL_ARMCHAIR_LEFT(null, 1017, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.65d),
    COOL_ARMCHAIR_MIDDLE(null, 1018, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.65d),
    COOL_ARMCHAIR_RIGHT(null, 1019, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.65d),

    ACACIA_SMALL_ARMCHAIR("Aкациевое маленькое кресло", 1020, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    BIRCH_SMALL_ARMCHAIR("Берёзовое маленькое кресло", 1021, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    CRIMSON_SMALL_ARMCHAIR("Багровое маленькое кресло", 1022, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    DARK_OAK_SMALL_ARMCHAIR("Маленькое кресло из тёмного дуба", 1023, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    JUNGLE_SMALL_ARMCHAIR("Тропическое маленькое кресло", 1024, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    OAK_SMALL_ARMCHAIR("Дубовое маленькое кресло", 1025, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    SPRUCE_SMALL_ARMCHAIR("Еловое маленькое кресло", 1026, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    WARPED_SMALL_ARMCHAIR("Искажённое маленькое кресло", 1027, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),

    ACACIA_ARMCHAIR("Aкациевое кресло", 1028, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    BIRCH_ARMCHAIR("Берёзовое кресло", 1029, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    CRIMSON_ARMCHAIR("Багровое кресло", 1030, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    DARK_OAK_ARMCHAIR("Кресло из тёмного дуба", 1031, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    JUNGLE_ARMCHAIR("Тропическое кресло", 1032, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    OAK_ARMCHAIR("Дубовое кресло", 1033, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    SPRUCE_ARMCHAIR("Еловое кресло", 1034, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),
    WARPED_ARMCHAIR("Искажённое кресло", 1035, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),

    BAR_STOOL("Барный стул", 1036, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 1.0d),

    COOL_CHAIR("Стильный стул", 1037, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.6d),

    ACACIA_ROCKING_CHAIR("Aкациевое кресло-качалка", 1038, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    ACACIA_ROCKING_CHAIR_PAINTABLE("Aкациевое кресло-качалка", 1039, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    BIRCH_ROCKING_CHAIR("Берёзовое кресло-качалка", 1040, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    BIRCH_ROCKING_CHAIR_PAINTABLE("Берёзовое кресло-качалка", 1041, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    CRIMSON_ROCKING_CHAIR("Багровое кресло-качалка", 1042, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    CRIMSON_ROCKING_CHAIR_PAINTABLE("Багровое кресло-качалка", 1043, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    DARK_OAK_ROCKING_CHAIR("Кресло-качалка из тёмного дуба", 1044, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    DARK_OAK_ROCKING_CHAIR_PAINTABLE("Кресло-качалка из тёмного дуба", 1045, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    JUNGLE_ROCKING_CHAIR("Тропическое кресло-качалка", 1046, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    JUNGLE_ROCKING_CHAIR_PAINTABLE("Тропическое кресло-качалка", 1047, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    OAK_ROCKING_CHAIR("Дубовое кресло-качалка", 1048, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    OAK_ROCKING_CHAIR_PAINTABLE("Дубовое кресло-качалка", 1049, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    SPRUCE_ROCKING_CHAIR("Еловое кресло-качалка", 1050, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    SPRUCE_ROCKING_CHAIR_PAINTABLE("Еловое кресло-качалка", 1051, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),
    WARPED_ROCKING_CHAIR("Искажённое кресло-качалка", 1052, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null, 0.5d),
    WARPED_ROCKING_CHAIR_PAINTABLE("Искажённое кресло-качалка", 1053, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol()), 0.5d),



    ACACIA_BIG_TABLE("Aкациевый стол", 1054, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_BIG_TABLE_PAINTABLE("Aкациевый стол со скатерью", 1055, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    BIRCH_BIG_TABLE("Берёзовый стол", 1056, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_BIG_TABLE_PAINTABLE("Берёзовый стол со скатерью", 1057, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    CRIMSON_BIG_TABLE("Багровый стол", 1058, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_BIG_TABLE_PAINTABLE("Багровый стол со скатерью", 1059, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    DARK_OAK_BIG_TABLE("Стол из тёмного дуба", 1060, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_BIG_TABLE_PAINTABLE("Стол из тёмного дуба со скатерью", 1061, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    JUNGLE_BIG_TABLE("Тропический стол", 1062, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_BIG_TABLE_PAINTABLE("Тропический стол со скатерью", 1063, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    OAK_BIG_TABLE("Дубовый стол", 1064, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_BIG_TABLE_PAINTABLE("Дубовый стол со скатерью", 1065, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    SPRUCE_BIG_TABLE("Еловый стол", 1066, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_BIG_TABLE_PAINTABLE("Еловый стол со скатерью", 1067, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    WARPED_BIG_TABLE("Искажённый стол", 1068, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_BIG_TABLE_PAINTABLE("Искажённый стол со скатерью", 1069, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),

    ACACIA_SMALL_TABLE("Маленький акациевый стол", 1070, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_SMALL_TABLE_PAINTABLE("Маленький акациевый стол со скатерью", 1071, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    BIRCH_SMALL_TABLE("Маленький берёзовый стол", 1072, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_SMALL_TABLE_PAINTABLE("Маленький берёзовый стол со скатерью", 1073, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    CRIMSON_SMALL_TABLE("Маленький багровый стол", 1074, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_SMALL_TABLE_PAINTABLE("Маленький багровый стол со скатерью", 1075, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    DARK_OAK_SMALL_TABLE("Маленький стол из тёмного дуба", 1076, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_SMALL_TABLE_PAINTABLE("Маленький стол из тёмного дуба со скатерью", 1077, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    JUNGLE_SMALL_TABLE("Маленький тропический стол", 1078, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_SMALL_TABLE_PAINTABLE("Маленький тропический стол со скатерью", 1079, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    OAK_SMALL_TABLE("Маленький дубовый стол", 1080, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_SMALL_TABLE_PAINTABLE("Маленький дубовый стол со скатерью", 1081, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    SPRUCE_SMALL_TABLE("Маленький еловый стол", 1082, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_SMALL_TABLE_PAINTABLE("Маленький еловый стол со скатерью", 1083, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    WARPED_SMALL_TABLE("Маленький искажённый стол", 1084, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_SMALL_TABLE_PAINTABLE("Маленький искажённый стол со скатерью", 1085, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),


    ACACIA_NIGHTSTAND("Акациевая тумбочка", 1086, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_NIGHTSTAND_2_LEFT(null, 1087, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_NIGHTSTAND_2_MIDDLE(null, 1088, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_NIGHTSTAND_2_RIGHT(null, 1089, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_NIGHTSTAND_3_LEFT(null, 1090, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_NIGHTSTAND_3_MIDDLE(null, 1091, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_NIGHTSTAND_3_RIGHT(null, 1092, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    BIRCH_NIGHTSTAND("Берёзовая тумбочка", 1093, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_NIGHTSTAND_2_LEFT(null, 1094, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_NIGHTSTAND_2_MIDDLE(null, 1095, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_NIGHTSTAND_2_RIGHT(null, 1096, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_NIGHTSTAND_3_LEFT(null, 1097, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_NIGHTSTAND_3_MIDDLE(null, 1098, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_NIGHTSTAND_3_RIGHT(null, 1099, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    CRIMSON_NIGHTSTAND("Багровая тумбочка", 1100, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_NIGHTSTAND_2_LEFT(null, 1101, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_NIGHTSTAND_2_MIDDLE(null, 1102, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_NIGHTSTAND_2_RIGHT(null, 1103, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_NIGHTSTAND_3_LEFT(null, 1104, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_NIGHTSTAND_3_MIDDLE(null, 1105, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_NIGHTSTAND_3_RIGHT(null, 1106, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    DARK_OAK_NIGHTSTAND("Тумбочка из тёмного дуба", 1107, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_NIGHTSTAND_2_LEFT(null, 1108, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_NIGHTSTAND_2_MIDDLE(null, 1109, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_NIGHTSTAND_2_RIGHT(null, 1110, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_NIGHTSTAND_3_LEFT(null, 1111, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_NIGHTSTAND_3_MIDDLE(null, 1112, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_NIGHTSTAND_3_RIGHT(null, 1113, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    JUNGLE_NIGHTSTAND("Тропическая тумбочка", 1114, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_NIGHTSTAND_2_LEFT(null, 1115, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_NIGHTSTAND_2_MIDDLE(null, 1116, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_NIGHTSTAND_2_RIGHT(null, 1117, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_NIGHTSTAND_3_LEFT(null, 1118, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_NIGHTSTAND_3_MIDDLE(null, 1119, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_NIGHTSTAND_3_RIGHT(null, 1120, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    OAK_NIGHTSTAND("Дубовая тумбочка", 1121, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_NIGHTSTAND_2_LEFT(null, 1122, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_NIGHTSTAND_2_MIDDLE(null, 1123, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_NIGHTSTAND_2_RIGHT(null, 1124, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_NIGHTSTAND_3_LEFT(null, 1125, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_NIGHTSTAND_3_MIDDLE(null, 1126, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_NIGHTSTAND_3_RIGHT(null, 1127, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    SPRUCE_NIGHTSTAND("Еловая тумбочка", 1128, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_NIGHTSTAND_2_LEFT(null, 1129, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_NIGHTSTAND_2_MIDDLE(null, 1130, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_NIGHTSTAND_2_RIGHT(null, 1131, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_NIGHTSTAND_3_LEFT(null, 1132, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_NIGHTSTAND_3_MIDDLE(null, 1133, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_NIGHTSTAND_3_RIGHT(null, 1134, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    WARPED_NIGHTSTAND("Искажённая тумбочка", 1135, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_NIGHTSTAND_2_LEFT(null, 1136, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_NIGHTSTAND_2_MIDDLE(null, 1137, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_NIGHTSTAND_2_RIGHT(null, 1138, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_NIGHTSTAND_3_LEFT(null, 1139, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_NIGHTSTAND_3_MIDDLE(null, 1140, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_NIGHTSTAND_3_RIGHT(null, 1141, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    WHEELBARROW("Тачка", 1142, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    SMALL_LAMP("Маленькая лампа", 1144, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),

    SMALL_GLOBUS("Маленький глобус", 1145, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.STRUCTURE_FRAME, CustomDecorFacing.FLOOR, null),

    SMALL_CLOCK("Маленькие настенные часы", 1146, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.FRAME, CustomDecorFacing.WALL, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),

    PATEFON("Патефон", 1147, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    IRON_TRASHCAN("Железная мусорка", 1148, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    FIRE_HYDRANT("Пожарный гидрант", 1149, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),

    CAMERA("Камера", 1150, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.NORMAL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),

    BIG_LAMP("Большая лампа", 1151, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.NORMAL_ARMOR_STAND, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),

    BANKOMAT("Банкомат", 1152, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),

    BMO_PLUSH("Плюшевый Бимо", 1153, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    BROWN_BEAR_PLUSH("Плюшевый мишка", 1154, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    RACOON_PLUSH("Плюшевый Енот", 1143, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    PIGGYBANK("Копилка", 1155, Sound.BLOCK_GLASS_PLACE, Sound.BLOCK_GLASS_BREAK, 1.5f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    PIGGYBANK_DIAMOND("Алмазная копилка", 1156, Sound.BLOCK_STONE_PLACE, Sound.BLOCK_STONE_BREAK, 1.5f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    PIGGYBANK_EMERALD("Изумрудная копилка", 1157, Sound.BLOCK_STONE_PLACE, Sound.BLOCK_STONE_BREAK, 1.5f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    PIGGYBANK_GOLD("Золотая копилка", 1158, Sound.BLOCK_STONE_PLACE, Sound.BLOCK_STONE_BREAK, 1.5f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    PIGGYBANK_IRON("Железная копилка", 1159, Sound.BLOCK_STONE_PLACE, Sound.BLOCK_STONE_BREAK, 1.5f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    PIGGYBANK_NETHERITE("Незеритовая копилка", 1160, Sound.BLOCK_STONE_PLACE, Sound.BLOCK_STONE_BREAK, 1.5f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),

    DEER_HEAD("Голова оленя", 1161, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.WALL, null),
    HOGLIN_HEAD("Голова борова", 1162, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.WALL, null),
    ZOGLIN_HEAD("Голова зомбу борова", 1163, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.WALL, null),

    COOKING_POT("Кастрюля", 1164, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_HONEY("Кастрюля", 1165, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_HONEY_1("Кастрюля", 1166, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_HONEY_2("Кастрюля", 1167, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_PORTAL("Кастрюля", 1168, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_LAVA("Кастрюля", 1169, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_SNOW("Кастрюля", 1170, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_WATER("Кастрюля", 1171, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_WATER1("Кастрюля", 1172, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOKING_POT_WATER2("Кастрюля", 1173, Sound.BLOCK_ANVIL_PLACE, Sound.BLOCK_ANVIL_BREAK, 1.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    CELL("Клетка", 1174, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_BEE("Клетка", 1175, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_CHICKEN("Клетка", 1176, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_PARROT_BLUE("Клетка", 1177, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_PARROT_GREEN("Клетка", 1178, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_PARROT_GRAY("Клетка", 1179, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_PARROT_RED_BLUE("Клетка", 1180, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_PARROT_YELLOW_BLUE("Клетка", 1181, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),
    CELL_SLIME("Клетка", 1182, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, null, null),

    BRAZIER("Мангал", 1183, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),
    BRAZIER_FIRE("Мангал", 1184, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, null),

    BALL("Новогодняя игрушка", 1185, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.WALL, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    BALL_CEILING("Новогодняя игрушка", 1185, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.CEILING, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    SANTA_SOCKS("Носок санты", 1186, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.WALL, Collections.singletonList(Symbols.PAINTABLE.getSymbol())),
    SNOWMAN("Снеговик", 1187, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BROKEN_SNOWMAN("Сломаный снеговик", 1188, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    SKELETON_HAND("Мангал", 1189, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SKELETON_HAND_DIRT(null, 1190, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SKELETON_HAND_GRAVEL(null, 1191, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SKELETON_HAND_STONE(null, 1192, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ;

    public static final ImmutableSet<Material> CUSTOM_BLOCK_MATERIALS = Sets.immutableEnumSet(
            Material.BARRIER,
            Material.STRUCTURE_VOID
    );

    public static final ImmutableSet<Material> REPLACE = Sets.immutableEnumSet(
            Material.AIR,
            Material.WATER,
            Material.LAVA,
            Material.GRASS,
            Material.FERN,
            Material.SEAGRASS,
            Material.TALL_GRASS,
            Material.LARGE_FERN,
            Material.TALL_SEAGRASS,
            Material.VINE,
            Material.SNOW,
            Material.FIRE
    );

    @Nullable private final String itemName;

    /** Custom decor item CustomModelData integer */
    @Getter private final int itemCustomModelData;

    @Nullable private final List<String> lore;

    /** Custom decor place Sound */
    @Getter @Nullable private final Sound placeSound;

    /** Custom decor break Sound */
    @Getter @Nullable private final Sound breakSound;

    /** Custom decor sound pitch*/
    @Getter private final float pitch;

    /** Custom decor hitbox*/
    @Getter @Nonnull private final HitBox hitBox;

    /** Custom decor facing */
    @Getter @Nullable private final CustomDecorFacing facing;

    /** Custom decor sit height */
    @Getter @Nullable private final Double height;

    /**
     * @param itemName custom decor item custom name
     * @param itemCustomModelData custom decor item CustomModelData
     *
     * @param placeSound custom decor place sound
     * @param breakSound custom decor break sound
     * @param pitch custom decor sound pitch
     *
     * @param hitBox custom decor hitbox
     * @param facing custom decor facing
     * @param lore custom decor item lore
     */
    CustomDecorMaterial(
            @Nullable String itemName,
            int itemCustomModelData,
            @Nullable Sound placeSound,
            @Nullable Sound breakSound,
            float pitch,
            @Nonnull HitBox hitBox,
            @Nullable CustomDecorFacing facing,
            @Nullable List<String> lore
    ) {
        this.itemName = itemName;
        this.itemCustomModelData = itemCustomModelData;

        this.placeSound = placeSound;
        this.breakSound = breakSound;
        this.pitch = pitch;

        this.hitBox = hitBox;
        this.facing = facing;
        this.lore = lore;
        this.height = null;
    }

    CustomDecorMaterial(
            @Nullable String itemName,
            int itemCustomModelData,
            @Nullable Sound placeSound,
            @Nullable Sound breakSound,
            float pitch,
            @Nonnull HitBox hitBox,
            @Nullable CustomDecorFacing facing,
            @Nullable List<String> lore,
            @Nullable Double height
    ) {
        this.itemName = itemName;
        this.itemCustomModelData = itemCustomModelData;

        this.placeSound = placeSound;
        this.breakSound = breakSound;
        this.pitch = pitch;

        this.hitBox = hitBox;
        this.facing = facing;
        this.lore = lore;
        this.height = height;
    }


    /**
     * @return Custom decor item
     */
    @Nonnull
    public ItemStack getItemStack(){
        ItemStack itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setCustomModelData(this.itemCustomModelData);
        itemMeta.setDisplayName(ChatColor.WHITE + this.itemName);
        if(this.lore != null) itemMeta.setLore(this.lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    /**
     * @return Custom decor material by item in hand
     */
    @Nullable
    public static CustomDecorMaterial getCustomDecorMaterialByItem(@Nonnull ItemMeta itemMeta, boolean searchOriginal){
        for(CustomDecorMaterial customDecorMaterial : CustomDecorMaterial.values()) {
            if(customDecorMaterial.itemCustomModelData == itemMeta.getCustomModelData()) {
                return searchOriginal ? getCustomDecorMaterialWithoutSuffix(customDecorMaterial.name()) : customDecorMaterial;
            }
        }
        return null;
    }

    /**
     * @return Custom decor material by item in entity
     */
    @Nullable
    public static CustomDecorMaterial getCustomDecorMaterialByEntity(@Nonnull Entity entity, boolean searchOriginal){
        boolean customDecorMaterialWasFound = false;
        for(CustomDecorMaterial customDecorMaterial : CustomDecorMaterial.values()) {
            if(entity instanceof ArmorStand armorStand && armorStand.getEquipment() != null){
                ItemStack helmetItem = armorStand.getEquipment().getHelmet();
                if(helmetItem == null || helmetItem.getItemMeta() == null || !helmetItem.getItemMeta().hasCustomModelData()) return null;
                customDecorMaterialWasFound = customDecorMaterial.getItemCustomModelData() == helmetItem.getItemMeta().getCustomModelData();
            } else if (entity instanceof ItemFrame itemFrame && itemFrame.getItem().getType() != Material.AIR){
                ItemStack item = itemFrame.getItem();
                if(item.getItemMeta() == null || !item.getItemMeta().hasCustomModelData()) return null;
                customDecorMaterialWasFound = customDecorMaterial.getItemCustomModelData() == item.getItemMeta().getCustomModelData();
            }
            if(customDecorMaterialWasFound) {
                return searchOriginal
                        && customDecorMaterial.name().contains("_LEFT")
                        || customDecorMaterial.name().contains("_RIGHT")
                        || customDecorMaterial.name().contains("_MIDDLE")
                        || customDecorMaterial.name().contains("_DIRT")
                        || customDecorMaterial.name().contains("_GRAVEL")
                        || customDecorMaterial.name().contains("_STONE") ? getCustomDecorMaterialWithoutSuffix(customDecorMaterial.name())
                        : customDecorMaterial;
            }
        }
        return null;
    }

    /**
     * @param name name of CustomDecorMaterial enum
     *
     * @return Original CustomDecorMaterial
     */
    @Nullable
    public static CustomDecorMaterial getCustomDecorMaterialWithoutSuffix(@Nonnull String name){
        for(CustomDecorMaterial customDecorMaterial : CustomDecorMaterial.values()){
            if(customDecorMaterial.name().equals(name.replaceAll("_[2-3]_MIDDLE|_[2-3]_RIGHT|_[2-3]_LEFT|_MIDDLE|_RIGHT|_LEFT", ""))){
                return customDecorMaterial;
            } else if(customDecorMaterial.name().equals(name)){
                return customDecorMaterial;
            }
        }
        return null;
    }
}
