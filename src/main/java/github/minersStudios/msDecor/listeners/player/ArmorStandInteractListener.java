package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import javax.annotation.Nonnull;

public class ArmorStandInteractListener implements Listener {
    @EventHandler
    public void onInteractWithArmorStand(@Nonnull PlayerInteractAtEntityEvent event) {
        if (event.getRightClicked().getType() != EntityType.ARMOR_STAND) return;
        event.setCancelled(CustomDecorMaterial.getCustomDecorMaterialByEntity(event.getRightClicked()) != null);
    }
}
