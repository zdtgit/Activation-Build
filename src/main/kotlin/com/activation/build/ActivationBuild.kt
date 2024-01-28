package com.activation.build

import com.activation.build.managers.CommandManager
import org.bukkit.plugin.java.JavaPlugin

class ActivationBuild: JavaPlugin() {
    override fun onEnable() {
        CommandManager.init()
    }

    companion object {
        val instance: ActivationBuild
            get() = getPlugin(ActivationBuild::class.java)
    }
}