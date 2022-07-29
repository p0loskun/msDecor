package github.minersStudios.msDecor.utils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.bukkit.*;
import org.bukkit.block.Block;

import javax.annotation.Nonnull;

public class BlockUtils {
	public static final ImmutableSet<Material> CUSTOM_BLOCK_MATERIALS = Sets.immutableEnumSet(Material.BARRIER, Material.STRUCTURE_VOID);

	public static final ImmutableSet<Material> REPLACE = Sets.immutableEnumSet(
			//<editor-fold desc="Replace materials">
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
			//</editor-fold>
	);

	private static final ImmutableSet<Material> BREAK_ON_BLOCK_PLACE = Sets.immutableEnumSet(
			//<editor-fold desc="Materials that will break on block place">
			Material.TALL_GRASS,
			Material.LARGE_FERN,
			Material.TALL_SEAGRASS
			//</editor-fold>
	);

	/**
	 * Breaks top/bottom block
	 *
	 * @param location location around which the blocks break
	 */
	public static void removeBlock(@Nonnull Location location) {
		Block topBlock = location.clone().add(0.0d, 1.0d, 0.0d).getBlock(),
				bottomBlock = location.clone().subtract(0.0d, 1.0d, 0.0d).getBlock();
		World world = topBlock.getWorld();
		if (BREAK_ON_BLOCK_PLACE.contains(topBlock.getType())) {
			SoundGroup tobBlockSoundGroup = topBlock.getBlockData().getSoundGroup();
			world.spawnParticle(Particle.BLOCK_CRACK, topBlock.getLocation().clone().add(0.5d, 0.25d, 0.5d), 80, 0.35d, 0.35d, 0.35d, topBlock.getBlockData());
			world.playSound(topBlock.getLocation(), tobBlockSoundGroup.getBreakSound(), tobBlockSoundGroup.getVolume(), tobBlockSoundGroup.getPitch());
			topBlock.breakNaturally();
		}
		if (BREAK_ON_BLOCK_PLACE.contains(bottomBlock.getType())) {
			SoundGroup bottomBlockSoundGroup = bottomBlock.getBlockData().getSoundGroup();
			world.spawnParticle(Particle.BLOCK_CRACK, bottomBlock.getLocation().clone().add(0.5d, 0.25d, 0.5d), 80, 0.35d, 0.35d, 0.35d, bottomBlock.getBlockData());
			world.playSound(bottomBlock.getLocation(), bottomBlockSoundGroup.getBreakSound(), bottomBlockSoundGroup.getVolume(), bottomBlockSoundGroup.getPitch());
			bottomBlock.breakNaturally();
		}
	}
}