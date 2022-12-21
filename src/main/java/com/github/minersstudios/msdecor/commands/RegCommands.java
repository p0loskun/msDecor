package com.github.minersstudios.msdecor.commands;

import com.github.minersstudios.msdecor.Main;
import com.github.minersstudios.msdecor.tabcompleters.TabCommandHandler;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public final class RegCommands {

	private RegCommands() {
		throw new IllegalStateException();
	}

	public static void init(@NotNull Main plugin) {
		Objects.requireNonNull(plugin.getCommand("msdecor")).setExecutor(new CommandHandler());
		Objects.requireNonNull(plugin.getCommand("msdecor")).setTabCompleter(new TabCommandHandler());
	}
}
