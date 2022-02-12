package github.minersStudios.msDecor.enums;

import github.minersStudios.msDecor.utils.BlockUtils;
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
    ACACIA_SMALL_CHAIR("Aкациевый стул", 1000, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_SMALL_CHAIR("Берёзовый стул", 1001, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_SMALL_CHAIR("Багровый стул", 1002, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_SMALL_CHAIR("Стул из тёмного дуба", 1003, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_SMALL_CHAIR("Тропический стул", 1004, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_SMALL_CHAIR("Дубовый стул", 1005, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_SMALL_CHAIR("Еловый стул", 1006, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_SMALL_CHAIR("Искажённый стул", 1007, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    ACACIA_CHAIR("Aкациевый стул со спинкой", 1008, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_CHAIR("Берёзовый стул со спинкой", 1009, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_CHAIR("Багровый стул со спинкой", 1010, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_CHAIR("Стул из тёмного дуба со спинкой", 1011, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_CHAIR("Тропический стул со спинкой", 1012, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_CHAIR("Дубовый стул со спинкой", 1013, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_CHAIR("Еловый стул со спинкой", 1014, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_CHAIR("Искажённый стул со спинкой", 1015, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    COOL_ARMCHAIR("Стильное кресло", 1016, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    COOL_ARMCHAIR_LEFT(null, 1017, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOL_ARMCHAIR_MIDDLE(null, 1018, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    COOL_ARMCHAIR_RIGHT(null, 1019, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),

    ACACIA_SMALL_ARMCHAIR("Aкациевое маленькое кресло", 1020, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_SMALL_ARMCHAIR("Берёзовое маленькое кресло", 1021, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_SMALL_ARMCHAIR("Багровое маленькое кресло", 1022, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_SMALL_ARMCHAIR("Маленькое кресло из тёмного дуба", 1023, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_SMALL_ARMCHAIR("Тропическое маленькое кресло", 1024, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_SMALL_ARMCHAIR("Дубовое маленькое кресло", 1025, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_SMALL_ARMCHAIR("Еловое маленькое кресло", 1026, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_SMALL_ARMCHAIR("Искажённое маленькое кресло", 1027, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    ACACIA_ARMCHAIR("Aкациевое кресло", 1028, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_ARMCHAIR("Берёзовое кресло", 1029, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_ARMCHAIR("Багровое кресло", 1030, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_ARMCHAIR("Кресло из тёмного дуба", 1031, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_ARMCHAIR("Тропическое кресло", 1032, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_ARMCHAIR("Дубовое кресло", 1033, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_ARMCHAIR("Еловое кресло", 1034, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_ARMCHAIR("Искажённое кресло", 1035, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    BAR_STOOL("Барный стул", 1036, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    COOL_CHAIR("Стильный стул", 1037, Sound.BLOCK_WOOL_PLACE, Sound.BLOCK_WOOL_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    ACACIA_ROCKING_CHAIR("Aкациевое кресло-качалка", 1038, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_ROCKING_CHAIR_PAINTABLE("Aкациевое кресло-качалка", 1039, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_ROCKING_CHAIR("Берёзовое кресло-качалка", 1040, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_ROCKING_CHAIR_PAINTABLE("Берёзовое кресло-качалка", 1041, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_ROCKING_CHAIR("Багровое кресло-качалка", 1042, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_ROCKING_CHAIR_PAINTABLE("Багровое кресло-качалка", 1043, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_ROCKING_CHAIR("Кресло-качалка из тёмного дуба", 1044, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_ROCKING_CHAIR_PAINTABLE("Кресло-качалка из тёмного дуба", 1045, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_ROCKING_CHAIR("Тропическое кресло-качалка", 1046, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_ROCKING_CHAIR_PAINTABLE("Тропическое кресло-качалка", 1047, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_ROCKING_CHAIR("Дубовое кресло-качалка", 1048, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_ROCKING_CHAIR_PAINTABLE("Дубовое кресло-качалка", 1049, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_ROCKING_CHAIR("Еловое кресло-качалка", 1050, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_ROCKING_CHAIR_PAINTABLE("Еловое кресло-качалка", 1051, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_ROCKING_CHAIR("Искажённое кресло-качалка", 1052, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_ROCKING_CHAIR_PAINTABLE("Искажённое кресло-качалка", 1053, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),



    ACACIA_TABLE("Aкациевый стол", 1054, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_TABLE_PAINTABLE("Aкациевый стол со скатерью", 1055, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_TABLE("Берёзовый стол", 1056, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_TABLE_PAINTABLE("Берёзовый стол со скатерью", 1057, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_TABLE("Багровый стол", 1058, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_TABLE_PAINTABLE("Багровый стол со скатерью", 1059, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_TABLE("Стол из тёмного дуба", 1060, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_TABLE_PAINTABLE("Стол из тёмного дуба со скатерью", 1061, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_TABLE("Тропический стол", 1062, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_TABLE_PAINTABLE("Тропический стол со скатерью", 1063, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_TABLE("Дубовый стол", 1064, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_TABLE_PAINTABLE("Дубовый стол со скатерью", 1065, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_TABLE("Еловый стол", 1066, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_TABLE_PAINTABLE("Еловый стол со скатерью", 1067, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_TABLE("Искажённый стол", 1068, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_TABLE_PAINTABLE("Искажённый стол со скатерью", 1069, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    ACACIA_SMALL_TABLE("Маленький акациевый стол", 1070, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    ACACIA_SMALL_TABLE_PAINTABLE("Маленький акациевый стол со скатерью", 1071, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_SMALL_TABLE("Маленький берёзовый стол", 1072, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    BIRCH_SMALL_TABLE_PAINTABLE("Маленький берёзовый стол со скатерью", 1073, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_SMALL_TABLE("Маленький багровый стол", 1074, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    CRIMSON_SMALL_TABLE_PAINTABLE("Маленький багровый стол со скатерью", 1075, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_SMALL_TABLE("Маленький стол из тёмного дуба", 1076, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    DARK_OAK_SMALL_TABLE_PAINTABLE("Маленький стол из тёмного дуба со скатерью", 1077, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_SMALL_TABLE("Маленький тропический стол", 1078, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    JUNGLE_SMALL_TABLE_PAINTABLE("Маленький тропический стол со скатерью", 1079, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_SMALL_TABLE("Маленький дубовый стол", 1080, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    OAK_SMALL_TABLE_PAINTABLE("Маленький дубовый стол со скатерью", 1081, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_SMALL_TABLE("Маленький еловый стол", 1082, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    SPRUCE_SMALL_TABLE_PAINTABLE("Маленький еловый стол со скатерью", 1083, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_SMALL_TABLE("Маленький искажённый стол", 1084, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, null),
    WARPED_SMALL_TABLE_PAINTABLE("Маленький искажённый стол со скатерью", 1085, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),


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


    SMALL_CLOCK("Настенные часы", 1017, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.FRAME, CustomDecorFacing.WALL, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    ;

    // Item

    private final String itemName;

    /** Custom decor item CustomModelData integer */
    @Getter private final int itemCustomModelData;

    @Nullable private final List<String> lore;

    // Sound

    /** Custom decor place Sound */
    @Getter @Nullable private final Sound placeSound;

    /** Custom decor break Sound */
    @Getter @Nullable private final Sound breakSound;

    /** Custom decor sound pitch*/
    @Getter private final float pitch;

    // Other

    /** Custom decor hitbox*/
    @Getter @Nonnull private final HitBox hitBox;

    /** Custom decor facing */
    @Getter @Nullable private final CustomDecorFacing facing;

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
    }


    /**
     * @return Custom decor item
     */
    @Nonnull
    public ItemStack getItemStack(){
        ItemStack itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setCustomModelData(itemCustomModelData);
        itemMeta.setDisplayName(ChatColor.WHITE + itemName);
        if(lore != null) itemMeta.setLore(lore);
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
                if(searchOriginal) return BlockUtils.getCustomDecorMaterialWithoutSuffix(customDecorMaterial.name());
                return customDecorMaterial;
            }
        }
        return null;
    }

    /**
     * @return Custom decor material by item in entity
     */
    @Nullable
    public static CustomDecorMaterial getCustomDecorMaterialByEntity(@Nonnull Entity entity, boolean searchOriginal){
        for(CustomDecorMaterial customDecorMaterial : CustomDecorMaterial.values()) {
            if(entity instanceof ArmorStand && ((ArmorStand) entity).getEquipment() != null){
                ItemStack helmetItem = ((ArmorStand) entity).getEquipment().getHelmet();
                if(helmetItem != null && helmetItem.getItemMeta() != null && customDecorMaterial.getItemCustomModelData() == helmetItem.getItemMeta().getCustomModelData()){
                    if(searchOriginal && customDecorMaterial.name().contains("_LEFT") || customDecorMaterial.name().contains("_RIGHT") || customDecorMaterial.name().contains("_MIDDLE")) return BlockUtils.getCustomDecorMaterialWithoutSuffix(customDecorMaterial.name());
                    return customDecorMaterial;
                }
            } else if (entity instanceof ItemFrame && ((ItemFrame) entity).getItem().getType() != Material.AIR){
                ItemStack item = ((ItemFrame) entity).getItem();
                if(item.getItemMeta() != null && customDecorMaterial.getItemCustomModelData() == item.getItemMeta().getCustomModelData()){
                    if(searchOriginal && customDecorMaterial.name().contains("_LEFT") || customDecorMaterial.name().contains("_RIGHT") || customDecorMaterial.name().contains("_MIDDLE")) return BlockUtils.getCustomDecorMaterialWithoutSuffix(customDecorMaterial.name());
                    return customDecorMaterial;
                }
            }
        }
        return null;
    }
}
