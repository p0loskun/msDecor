package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.objects.CustomDecor;
import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import javax.annotation.Nonnull;

public class BreakCustomDecorListener implements Listener {
    @EventHandler
    public void onPlayerInteract(@Nonnull PlayerInteractEvent event){
        assert event.getClickedBlock() != null;
        Block block = event.getClickedBlock();
        if (event.getAction() != Action.LEFT_CLICK_BLOCK || !BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(block.getType())) return;
        Player player = event.getPlayer();
        if((player.isSneaking() && player.getGameMode() == GameMode.SURVIVAL) || player.getGameMode() == GameMode.CREATIVE){
            CustomDecor customDecor = new CustomDecor(block, player);
            customDecor.breakCustomDecor();
        }
    }

    @EventHandler
    public void onPlayerDamageEntity(@Nonnull EntityDamageByEntityEvent event) {
        Entity damaged = event.getEntity();
        Entity damager = event.getDamager();
        if(!(damaged instanceof ArmorStand) || CustomDecorMaterial.getCustomDecorMaterialByEntity(damaged) == null || damager instanceof Player && ((Player) damager).getGameMode() == GameMode.ADVENTURE) return;
        CustomDecor customDecor = new CustomDecor(damaged.getLocation().getBlock(), damager instanceof Player ? ((Player) damager) : null);
        customDecor.breakCustomDecorEntity(damaged);
    }
}
