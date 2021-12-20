package github.minersStudios.Mechanic;

public enum HitBox {
    /**
     * Using Frame for custom decor
     */
    FRAME,
    /**
     * Using small ArmorStand for custom decor
     */
    SMALL,
    /**
     * Using normal ArmorStand for custom decor
     */
    NORMAL,
    /**
     * Using Frame with solid block for custom decor
     */
    SOLID_FRAME,
    /**
     * Using small ArmorStand with solid block for custom decor
     */
    SOLID_SMALL,
    /**
     * Using normal ArmorStand with solid block for custom decor
     */
    SOLID_NORMAL;

    public boolean isSolidHitBox() {
        switch (this) {
            case SOLID_FRAME:
            case SOLID_SMALL:
            case SOLID_NORMAL:
                return true;
            default:
                return false;
        }
    }
}
