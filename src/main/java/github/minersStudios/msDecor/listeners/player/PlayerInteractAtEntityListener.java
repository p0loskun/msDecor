package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import javax.annotation.Nonnull;

public class PlayerInteractAtEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractAtEntity(@Nonnull PlayerInteractAtEntityEvent event) {
        event.setCancelled(CustomDecorMaterial.getCustomDecorMaterialByEntity(event.getRightClicked(), false) != null);
    }
}
