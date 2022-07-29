package github.minersStudios.msDecor.listeners.mechanics;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msUtils.utils.ChatUtils;
import net.kyori.adventure.text.Component;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class TrashCan implements Listener {
	private static final String INV_NAME = ChatColor.DARK_GRAY + "Мусорка";

	@EventHandler(priority = EventPriority.LOW, ignoreCancelled = true)
	public void onPlayerInteract(@Nonnull PlayerInteractEvent event) {
		if (event.getClickedBlock() == null) return;
		Player player = event.getPlayer();
		ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
		Block clickedBlock = event.getClickedBlock();
		if (
				event.getAction() == Action.RIGHT_CLICK_BLOCK
				&& (!itemInMainHand.getType().isBlock() || itemInMainHand.getType() == Material.AIR)
				&& event.getHand() == EquipmentSlot.HAND
				&& event.getPlayer().getGameMode() != GameMode.SPECTATOR
				&& clickedBlock.getType() == Material.BARRIER
		) {
			for (Entity nearbyEntity : player.getWorld().getNearbyEntities(clickedBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
				if (nearbyEntity.getType() == EntityType.ARMOR_STAND || nearbyEntity.getType() == EntityType.ITEM_FRAME) {
					CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(nearbyEntity, false);
					if (customDecorMaterial == CustomDecorMaterial.IRON_TRASHCAN) {
						player.openInventory(Bukkit.createInventory(null, 4 * 9, Component.text(INV_NAME)));
						player.getWorld().playSound(clickedBlock.getLocation(), Sound.BLOCK_BARREL_OPEN, 1.0f, 1.0f);
						player.swingMainHand();
					}
				}
			}
		}
	}

	@EventHandler
	public void onInventoryClose(@Nonnull InventoryCloseEvent event) {
		HumanEntity player = event.getPlayer();
		if (ChatUtils.legacyComponentSerialize(event.getView().title()).equalsIgnoreCase(INV_NAME))
			player.getWorld().playSound(player.getLocation(), Sound.BLOCK_BARREL_CLOSE, 1.0f, 1.0f);
	}
}