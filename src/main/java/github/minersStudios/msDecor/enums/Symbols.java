package github.minersStudios.msDecor.enums;

import lombok.Getter;
import org.bukkit.ChatColor;

public enum Symbols {
    PAINTABLE(ChatColor.WHITE + "\uA022");

    @Getter private final String symbol;

    /**
     * @param symbol badge symbol that will be replaced by resource pack
     */
    Symbols(String symbol) {
        this.symbol = symbol;
    }
}
