package com.quackings.spigot.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class Menu implements CommandExecutor {
    App plugin;

    public Menu(App plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("menu")) {
            sender.sendMessage(ChatColor.GOLD + "[TestPlugin] " + ChatColor.RED + "This is a menu!");
            return true;
        }
        return false;
    }
}