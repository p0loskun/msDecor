package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class HorseArmorListener implements Listener {

    @EventHandler
    public void onHorseInventoryEquip(InventoryClickEvent event){
        event.setCancelled(
                event.getInventory() instanceof HorseInventory
                && (event.getCursor() != null
                && !(event.getClickedInventory() instanceof PlayerInventory)
                && event.getCursor().getItemMeta() != null
                && CustomDecorMaterial.getCustomDecorMaterialByItem(event.getCursor().getItemMeta()) != null
                || event.getClick().isShiftClick()
                && event.getCurrentItem() != null
                && event.getCurrentItem().getItemMeta() != null
                && CustomDecorMaterial.getCustomDecorMaterialByItem(event.getCurrentItem().getItemMeta()) != null)
        );
    }

    @EventHandler
    public void onHorseInventoryEquip(InventoryDragEvent event){
        ItemStack itemStack = event.getNewItems().get(1);
        if(itemStack == null) return;
        event.setCancelled(
                itemStack.getItemMeta() != null
                && CustomDecorMaterial.getCustomDecorMaterialByItem(itemStack.getItemMeta()) != null
                && event.getRawSlots().contains(1)
                && event.getInventory() instanceof HorseInventory
        );
    }

}
