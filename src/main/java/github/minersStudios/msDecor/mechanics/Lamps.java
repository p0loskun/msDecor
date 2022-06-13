package github.minersStudios.msDecor.mechanics;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.utils.PlaySwingAnimation;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

import javax.annotation.Nonnull;

public class Lamps implements Listener {

    @EventHandler
    public void onInteractWithArmorStand(@Nonnull PlayerInteractAtEntityEvent event) {
        Entity entity = event.getRightClicked();
        if (event.getRightClicked().getType() != EntityType.ARMOR_STAND) return;
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(entity, false);
        if(customDecorMaterial == CustomDecorMaterial.BIG_LAMP || customDecorMaterial == CustomDecorMaterial.SMALL_LAMP){
            Block block = entity.getLocation().getBlock();
            if(block.getType() != Material.LIGHT) return;
            Levelled level14 = (Levelled) block.getBlockData(),
                    level0 = (Levelled) block.getBlockData();
            level14.setLevel(14);
            level0.setLevel(0);
            if(block.getBlockData().equals(level0)) {
                block.setType(Material.LIGHT);
                new PlaySwingAnimation(event.getPlayer(), EquipmentSlot.HAND);
                block.setBlockData(level14, true);
                entity.getWorld().playSound(entity.getLocation(), Sound.BLOCK_STONE_BUTTON_CLICK_OFF, 1, 2);
            } else if(block.getBlockData().equals(level14)) {
                block.setType(Material.LIGHT);
                new PlaySwingAnimation(event.getPlayer(), EquipmentSlot.HAND);
                block.setBlockData(level0, true);
                entity.getWorld().playSound(entity.getLocation(), Sound.BLOCK_STONE_BUTTON_CLICK_ON, 1, 2);
            }
        }
    }
}
