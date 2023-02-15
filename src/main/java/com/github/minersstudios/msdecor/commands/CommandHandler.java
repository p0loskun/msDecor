package com.github.minersstudios.msdecor.commands;

import com.github.minersstudios.mscore.MSCommand;
import com.github.minersstudios.mscore.MSCommandExecutor;
import com.github.minersstudios.msdecor.customdecor.CustomDecorData;
import com.github.minersstudios.msdecor.customdecor.Typed;
import com.github.minersstudios.msdecor.utils.CustomDecorUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@MSCommand(command = "msdecor")
public class CommandHandler implements MSCommandExecutor {

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String @NotNull ... args) {
		if (args.length > 0) {
			String utilsCommand = args[0].toLowerCase(Locale.ROOT);
			if ("give".equalsIgnoreCase(utilsCommand)) {
				return GiveCommand.runCommand(sender, args);
			}
		}
		return false;
	}

	@Override
	public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String @NotNull ... args) {
		List<String> completions = new ArrayList<>();
		switch (args.length) {
			case 1 -> completions.add("give");
			case 2 -> {
				for (Player player : Bukkit.getOnlinePlayers()) {
					completions.add(player.getName());
				}
			}
			case 3 -> completions.addAll(CustomDecorUtils.CUSTOM_DECORS.keySet());
			case 4 -> {
				CustomDecorData customDecorData = CustomDecorUtils.CUSTOM_DECORS.get(args[2]);
				if (customDecorData instanceof Typed typed) {
					for (Typed.Type type : typed.getTypes()) {
						completions.add(type.getNamespacedKey().getKey());
					}
				}
			}
		}
		return completions;
	}
}
