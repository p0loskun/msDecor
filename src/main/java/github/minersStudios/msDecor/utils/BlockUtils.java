package github.minersStudios.msDecor.utils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.bukkit.Material;

import java.util.HashSet;

public class BlockUtils {
    public static final ImmutableSet<Material> TRANSPARENT = Sets.immutableEnumSet(
            Material.AIR,
            Material.WATER,
            Material.LAVA
    );

    public static final HashSet<Material> REPLACE = Sets.newHashSet(
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
            Material.SNOW
    );
}
