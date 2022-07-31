package github.minersStudios.msDecor.listeners.player;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;

public class InventoryCreativeListener implements Listener {

	@EventHandler
	public void onInventoryCreative(@Nonnull InventoryCreativeEvent event) {
		if (event.getClick() != ClickType.CREATIVE) return;
		HumanEntity player = event.getWhoClicked();
		Block clickedBlock = player.getTargetBlockExact(5);
		if (
				clickedBlock != null
						&& (event.getCursor().getType() == Material.BARRIER || event.getCursor().getType() == Material.STRUCTURE_VOID)
		) {
			CustomDecorMaterial customDecorMaterial = null;
			ItemStack itemStack = null;
			ItemMeta itemMeta = null;
			for (Entity nearbyEntity : clickedBlock.getWorld().getNearbyEntities(clickedBlock.getLocation().add(0.5d, 0.5d, 0.5d), 0.5d, 0.5d, 0.5d)) {
				if (nearbyEntity instanceof ItemFrame itemFrame && itemFrame.getItem().getItemMeta() != null) {
					customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(itemFrame, true);
					itemStack = itemFrame.getItem();
					itemMeta = itemStack.getItemMeta();
					itemMeta.displayName(nearbyEntity.name());
				}
			}
			if (customDecorMaterial == null) {
				for (Entity nearbyEntity : clickedBlock.getWorld().getNearbyEntities(clickedBlock.getLocation().add(0.5d, 0.0d, 0.5d), 0.2d, 0.3d, 0.2d)) {
					if (nearbyEntity instanceof ArmorStand armorStand && armorStand.getEquipment().getHelmet() != null) {
						customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(armorStand, true);
						itemStack = armorStand.getEquipment().getHelmet();
					}
				}
			}
			if (itemStack != null && customDecorMaterial != null) {
				event.setCancelled(true);
				if (itemMeta == null)
					itemMeta = itemStack.getItemMeta();
				assert itemMeta != null;
				itemMeta.setCustomModelData(customDecorMaterial.getItemCustomModelData());
				itemStack.setItemMeta(itemMeta);
				player.getInventory().setItem(event.getSlot(), itemStack);
			}
		}
	}
}