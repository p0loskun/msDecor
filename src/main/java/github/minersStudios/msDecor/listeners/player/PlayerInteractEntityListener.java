package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;

public class PlayerInteractEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(@Nonnull PlayerInteractEntityEvent event) {
        event.setCancelled(event.getRightClicked() instanceof ItemFrame && event.getRightClicked().getScoreboardTags().contains("customDecor"));
        Player player = event.getPlayer();
        if (!(event.getRightClicked() instanceof ItemFrame itemFrame) || player.getInventory().getItemInMainHand().getType() != Material.LEATHER_HORSE_ARMOR) return;
        if(!itemFrame.getItem().getType().isAir()) return;
        ItemStack originalItemInMainHand = player.getInventory().getItemInMainHand(),
                itemInMainHand = originalItemInMainHand.clone();
        ItemMeta itemMeta = itemInMainHand.getItemMeta(),
                originalItemMeta = originalItemInMainHand.getItemMeta();
        if(originalItemMeta == null || itemMeta == null || !itemMeta.hasCustomModelData() || CustomDecorMaterial.getCustomDecorMaterialByItem(itemMeta, false) == null) return;
        originalItemMeta.setDisplayName(originalItemMeta.getDisplayName() + "");
        originalItemInMainHand.setItemMeta(originalItemMeta);
        itemFrame.setCustomName(itemMeta.getDisplayName());
        itemMeta.setDisplayName(null);
        itemInMainHand.setItemMeta(itemMeta);
        itemFrame.setItem(itemInMainHand);
        if(player.getGameMode() != GameMode.CREATIVE) player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
    }
}
