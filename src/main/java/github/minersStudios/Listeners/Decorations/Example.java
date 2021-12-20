package github.minersStudios.Listeners.Decorations;

import github.minersStudios.Mechanic.CustomDecor;
import github.minersStudios.Mechanic.HitBox;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Example {

    public static void onClick(Player player, Location location) {

        ItemMeta getMeta = player.getInventory().getItemInMainHand().getItemMeta();

        CustomDecor customDecor = new CustomDecor();
        customDecor.setLocation(location);
        customDecor.setCustomName("plush");
        customDecor.setHitBox(HitBox.SOLID_SMALL, Material.STRUCTURE_VOID);
        customDecor.setPlaySound(Sound.BLOCK_WOOL_PLACE, 1, 1);
        customDecor.setDegreesDefault(true);

        ItemStack itemStack = new ItemStack(Material.PAPER);
        itemStack.setItemMeta(getMeta);

        customDecor.setItemStack(itemStack);
        customDecor.setCustomDecor(player);


        /*
        if(e.getClickedBlock() != null){
            Block clickedBlock = e.getClickedBlock();
            CustomDecor customDecor = new CustomDecor();
            assert clickedBlock != null;

            if(!customDecor.hasHitBox()){
                if(clickedBlock.getType().isSolid()){
                    customDecor.setHitBox(HitBox.SOLID_NORMAL, clickedBlock.getType());
                } else {
                    customDecor.setHitBox(HitBox.NORMAL);
                }

                if(customDecor.isSolidHitBox() && customDecor.getHitBoxMaterial().equals(Material.DIRT)){

                    if(!customDecor.hasCustomName()){
                        customDecor.setCustomName("a");
                        customDecor.setItemStack(new ItemStack(customDecor.getHitBoxMaterial()));
                        customDecor.setLocation(clickedBlock.getLocation());
                        customDecor.removeItemWhenSurvival(true);
                        customDecor.setPlaySound(Sound.BLOCK_LAVA_EXTINGUISH, 1, 1);
                        if(!customDecor.hasItemMeta()){
                            e.getPlayer().sendMessage(
                                    customDecor.getCustomName() + "\n" +
                                            customDecor.getHitBoxType() + "\n" +
                                            customDecor.getHitBoxMaterial() + "\n" +
                                            customDecor.getItemStack() + "\n" +
                                            customDecor.hasItemMeta() + "\n" +
                                            customDecor.getLocation() + "\n" +
                                            customDecor.isRemoveItemWhenSurvival() + "\n" +
                                            customDecor.getPlaySound() + "\n" +
                                            customDecor.getPlaySoundVolume() + "\n" +
                                            customDecor.getPlaySoundPitch()
                            );
                        }
                    }
                }
            }
        }
         */
    }
}
