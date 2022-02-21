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
        switch (this) {
            case SOLID_FRAME:
            case SOLID_SMALL_ARMOR_STAND:
            case SOLID_NORMAL_ARMOR_STAND:
                return true;
            default:
                return false;
        }
    }

    /**
     * @return True if hitbox of custom decor is structure void
     */
    public boolean isStructureHitBox() {
        switch (this) {
            case STRUCTURE_FRAME:
            case STRUCTURE_SMALL_ARMOR_STAND:
            case STRUCTURE_NORMAL_ARMOR_STAND:
                return true;
            default:
                return false;
        }
    }

    /**
     * @return True if hitbox of custom decor is armor stand
     */
    public boolean isArmorStand() {
        switch (this) {
            case SOLID_SMALL_ARMOR_STAND:
            case SOLID_NORMAL_ARMOR_STAND:
            case NORMAL_ARMOR_STAND:
            case SMALL_ARMOR_STAND:
            case STRUCTURE_NORMAL_ARMOR_STAND:
            case STRUCTURE_SMALL_ARMOR_STAND:
                return true;
            default:
                return false;
        }
    }
}
