package github.minersStudios.Mechanic;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.data.Levelled;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.jetbrains.annotations.NotNull;
import github.minersStudios.Classes.PlaySwingAnimation;
import github.minersStudios.Main;

import java.util.Objects;

public class CustomDecor {
    private Location customDecorLocation;
    private HitBox hitBox;
    private Material hitBoxMaterial;
    private String customName;
    private ItemStack customDecorItemStack;
    private ItemMeta customDecorItemMeta;
    private Sound customDecorSound;
    private float customDecorSoundVolume;
    private float customDecorSoundPitch;
    private boolean removeItemWhenSurvival;
    private boolean degreesDefault;

    // Location

    /**
     * Sets location for custom decor
     */
    public void setLocation(@NotNull Location location){
        this.customDecorLocation = location;
    }

    /**
     * @return Location of custom decor
     */
    public Location getLocation(){
        return customDecorLocation;
    }


    // HitBox

    /**
     * @return True if has hitbox
     */
    public boolean hasHitBox(){
        return hitBox != null;
    }

    /**
     * @return True if hitbox is Solid
     */
    public boolean isSolidHitBox(){
        return hitBox.isSolidHitBox();
    }

    /**
     * @return Hitbox type
     */
    public HitBox getHitBoxType(){
        return hitBox;
    }

    /**
     * @return Material of custom decor
     */
    public Material getHitBoxMaterial(){
        return hitBoxMaterial;
    }

    /**
     * Sets hitbox type and material for custom decor
     */
    public void setHitBox(@NotNull HitBox hitBox, @NotNull Material hitBoxMaterial){
        this.hitBox = hitBox;
        this.hitBoxMaterial = hitBoxMaterial;
    }

    /**
     * Sets hitbox type for custom decor
     */
    public void setHitBox(@NotNull HitBox hitBox){
        this.hitBox = hitBox;
    }



    // Custom Name

    /**
     * @return True if custom decor has custom name
     */
    public boolean hasCustomName(){
        return customName != null;
    }

    /**
     * @return custom name of custom decor
     */
    public String getCustomName(){
        return customName;
    }

    /**
     * Sets custom name for custom decor
     */
    public void setCustomName(@NotNull String customName){
        this.customName = customName;
    }

    // ItemStack

    /**
     * Sets ItemStack for custom decor item
     */
    public void setItemStack(@NotNull ItemStack customDecorItemStack){
        this.customDecorItemStack = customDecorItemStack;
        if(customDecorItemStack.hasItemMeta()){
            customDecorItemMeta = customDecorItemStack.getItemMeta();
        }
    }

    /**
     * @return ItemStack of custom decor item
     */
    public ItemStack getItemStack(){
        return customDecorItemStack;
    }

    // ItemMeta

    /**
     * Sets ItemMeta for custom decor item
     */
    public void setItemMeta(@NotNull ItemMeta customDecorItemMeta){
        if(!customDecorItemStack.hasItemMeta()){
            customDecorItemStack.setItemMeta(customDecorItemMeta);
        } else {
            this.customDecorItemMeta = customDecorItemMeta;
        }
    }

    /**
     * @return True if custom decor has ItemMeta
     */
    public boolean hasItemMeta(){
        return customDecorItemStack.hasItemMeta();
    }

    /**
     * @return ItemMeta of custom decor item
     */
    public ItemMeta getItemMeta(){
        return customDecorItemMeta;
    }

    // RemoveItemWhenSurvival

    /**
     * Removes item when survival
     */
    public void removeItemWhenSurvival(boolean removeItemWhenSurvival) {
        this.removeItemWhenSurvival = removeItemWhenSurvival;
    }

    /**
     * @return True if remove item when survival
     */
    public boolean isRemoveItemWhenSurvival() {
        return removeItemWhenSurvival;
    }

    // DegreesDefault

    /**
     * Removes item when survival
     */
    public void setDegreesDefault(boolean degreesDefault) {
        this.degreesDefault = degreesDefault;
    }

    /**
     * @return True if remove item when survival
     */
    public boolean isDegreesDefault() {
        return degreesDefault;
    }

