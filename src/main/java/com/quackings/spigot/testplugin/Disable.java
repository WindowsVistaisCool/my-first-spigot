package com.quackings.spigot.testplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;

public class Disable implements CommandExecutor {
    App plugin;
    public static boolean disabled = false;

    public Disable(App plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("disable") && !disabled) {
            sender.sendMessage(ChatColor.GOLD + "[TestPlugin] " + ChatColor.RED + "Event listeners disabled!");
            this.plugin.disable();
            return true;
        } else if (command.getName().equalsIgnoreCase("disable") && disabled) {
            sender.sendMessage(ChatColor.GOLD + "[TestPlugin] " + ChatColor.RED + "Event listeners enabling...");
            this.plugin.enable();
            return true;
        }
        return false;
    }

}