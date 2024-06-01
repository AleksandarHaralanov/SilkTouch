package me.beezle.silktouch;

import org.bukkit.plugin.java.JavaPlugin;

public class SilkTouch extends JavaPlugin {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new BlockHandler(), this);
        System.out.print("[SilkTouch] Enabled.");
    }

    public void onDisable() {
        System.out.print("[SilkTouch] Disabled.");
    }
}
