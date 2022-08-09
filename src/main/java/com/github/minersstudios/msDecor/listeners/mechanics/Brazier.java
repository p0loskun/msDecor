package com.github.minersstudios.msDecor.listeners.mechanics;

import com.github.minersstudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

import javax.annotation.Nonnull;

public class Brazier implements Listener {

	@EventHandler
	public void onPlayerInteractAtEntity(@Nonnull PlayerInteractAtEntityEvent event) {
		if (!(event.getRightClicked() instanceof ArmorStand armorStand)) return;
		Player player = event.getPlayer();
		ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
		if (itemInMainHand.getType() != Material.FLINT_AND_STEEL && !itemInMainHand.getType().toString().matches(".*_SHOVEL")) return;
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(armorStand, false);
		Block block = armorStand.getLocation().getBlock();
		if (block.getType() != Material.LIGHT || !(itemInMainHand.getItemMeta() instanceof Damageable itemMeta)) return;
		itemMeta.setDamage(itemMeta.getDamage() + 1);
		if (customDecorMaterial == CustomDecorMaterial.BRAZIER && itemInMainHand.getType() == Material.FLINT_AND_STEEL) {
			Levelled level15 = (Levelled) block.getBlockData();
			level15.setLevel(15);
			block.setType(Material.LIGHT);
			block.setBlockData(level15, true);
			armorStand.getEquipment().setHelmet(CustomDecorMaterial.BRAZIER_FIRE.getItemStack());
			itemInMainHand.setItemMeta(itemMeta);
			player.swingMainHand();
			player.getWorld().playSound(armorStand.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 1.0f);
		} else if (customDecorMaterial == CustomDecorMaterial.BRAZIER_FIRE && itemInMainHand.getType().toString().matches(".*_SHOVEL")) {
			Levelled level0 = (Levelled) block.getBlockData();
			level0.setLevel(0);
			block.setType(Material.LIGHT);
			block.setBlockData(level0, true);
			armorStand.getEquipment().setHelmet(CustomDecorMaterial.BRAZIER.getItemStack());
			player.swingMainHand();
			itemInMainHand.setItemMeta(itemMeta);
			player.getWorld().playSound(armorStand.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 1.0f, 1.0f);
		}
	}
}
