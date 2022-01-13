package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.objects.CustomDecor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

public class ItemFrameInteractListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDamageByEntity(HangingBreakByEntityEvent event) {
        if (!(event.getEntity() instanceof ItemFrame) || !event.getEntity().getScoreboardTags().contains("customDecor")) return;
        if (!(event.getRemover() instanceof Player || event.getRemover() instanceof Projectile)) return;
        if (event.getRemover() instanceof Projectile && !(((Projectile) event.getRemover()).getShooter() instanceof Player)) return;
        if (event.getRemover() instanceof Projectile) event.getRemover().remove();
        event.setCancelled(true);
        CustomDecor customDecor = new CustomDecor(event.getEntity().getLocation().getBlock(), (Player) event.getRemover());
        customDecor.breakCustomDecor();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDamageEntity(EntityDamageByEntityEvent event) {
        if (!(event.getEntity() instanceof ItemFrame) || !event.getEntity().getScoreboardTags().contains("customDecor")) return;
        if (!(event.getDamager() instanceof Player || event.getDamager() instanceof Projectile)) return;
        if (event.getDamager() instanceof Projectile && !(((Projectile) event.getDamager()).getShooter() instanceof Player)) return;
        if (event.getDamager() instanceof Projectile) event.getDamager().remove();
        event.setCancelled(true);
        CustomDecor customDecor = new CustomDecor(event.getEntity().getLocation().getBlock(), (Player) event.getDamager());
        customDecor.breakCustomDecor();
    }
}
