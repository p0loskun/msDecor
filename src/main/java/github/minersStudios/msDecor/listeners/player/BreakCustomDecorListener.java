package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.objects.CustomDecor;
import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class BreakCustomDecorListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event){
        assert event.getClickedBlock() != null;
        Block block = event.getClickedBlock();
        Player player = event.getPlayer();
        if (
                event.getAction() != Action.LEFT_CLICK_BLOCK
                || !BlockUtils.CUSTOM_BLOCK_MATERIALS.contains(block.getType())
        ) return;
        if((player.isSneaking() && player.getGameMode() == GameMode.SURVIVAL) || player.getGameMode() == GameMode.CREATIVE){
            CustomDecor customDecor = new CustomDecor(block, player);
            customDecor.breakCustomDecor();
        }
    }

}
