package github.minersStudios.msDecor.enums;

public enum Badge {
    PAINTABLE("a"),
    EXCLUSIVE("b"),
    COMMON("c"),
    RARE("d"),
    GOLDEN("e"),
    LEGENDARY("f");

    private final String badgeSymbol;

    /**
     * @param badgeSymbol badge symbol that will be replaced by resource pack
     */
    Badge(String badgeSymbol){
        this.badgeSymbol = badgeSymbol;
    }

    /**
     * @return Badge symbol as String
     */
    public String getBadgeSymbol() {
        return badgeSymbol;
    }
}
