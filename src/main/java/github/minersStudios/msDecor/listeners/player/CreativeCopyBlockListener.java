package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryCreativeEvent;

public class CreativeCopyBlockListener implements Listener {

    @EventHandler
    public void onCopyBlock(InventoryCreativeEvent event){
        if(event.getClick() != ClickType.CREATIVE) return;
        Player player = (Player) event.getWhoClicked();
        Block clickedBlock = player.getTargetBlockExact(5);
        if(clickedBlock == null) return;
        if(event.getCursor().getType() == Material.BARRIER) {
            event.setCancelled(true);
            for (Entity nearbyEntity : clickedBlock.getWorld().getNearbyEntities(clickedBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
                if (nearbyEntity instanceof ItemFrame && ((ItemFrame) nearbyEntity).getItem().getItemMeta() != null) {
                    CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(nearbyEntity, true);
                    if(customDecorMaterial == null) return;
                    player.getInventory().setItem(event.getSlot(), customDecorMaterial.getItemStack());
                }
            }
        }
    }
}
