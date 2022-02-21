package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.objects.CustomDecor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;

public class ItemFrameInteractListener implements Listener {
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onHangingBreakByEntity(@Nonnull HangingBreakByEntityEvent event) {
        if (!(event.getEntity() instanceof ItemFrame) || !event.getEntity().getScoreboardTags().contains("customDecor")) return;
        if (!(event.getRemover() instanceof Player || event.getRemover() instanceof Projectile)) return;
        if (event.getRemover() instanceof Projectile && !(((Projectile) event.getRemover()).getShooter() instanceof Player)) return;
        if (event.getRemover() instanceof Projectile) event.getRemover().remove();
        event.setCancelled(true);
        CustomDecor customDecor = new CustomDecor(event.getEntity().getLocation().getBlock(), (Player) event.getRemover());
        customDecor.breakCustomDecor();
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onEntityDamageByEntity(@Nonnull EntityDamageByEntityEvent event) {
        if (!(event.getEntity() instanceof ItemFrame) || !event.getEntity().getScoreboardTags().contains("customDecor")) return;
        if (!(event.getDamager() instanceof Player || event.getDamager() instanceof Projectile)) return;
        if (event.getDamager() instanceof Projectile && !(((Projectile) event.getDamager()).getShooter() instanceof Player)) return;
        if (event.getDamager() instanceof Projectile) event.getDamager().remove();
        event.setCancelled(true);
        CustomDecor customDecor = new CustomDecor(event.getEntity().getLocation().getBlock(), (Player) event.getDamager());
        customDecor.breakCustomDecor();
    }

    @EventHandler
    public void onFrameRotating(@Nonnull PlayerInteractEntityEvent event) {
        event.setCancelled(event instanceof ItemFrame && event.getRightClicked().getScoreboardTags().contains("customDecor"));
    }

    @EventHandler
    public void onPutInItemFrameCustomDecor(@Nonnull PlayerInteractEntityEvent event){
        Player player = event.getPlayer();
        if (!(event.getRightClicked() instanceof ItemFrame) || player.getInventory().getItemInMainHand().getType() != Material.LEATHER_HORSE_ARMOR) return;
        ItemFrame itemFrame = (ItemFrame) event.getRightClicked();
        if(!itemFrame.getItem().getType().isAir()) return;
        ItemStack originalItemInMainHand = player.getInventory().getItemInMainHand(),
                itemInMainHand = originalItemInMainHand.clone();
        ItemMeta itemMeta = itemInMainHand.getItemMeta(),
                originalItemMeta = originalItemInMainHand.getItemMeta();
        if(originalItemMeta == null || itemMeta == null || !itemMeta.hasCustomModelData() || CustomDecorMaterial.getCustomDecorMaterialByItem(itemMeta, false) == null) return;
        event.setCancelled(true);
        originalItemMeta.setDisplayName(originalItemMeta.getDisplayName() + "");
        originalItemInMainHand.setItemMeta(originalItemMeta);
        itemFrame.setCustomName(itemMeta.getDisplayName());
        itemMeta.setDisplayName(null);
        itemInMainHand.setItemMeta(itemMeta);
        itemFrame.setItem(itemInMainHand);
        if(player.getGameMode() != GameMode.CREATIVE) player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
    }

    @EventHandler
    public void onDamageByEntityCustomDecor(@Nonnull EntityDamageByEntityEvent event) {
        Entity damaged = event.getEntity();
        Entity damager = event.getDamager();
        if(!(damaged instanceof ItemFrame) || ((ItemFrame) damaged).getItem().getType() != Material.LEATHER_HORSE_ARMOR || !(damager instanceof Player && ((Player) damager).getGameMode() != GameMode.CREATIVE || damager instanceof Projectile)) return;
        if(damager instanceof Projectile && !(((Projectile) damager).getShooter() instanceof Player) || damaged.getScoreboardTags().contains("customDecor")) return;
        if(damager instanceof Projectile) damager.remove();
        ItemFrame itemFrame = (ItemFrame) damaged;
        if(itemFrame.getItem().getType().isAir()) return;
        ItemStack itemInFrame = itemFrame.getItem().clone();
        ItemMeta itemMeta = itemInFrame.getItemMeta();
        if(itemMeta == null || !itemMeta.hasCustomModelData() || CustomDecorMaterial.getCustomDecorMaterialByItem(itemMeta, true) == null) return;
        event.setCancelled(true);
        itemMeta.setDisplayName(itemFrame.getName());
        itemInFrame.setItemMeta(itemMeta);
        itemFrame.setItem(null);
        itemFrame.setCustomName(null);
        itemFrame.getWorld().playSound(itemFrame.getLocation(), Sound.ENTITY_ITEM_FRAME_REMOVE_ITEM, SoundCategory.NEUTRAL, 1.0f, 1.0f);
        itemFrame.getWorld().dropItemNaturally(itemFrame.getLocation(), itemInFrame);
    }
}
