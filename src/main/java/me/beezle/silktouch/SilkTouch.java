package me.beezle.silktouch;

import org.bukkit.plugin.java.JavaPlugin;

public class SilkTouch extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockHandler(), this);
        System.out.print("[SilkTouch] Enabled.");
    }

    @Override
    public void onDisable() {
        System.out.print("[SilkTouch] Disabled.");
    }
}
