package github.minersStudios.Decorations;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.meta.ItemMeta;

public class MainListener implements Listener {

    @EventHandler
    public void PlayerInteractEvent(PlayerInteractEvent e){
        Player player = e.getPlayer();

        if (
                e.getAction() == Action.RIGHT_CLICK_BLOCK &&
                        player.getInventory().getItemInMainHand().getType().equals(Material.PAPER) &&
                        e.getHand() == EquipmentSlot.OFF_HAND &&
                        player.getInventory().getItemInMainHand().hasItemMeta()
        ) {

            ItemMeta itemMeta = player.getInventory().getItemInMainHand().getItemMeta();
            assert itemMeta != null;

            if(itemMeta.hasCustomModelData()){

                Block clickedBlock = e.getClickedBlock();
                assert clickedBlock != null;

                Location location = clickedBlock.getRelative(e.getBlockFace()).getLocation();

                if (location.getBlock().getType().equals(Material.AIR)) {

                    if (itemMeta.getCustomModelData() == 6999)
                        Example.onClick(player, location);


                }
            }
        }
    }
}
