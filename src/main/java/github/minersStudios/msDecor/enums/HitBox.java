package github.minersStudios.msDecor.enums;

/**
 * Custom Decor HitBox enum used to define the decor's hitbox
 */
public enum HitBox {
    FRAME,
    SOLID_FRAME,
    STRUCTURE_FRAME,
    SMALL_ARMOR_STAND,
    STRUCTURE_SMALL_ARMOR_STAND,
    SOLID_SMALL_ARMOR_STAND,
    NORMAL_ARMOR_STAND,
    SOLID_NORMAL_ARMOR_STAND,
    STRUCTURE_NORMAL_ARMOR_STAND;

    /**
     * @return True if hitbox of custom decor is barrier
     */
    public boolean isSolidHitBox() {
        return switch (this) {
            case SOLID_FRAME, SOLID_SMALL_ARMOR_STAND, SOLID_NORMAL_ARMOR_STAND -> true;
            default -> false;
        };
    }

    /**
     * @return True if hitbox of custom decor is structure void
     */
    public boolean isStructureHitBox() {
        return switch (this) {
            case STRUCTURE_FRAME, STRUCTURE_SMALL_ARMOR_STAND, STRUCTURE_NORMAL_ARMOR_STAND -> true;
            default -> false;
        };
    }

    /**
     * @return True if hitbox of custom decor is armor stand
     */
    public boolean isArmorStand() {
        return switch (this) {
            case SOLID_SMALL_ARMOR_STAND, SOLID_NORMAL_ARMOR_STAND, NORMAL_ARMOR_STAND, SMALL_ARMOR_STAND, STRUCTURE_NORMAL_ARMOR_STAND, STRUCTURE_SMALL_ARMOR_STAND -> true;
            default -> false;
        };
    }
}
