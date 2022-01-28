package com.quackings.spigot.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;
import org.bukkit.Bukkit;

public class Args implements CommandExecutor {
    App plugin;
    public static boolean disabled = false;

    public Args(App plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("args") && !disabled) {
            sender.sendMessage(ChatColor.GOLD + "[TestPlugin] " + ChatColor.RED + "Args command");
            return true;
        }
        return false;
    }
}