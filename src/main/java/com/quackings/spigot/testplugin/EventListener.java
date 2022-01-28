package com.quackings.spigot.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.Bukkit;

public class EventListener implements Listener {
    public static boolean disabled = false;

    @EventHandler
    public void onLogin(AsyncPlayerPreLoginEvent event) {
        if (!disabled) {
            event.disallow(AsyncPlayerPreLoginEvent.Result.KICK_FULL, "§c§lThis server is in maintenance!\n§c§lPlease try again later.\n\n\n§8§oIf you are a staff member, please\ncontact the owner.");
        }
    }

}