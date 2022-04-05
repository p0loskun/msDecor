package github.minersStudios.msDecor.mechanics;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import javax.annotation.Nonnull;

public class Lamps implements Listener {
    @EventHandler
    public void onInteractWithArmorStand(@Nonnull PlayerInteractAtEntityEvent event) {
        if (event.getRightClicked().getType() != EntityType.ARMOR_STAND) return;
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(event.getRightClicked(), false);
        if(customDecorMaterial == CustomDecorMaterial.BIG_LAMP || customDecorMaterial == CustomDecorMaterial.SMALL_LAMP){
            Entity entity = event.getRightClicked();
            Location location = entity.getLocation();
            Block block = location.getBlock();
            if(block.getType() != Material.LIGHT) return;
            Levelled level14 = (Levelled) block.getBlockData(),
                    level0 = (Levelled) block.getBlockData();
            level14.setLevel(14);
            level0.setLevel(0);
            if(block.getBlockData().equals(level0)) {
                block.setType(Material.LIGHT);
                block.setBlockData(level14, true);
                entity.getWorld().playSound(location, Sound.BLOCK_STONE_BUTTON_CLICK_OFF, 1, 2);
            } else if(block.getBlockData().equals(level14)) {
                block.setType(Material.LIGHT);
                block.setBlockData(level0, true);
                entity.getWorld().playSound(location, Sound.BLOCK_STONE_BUTTON_CLICK_ON, 1, 2);
            }
        }
    }
}
