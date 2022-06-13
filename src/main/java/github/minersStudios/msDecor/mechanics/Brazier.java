package github.minersStudios.msDecor.mechanics;

import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import github.minersStudios.msDecor.utils.PlaySwingAnimation;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;

import javax.annotation.Nonnull;

public class Brazier implements Listener {

    @EventHandler
    public void onPlayerInteractAtEntity(@Nonnull PlayerInteractAtEntityEvent event) {
        if(!(event.getRightClicked() instanceof ArmorStand armorStand) || armorStand.getEquipment() == null) return;
        Player player = event.getPlayer();
        ItemStack itemInMainHand = player.getInventory().getItemInMainHand();
        if(itemInMainHand.getType() != Material.FLINT_AND_STEEL && !itemInMainHand.getType().toString().matches(".*_SHOVEL")) return;
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.getCustomDecorMaterialByEntity(armorStand, false);
        Block block = armorStand.getLocation().getBlock();
        if(block.getType() != Material.LIGHT) return;
        Levelled level15 = (Levelled) block.getBlockData(),
                level0 = (Levelled) block.getBlockData();
        level15.setLevel(15);
        level0.setLevel(0);

        Damageable itemMeta = (Damageable) itemInMainHand.getItemMeta();
        assert itemMeta != null;
        itemMeta.setDamage(itemMeta.getDamage() + 1);
        if(customDecorMaterial == CustomDecorMaterial.BRAZIER && itemInMainHand.getType() == Material.FLINT_AND_STEEL) {
            armorStand.getEquipment().setHelmet(CustomDecorMaterial.BRAZIER_FIRE.getItemStack());
            block.setType(Material.LIGHT);
            new PlaySwingAnimation(player, EquipmentSlot.HAND);
            block.setBlockData(level15, true);
            itemInMainHand.setItemMeta(itemMeta);
            player.getWorld().playSound(armorStand.getLocation(), Sound.ITEM_FLINTANDSTEEL_USE, 1.0f, 1.0f);
        } else if(customDecorMaterial == CustomDecorMaterial.BRAZIER_FIRE && itemInMainHand.getType().toString().matches(".*_SHOVEL")){
            armorStand.getEquipment().setHelmet(CustomDecorMaterial.BRAZIER.getItemStack());
            block.setType(Material.LIGHT);
            new PlaySwingAnimation(player, EquipmentSlot.HAND);
            block.setBlockData(level0, true);
            itemInMainHand.setItemMeta(itemMeta);
            player.getWorld().playSound(armorStand.getLocation(), Sound.BLOCK_FIRE_EXTINGUISH, 1.0f, 1.0f);
        }
    }
}
