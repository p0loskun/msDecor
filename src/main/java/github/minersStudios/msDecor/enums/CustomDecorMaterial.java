package github.minersStudios.msDecor.enums;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public enum CustomDecorMaterial {
    ACACIA_SMALL_CHAIR("Aкациевый стул", 1000, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SMALL_ARMOR_STAND, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    BIRCH_SMALL_CHAIR("Берёзовый стул", 1001, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    CRIMSON_SMALL_CHAIR("Багровый стул", 1002, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    DARK_OAK_SMALL_CHAIR("Стул из тёмного дуба", 1003, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    JUNGLE_SMALL_CHAIR("Тропический стул", 1004, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    OAK_SMALL_CHAIR("Дубовый стул", 1005, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    SPRUCE_SMALL_CHAIR("Еловый стул", 1006, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    WARPED_SMALL_CHAIR("Искажённый стул", 1007, Material.LEATHER_HORSE_ARMOR,
            Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f,
            HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())
    ),
    ;

    private final String itemName;
    private final int itemCustomModelData;
    private final Material itemMaterial;

    private final Sound placeSound;
    private final Sound breakSound;
    private final float pitch;

    private final HitBox hitBox;
    private final CustomDecorFacing customDecorFacing;
    private final List<String> lore;

    /**
     * @param itemName custom decor item custom name
     * @param itemCustomModelData custom decor item CustomModelData
     * @param itemMaterial custom decor item material
     * @param placeSound custom decor place sound
     * @param breakSound custom decor break sound
     * @param pitch custom decor sound pitch
     * @param hitBox custom decor hitbox
     * @param customDecorFacing custom decor facing
     * @param lore custom decor item lore
     */
    CustomDecorMaterial(
            @Nonnull String itemName,
            int itemCustomModelData,
            @Nonnull Material itemMaterial,
            @Nonnull Sound placeSound,
            @Nonnull Sound breakSound,
            float pitch,
            @Nonnull HitBox hitBox,
            @Nullable CustomDecorFacing customDecorFacing,
            @Nullable List<String> lore
    ) {
        this.itemName = itemName;
        this.itemCustomModelData = itemCustomModelData;
        this.itemMaterial = itemMaterial;

        this.placeSound = placeSound;
        this.breakSound = breakSound;
        this.pitch = pitch;

        this.hitBox = hitBox;
        this.customDecorFacing = customDecorFacing;
        this.lore = lore;
    }

    /**
     * @return Custom decor item CustomModelData integer
     */
    public int getItemCustomModelData(){
        return itemCustomModelData;
    }

    /**
     * @return Custom decor item Material
     */
    public Material getItemMaterial(){
        return itemMaterial;
    }

    /**
     * @return Custom decor hitbox
     */
    public HitBox getHitBox(){
        return hitBox;
    }

    /**
     * @return Custom decor facing
     */
    public CustomDecorFacing getFacing(){
        return customDecorFacing;
    }

    /**
     * @return Custom decor place Sound
     */
    public Sound getPlaceSound(){
        return placeSound;
    }

    /**
     * @return Custom decor break Sound
     */
    public Sound getBreakSound(){
        return breakSound;
    }

    /**
     * @return Custom decor sound pitch
     */
    public float getPitch(){
        return pitch;
    }

    /**
     * @return Custom decor item
     */
    public ItemStack getItemStack(){
        ItemStack itemStack = new ItemStack(itemMaterial);
        ItemMeta itemMeta = itemStack.getItemMeta();
        assert itemMeta != null;
        itemMeta.setCustomModelData(itemCustomModelData);
        itemMeta.setDisplayName(ChatColor.WHITE + itemName);
        if(lore != null) itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }

    /**
     * @return Custom decor material by item in hand
     */
    public static CustomDecorMaterial getCustomDecorMaterialByItem(@Nonnull ItemStack itemStack){
        assert itemStack.getItemMeta() != null;
        for(CustomDecorMaterial customBlockMaterial : CustomDecorMaterial.values()) {
            if(
                    customBlockMaterial.itemMaterial == itemStack.getType() &&
                    customBlockMaterial.itemCustomModelData == itemStack.getItemMeta().getCustomModelData()
            ){
                return customBlockMaterial;
            }
        }
        return null;
    }

    /**
     * @return Custom decor material by item in entity
     */
    public static CustomDecorMaterial getCustomDecorMaterialByEntity(@Nonnull Entity entity){
        for(CustomDecorMaterial customBlockMaterial : CustomDecorMaterial.values()) {
            ItemStack itemStack;
            if(entity instanceof ArmorStand){
                assert ((ArmorStand) entity).getEquipment() != null;

                itemStack = ((ArmorStand) entity).getEquipment().getHelmet();
                assert itemStack != null;
                assert itemStack.getItemMeta() != null;
                if(
                        customBlockMaterial.getItemMaterial() == itemStack.getType() &&
                        customBlockMaterial.getItemCustomModelData() == itemStack.getItemMeta().getCustomModelData()
                ){
                    return customBlockMaterial;
                }
            } else if (entity instanceof ItemFrame){
                assert ((ItemFrame) entity).getItem().getType() != Material.AIR;

                itemStack = ((ItemFrame) entity).getItem();
                assert itemStack.getItemMeta() != null;
                if(
                        customBlockMaterial.getItemMaterial() == itemStack.getType() &&
                        customBlockMaterial.getItemCustomModelData() == itemStack.getItemMeta().getCustomModelData()
                ){
                    return customBlockMaterial;
                }
            }
        }
        return null;
    }
}
