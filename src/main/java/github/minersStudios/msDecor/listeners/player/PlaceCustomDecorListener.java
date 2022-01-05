package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enumerators.CustomDecorMaterial;
import github.minersStudios.msDecor.objects.CustomDecor;
import github.minersStudios.msDecor.utils.BlockUtils;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class PlaceCustomDecorListener implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        assert event.getClickedBlock() != null;
        if (
                event.getAction() != Action.RIGHT_CLICK_BLOCK
                || (event.getPlayer().getInventory().getItemInMainHand().getType() != Material.PAPER
                    && event.getPlayer().getInventory().getItemInMainHand().getType() != Material.LEATHER_HORSE_ARMOR)
                || event.getHand() != EquipmentSlot.HAND
        ) return;
        Block clickedBlock = event.getClickedBlock(),
                blockAtFace = clickedBlock.getRelative(event.getBlockFace());

        for (Entity nearbyEntity : clickedBlock.getWorld().getNearbyEntities(blockAtFace.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d))
            if(!(nearbyEntity instanceof Item)) return;

        Player player = event.getPlayer();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        assert itemInMainHand.getItemMeta() != null;
        if (!itemInMainHand.getItemMeta().hasCustomModelData()) return;

        if(BlockUtils.REPLACE.contains(clickedBlock.getType()))
            blockAtFace = clickedBlock;

        CustomDecor customDecor = new CustomDecor(blockAtFace, player);
        customDecor.setCustomDecor(Objects.requireNonNull(CustomDecorMaterial.getCustomDecorMaterialByItem(itemInMainHand)), player);
    }
}