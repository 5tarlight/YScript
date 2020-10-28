package com.github.yeahx4.commands

import com.github.yeahx4.script.ScriptFileManager
import com.github.yeahx4.utils.PlayerContacter
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class ScriptListCommand : CommandExecutor {
    override fun onCommand(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>
    ): Boolean {
        if (!sender.isOp()) {
            PlayerContacter.sendPermissionDenied(sender)
            return true
        }

        val scripts = ScriptFileManager.readScripts()

        scripts.forEach {
            if (it.endsWith(".yscript")) {
                sender.sendMessage(it.substring(0, ".yscript".length))
            }
        }

        return true
    }
}