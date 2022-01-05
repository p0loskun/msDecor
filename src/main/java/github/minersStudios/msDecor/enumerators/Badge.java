package github.minersStudios.msDecor.enumerators;

public enum Badge {
    PAINTABLE("a"),
    EXCLUSIVE("b"),
    COMMON("c"),
    RARE("d"),
    GOLDEN("e"),
    LEGENDARY("f");

    private final String badgeSymbol;

    Badge(String badgeSymbol){
        this.badgeSymbol = badgeSymbol;
    }

    /**
     * Sets custom decor
     */
    public String getBadgeSymbol() {
        return badgeSymbol;
    }
}
