package com.blockydeer.endercontract;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    public static JavaPlugin plugin = null;
    public static final String VERSION = "Season 1";
    @Override
    public void onEnable() {
        // Plugin startup logic
        Main.plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
