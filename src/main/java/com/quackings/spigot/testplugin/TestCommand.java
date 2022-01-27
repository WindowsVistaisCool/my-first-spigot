package com.quackings.spigot.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class TestCommand implements CommandExecutor {
    App plugin;

    public TestCommand(App plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("bruhwhy")) {
            sender.sendMessage(ChatColor.GREEN + "testing did work yay!!!");
            return true;
        }
        return false;
    }
}