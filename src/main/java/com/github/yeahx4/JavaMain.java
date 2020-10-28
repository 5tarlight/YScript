package com.github.yeahx4;

import com.github.yeahx4.commands.ScriptListCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class JavaMain extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "YScript enabled");

        getCommand("scriptlist").setExecutor(new ScriptListCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "YScript disabled");
    }
}
