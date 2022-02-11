package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import javax.annotation.Nonnull;

public class HorseArmorListener implements Listener {
    @EventHandler
    public void onHorseInventoryEquip(@Nonnull InventoryClickEvent event){
        event.setCancelled(
                event.getInventory() instanceof HorseInventory
                && (event.getCursor() != null
                && !(event.getClickedInventory() instanceof PlayerInventory)
                && event.getCursor().getItemMeta() != null
                && event.getCursor().getItemMeta().hasCustomModelData()
                && event.getCursor().getType() == Material.LEATHER_HORSE_ARMOR
                && CustomDecorMaterial.getCustomDecorMaterialByItem(event.getCursor().getItemMeta(), false) != null
                || event.getClick().isShiftClick()
                && event.getCurrentItem() != null
                && event.getCurrentItem().getItemMeta() != null
                && event.getCurrentItem().getItemMeta().hasCustomModelData()
                && event.getCurrentItem().getType() == Material.LEATHER_HORSE_ARMOR
                && CustomDecorMaterial.getCustomDecorMaterialByItem(event.getCurrentItem().getItemMeta(), false) != null)
        );
    }

    @EventHandler
    public void onHorseInventoryEquip(@Nonnull InventoryDragEvent event){
        ItemStack itemStack = event.getNewItems().get(1);
        if(itemStack == null || itemStack.getType() != Material.LEATHER_HORSE_ARMOR) return;
        event.setCancelled(
                itemStack.getItemMeta() != null
                && itemStack.getItemMeta().hasCustomModelData()
                && CustomDecorMaterial.getCustomDecorMaterialByItem(itemStack.getItemMeta(), false) != null
                && event.getRawSlots().contains(1)
                && event.getInventory() instanceof HorseInventory
        );
    }
}