    // Sound
    /**
     * Sets sound that will play
     */
    public void setPlaySound(Sound sound, float volume, float pitch){
        customDecorSound = sound;
        customDecorSoundVolume = volume;
        customDecorSoundPitch = pitch;
    }

    /**
     * @return Sound that will play
     */
    public Sound getPlaySound(){
        return customDecorSound;
    }

    /**
     * @return Sound volume that will play
     */
    public float getPlaySoundVolume(){
        return customDecorSoundVolume;
    }

    /**
     * @return Sound pitch that will play
     */
    public float getPlaySoundPitch(){
        return customDecorSoundPitch;
    }

    // Set Custom Decor

    /**
     * Sets custom decor
     */
    public void setCustomDecor(Player player){
        Location location = getLocation();
        location.add(0.5F, 0.0F, 0.5F);

        // Summons ArmorStand
        if(!getHitBoxType().equals(HitBox.FRAME) && !getHitBoxType().equals(HitBox.SOLID_FRAME)) {
            location.getBlock().getWorld().spawn(location, ArmorStand.class, (armorStand) -> {
                armorStand.setGravity(false);
                armorStand.setMarker(getHitBoxType().isSolidHitBox());
                armorStand.setSmall(getHitBoxType().equals(HitBox.SMALL) || getHitBoxType().equals(HitBox.SOLID_SMALL));
                armorStand.setVisible(false);
                armorStand.setCollidable(false);
                armorStand.setCustomName(getCustomName());

                ItemStack itemStack = getItemStack();
                ItemMeta itemMeta = getItemMeta();
                itemStack.setItemMeta(itemMeta);

                Objects.requireNonNull(armorStand.getEquipment()).setHelmet(itemStack);

                // Sets Rotate for ArmorStand
                if (degreesDefault) {
                    if (player.getLocation().getYaw() >= 25 && player.getLocation().getYaw() <= 64 && player.getLocation().getYaw() != 45) {
                        Location location45 = armorStand.getLocation();
                        location45.setYaw(45);
                        armorStand.teleport(location45);
                    }
                    if (player.getLocation().getYaw() >= 65 && player.getLocation().getYaw() <= 119 && player.getLocation().getYaw() != 90) {
                        Location location90 = armorStand.getLocation();
                        location90.setYaw(90);
                        armorStand.teleport(location90);
                    }
                    if (player.getLocation().getYaw() >= 120 && player.getLocation().getYaw() <= 139 && player.getLocation().getYaw() != 135) {
                        Location location135 = armorStand.getLocation();
                        location135.setYaw(135);
                        armorStand.teleport(location135);
                    }
                    if (player.getLocation().getYaw() >= 140 && player.getLocation().getYaw() <= 180 && player.getLocation().getYaw() != 180) {
                        Location location180 = armorStand.getLocation();
                        location180.setYaw(180);
                        armorStand.teleport(location180);
                    }
                    if (player.getLocation().getYaw() >= -26 && player.getLocation().getYaw() <= 24 && player.getLocation().getYaw() != 0 && player.getLocation().getYaw() != -180) {
                        Location location0 = armorStand.getLocation();
                        location0.setYaw(0);
                        armorStand.teleport(location0);
                    }
                    if (player.getLocation().getYaw() <= -25 && player.getLocation().getYaw() >= -64 && player.getLocation().getYaw() != -45) {
                        Location locationmin45 = armorStand.getLocation();
                        locationmin45.setYaw(-45);
                        armorStand.teleport(locationmin45);
                    }
                    if (player.getLocation().getYaw() <= -65 && player.getLocation().getYaw() >= -119 && player.getLocation().getYaw() != -90) {
                        Location locationmin90 = armorStand.getLocation();
                        locationmin90.setYaw(-90);
                        armorStand.teleport(locationmin90);
                    }
                    if (player.getLocation().getYaw() <= -120 && player.getLocation().getYaw() >= -150 && player.getLocation().getYaw() != -135) {
                        Location locationmin135 = armorStand.getLocation();
                        locationmin135.setYaw(-135);
                        armorStand.teleport(locationmin135);
                    }
                    if (player.getLocation().getYaw() <= -151 && player.getLocation().getYaw() >= -179 && player.getLocation().getYaw() != -180 && player.getLocation().getYaw() != 0) {
                        Location locationmin180 = armorStand.getLocation();
                        locationmin180.setYaw(-180);
                        armorStand.teleport(locationmin180);
                    }
                } else {
                    if (player.getLocation().getYaw() >= 25 && player.getLocation().getYaw() <= 64 && player.getLocation().getYaw() != 45) {
                        Location location45 = armorStand.getLocation();
                        location45.setYaw(90);
                        armorStand.teleport(location45);
                    }
                    if (player.getLocation().getYaw() >= 65 && player.getLocation().getYaw() <= 119 && player.getLocation().getYaw() != 90) {
                        Location location90 = armorStand.getLocation();
                        location90.setYaw(90);
                        armorStand.teleport(location90);
                    }
                    if (player.getLocation().getYaw() >= 120 && player.getLocation().getYaw() <= 139 && player.getLocation().getYaw() != 135) {
                        Location location135 = armorStand.getLocation();
                        location135.setYaw(180);
                        armorStand.teleport(location135);
                    }
                    if (player.getLocation().getYaw() >= 140 && player.getLocation().getYaw() <= 180 && player.getLocation().getYaw() != 180) {
                        Location location180 = armorStand.getLocation();
                        location180.setYaw(180);
                        armorStand.teleport(location180);
                    }
                    if (player.getLocation().getYaw() >= -26 && player.getLocation().getYaw() <= 24 && player.getLocation().getYaw() != 0 && player.getLocation().getYaw() != -180) {
                        Location location0 = armorStand.getLocation();
                        location0.setYaw(0);
                        armorStand.teleport(location0);
                    }
                    if (player.getLocation().getYaw() <= -25 && player.getLocation().getYaw() >= -64 && player.getLocation().getYaw() != -45) {
                        Location locationmin45 = armorStand.getLocation();
                        locationmin45.setYaw(-90);
                        armorStand.teleport(locationmin45);
                    }
                    if (player.getLocation().getYaw() <= -65 && player.getLocation().getYaw() >= -119 && player.getLocation().getYaw() != -90) {
                        Location locationmin90 = armorStand.getLocation();
                        locationmin90.setYaw(-90);
                        armorStand.teleport(locationmin90);
                    }
                    if (player.getLocation().getYaw() <= -120 && player.getLocation().getYaw() >= -150 && player.getLocation().getYaw() != -135) {
                        Location locationmin135 = armorStand.getLocation();
                        locationmin135.setYaw(-180);
                        armorStand.teleport(locationmin135);
                    }
                    if (player.getLocation().getYaw() <= -151 && player.getLocation().getYaw() >= -179 && player.getLocation().getYaw() != -180 && player.getLocation().getYaw() != 0) {
                        Location locationmin180 = armorStand.getLocation();
                        locationmin180.setYaw(-180);
                        armorStand.teleport(locationmin180);
                    }
                }
            });

            // Sets Block
            new BukkitRunnable() {
                @Override
                public void run() {
                    Block block = location.getBlock();
                    if (getHitBoxMaterial().equals(Material.LIGHT)) {
                        block.setType(Material.LIGHT);
                        Levelled level = (Levelled) block.getBlockData();
                        level.setLevel(0);
                        block.setBlockData(level, true);
                    } else {
                        block.setType(getHitBoxMaterial());
                    }
                }
            }.runTaskLater(JavaPlugin.getPlugin(Main.class), 1L);

            // Plays sound
            location.getBlock().getWorld().playSound(location, getPlaySound(), getPlaySoundVolume(), getPlaySoundPitch());

            // Remove item when survival
            if (player.getGameMode().equals(GameMode.SURVIVAL) && isRemoveItemWhenSurvival()) {
                player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - 1);
            }

            // Plays animation
            new PlaySwingAnimation(player);
        }
    }
}
