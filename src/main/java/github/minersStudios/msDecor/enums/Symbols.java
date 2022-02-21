package github.minersStudios.msDecor.enums;

import org.bukkit.ChatColor;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public enum Symbols {
    ERROR("a"),
    WARN("b"),
    INFO("c"),
    PAINTABLE("d"),
    EXCLUSIVE("e"),
    COMMON("f"),
    RARE("g"),
    GOLDEN("h"),
    LEGENDARY("i");

    private final String symbol;

    /**
     * @param symbol badge symbol that will be replaced by resource pack
     */
    Symbols(String symbol){
        this.symbol = symbol;
    }

    /**
     * @return Badge symbol as String
     */
    @Nonnull
    public String getSymbol() {
        return ChatColor.WHITE + symbol;
    }
}
