package com.queazified.hellopurpur;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloPurpur extends JavaPlugin {

    @Override
    public void onEnable() {
        // Log to console
        getLogger().info("================================================");
        getLogger().info(" 🚀 HelloPurpur has been enabled successfully!");
        getLogger().info(" ✅ Running on " + getServer().getName() + " " + getServer().getVersion());
        getLogger().info("================================================");

        // Broadcast to all online players after a short delay (1 second = 20 ticks)
        Bukkit.getScheduler().runTaskLater(this, () -> {
            String[] messages = {
                "§6================================================",
                "§6🚀 HelloPurpur has been enabled successfully!",
                "§a✅ Running on " + getServer().getName() + " " + getServer().getVersion(),
                "§6================================================"
            };
            for (String msg : messages) {
                Bukkit.broadcastMessage(msg);
            }
        }, 20L); // 20 ticks = 1 second
    }

    @Override
    public void onDisable() {
        getLogger().info("❌ HelloPurpur has been disabled.");
    }
}
