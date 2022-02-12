package github.minersStudios.msDecor.utils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

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
