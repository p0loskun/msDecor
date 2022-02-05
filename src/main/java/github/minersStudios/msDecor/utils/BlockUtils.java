package github.minersStudios.msDecor.utils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.bukkit.Material;

public class BlockUtils {
    public static final ImmutableSet<Material> CUSTOM_BLOCK_MATERIALS = Sets.immutableEnumSet(
            Material.BARRIER,
            Material.LIGHT,
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
}
