package com.quackings.spigot.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("args").setExecutor(new Args(this));
        getCommand("disable").setExecutor(new Disable(this));
        getServer().getPluginManager().registerEvents(new EventListener(), this);
        getServer().getPluginManager().registerEvents(new DropItem(), this);
    }

    public void disable() {
        // Args.disabled = true;
        // Disable.disabled = true;
        EventListener.disabled = true;
    }

    public void enable() {
        // Args.disabled = false;
        // Disable.disabled = false;
        EventListener.disabled = false;
    }

    @Override
    public void onDisable() {
        
    }
}