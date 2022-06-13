package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.HorseInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import javax.annotation.Nonnull;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick(@Nonnull InventoryClickEvent event){
        ItemStack cursor = event.getCursor(),
                currentItem = event.getCurrentItem();
        event.setCancelled(
                        event.getInventory() instanceof HorseInventory
                        && (cursor != null
                            && !(event.getClickedInventory() instanceof PlayerInventory)
                            && cursor.getItemMeta() != null
                            && cursor.getItemMeta().hasCustomModelData()
                            && cursor.getType() == Material.LEATHER_HORSE_ARMOR
                            && CustomDecorMaterial.getCustomDecorMaterialByItem(cursor.getItemMeta(), false) != null
                            || event.getClick().isShiftClick()
                            && currentItem != null
                            && currentItem.getItemMeta() != null
                            && currentItem.getItemMeta().hasCustomModelData()
                            && currentItem.getType() == Material.LEATHER_HORSE_ARMOR
                            && CustomDecorMaterial.getCustomDecorMaterialByItem(currentItem.getItemMeta(), false) != null)
        );
    }
}
