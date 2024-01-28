package com.activation.build.managers

import com.activation.build.ActivationBuild
import com.activation.build.commands.SpawnCommand
import org.bukkit.command.TabExecutor

object CommandManager {
    private val plugin = ActivationBuild.instance

    fun init() {
        register("spawn", SpawnCommand())
    }

    private fun register(name: String, executor: TabExecutor) {
        val command = plugin.getCommand(name)

        if (command != null) {
            command.setExecutor(executor)
            command.tabCompleter = executor
        }
    }
}