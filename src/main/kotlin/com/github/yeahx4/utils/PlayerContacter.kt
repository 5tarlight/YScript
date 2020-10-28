package com.github.yeahx4.utils

import org.bukkit.ChatColor
import org.bukkit.command.CommandSender

class PlayerContacter {
    companion object {
        fun sendPermissionDenied(sender: CommandSender) {
            sender.sendMessage(ChatColor.RED.toString() + "Permission denied")
        }
    }
}