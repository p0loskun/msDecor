package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;
import javax.annotation.Nonnull;

public class InventoryDragListener implements Listener {

    @EventHandler
    public void onInventoryDrag(@Nonnull InventoryDragEvent event) {
        ItemStack itemStack = event.getNewItems().get(1);
        if (itemStack == null || itemStack.getType() != Material.LEATHER_HORSE_ARMOR) return;
        event.setCancelled(
                itemStack.getItemMeta() != null
                && itemStack.getItemMeta().hasCustomModelData()
                && CustomDecorMaterial.getCustomDecorMaterialByItem(itemStack.getItemMeta(), false) != null
                && event.getRawSlots().contains(1)
                && event.getInventory() instanceof HorseInventory
        );
    }
}
