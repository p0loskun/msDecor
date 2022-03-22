package github.minersStudios.msDecor.enums;

import org.bukkit.ChatColor;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public enum Symbols {
    PAINTABLE("\uA022"),
    ;

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
