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
    ACACIA_SMALL_CHAIR("Aкациевый стул", 1000, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_SMALL_CHAIR("Берёзовый стул", 1001, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_SMALL_CHAIR("Багровый стул", 1002, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_SMALL_CHAIR("Стул из тёмного дуба", 1003, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_SMALL_CHAIR("Тропический стул", 1004, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_SMALL_CHAIR("Дубовый стул", 1005, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_SMALL_CHAIR("Еловый стул", 1006, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_SMALL_CHAIR("Искажённый стул", 1007, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    ACACIA_CHAIR("Aкациевый стул со спинкой", 1008, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    BIRCH_CHAIR("Берёзовый стул со спинкой", 1009, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    CRIMSON_CHAIR("Багровый стул со спинкой", 1010, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    DARK_OAK_CHAIR("Стул из тёмного дуба со спинкой", 1011, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    JUNGLE_CHAIR("Тропический стул со спинкой", 1012, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    OAK_CHAIR("Дубовый стул со спинкой", 1013, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    SPRUCE_CHAIR("Еловый стул со спинкой", 1014, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    WARPED_CHAIR("Искажённый стул со спинкой", 1015, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 0.5f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    BAR_STOOL("Барный стул", 1016, Sound.BLOCK_CHAIN_PLACE, Sound.BLOCK_CHAIN_BREAK, 1.0f, HitBox.SOLID_FRAME, CustomDecorFacing.FLOOR, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),

    SMALL_CLOCK("Настенные часы", 1017, Sound.BLOCK_WOOD_PLACE, Sound.BLOCK_WOOD_BREAK, 1.0f, HitBox.FRAME, CustomDecorFacing.WALL, Collections.singletonList(Badge.PAINTABLE.getBadgeSymbol())),
    ;

    private final String itemName;
    private final int itemCustomModelData;

    private final Sound placeSound;
    private final Sound breakSound;
    private final float pitch;

    private final HitBox hitBox;
    private final CustomDecorFacing customDecorFacing;
    private final List<String> lore;

    /**
     * @param itemName custom decor item custom name
     * @param itemCustomModelData custom decor item CustomModelData
     *
     * @param placeSound custom decor place sound
     * @param breakSound custom decor break sound
     * @param pitch custom decor sound pitch
     *
     * @param hitBox custom decor hitbox
     * @param customDecorFacing custom decor facing
     * @param lore custom decor item lore
     */
    CustomDecorMaterial(
            @Nonnull String itemName,
            int itemCustomModelData,
            @Nonnull Sound placeSound,
            @Nonnull Sound breakSound,
            float pitch,
            @Nonnull HitBox hitBox,
            @Nullable CustomDecorFacing customDecorFacing,
            @Nullable List<String> lore
    ) {
        this.itemName = itemName;
        this.itemCustomModelData = itemCustomModelData;

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
     * @return Custom decor hitbox
     */
    @Nonnull
    public HitBox getHitBox(){
        return hitBox;
    }

    /**
     * @return Custom decor facing
     */
    @Nullable
    public CustomDecorFacing getFacing(){
        return customDecorFacing;
    }

    /**
     * @return Custom decor place Sound
     */
    @Nonnull
    public Sound getPlaceSound(){
        return placeSound;
    }

    /**
     * @return Custom decor break Sound
     */
    @Nonnull
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
    @Nonnull
    public ItemStack getItemStack(){
        ItemStack itemStack = new ItemStack(Material.LEATHER_HORSE_ARMOR);
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
    @Nullable
    public static CustomDecorMaterial getCustomDecorMaterialByItem(@Nonnull ItemMeta itemMeta){
        for(CustomDecorMaterial customBlockMaterial : CustomDecorMaterial.values()) {
            if(customBlockMaterial.itemCustomModelData == itemMeta.getCustomModelData()) return customBlockMaterial;
        }
        return null;
    }

    /**
     * @return Custom decor material by item in entity
     */
    @Nullable
    public static CustomDecorMaterial getCustomDecorMaterialByEntity(@Nonnull Entity entity){
        for(CustomDecorMaterial customBlockMaterial : CustomDecorMaterial.values()) {
            if(entity instanceof ArmorStand && ((ArmorStand) entity).getEquipment() != null){
                ItemStack helmetItem = ((ArmorStand) entity).getEquipment().getHelmet();
                if(helmetItem != null && helmetItem.getItemMeta() != null && customBlockMaterial.getItemCustomModelData() == helmetItem.getItemMeta().getCustomModelData()) return customBlockMaterial;
            } else if (entity instanceof ItemFrame && ((ItemFrame) entity).getItem().getType() != Material.AIR){
                ItemStack item = ((ItemFrame) entity).getItem();
                if(item.getItemMeta() != null && customBlockMaterial.getItemCustomModelData() == item.getItemMeta().getCustomModelData()) return customBlockMaterial;
            }
        }
        return null;
    }
}
