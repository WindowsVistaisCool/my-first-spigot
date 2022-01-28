package com.quackings.spigot.testplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropItem implements Listener {
    public static boolean disabled = false;

    @EventHandler
    public void onDrop(PlayerDropItemEvent event) {
        if (!disabled) {
            event.setCancelled(true);
        }
    }
}