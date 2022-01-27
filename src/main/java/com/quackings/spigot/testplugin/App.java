package com.quackings.spigot.testplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("bruhwhy").setExecutor(new TestCommand(this));
    }

    @Override
    public void onDisable() {
        
    }
}