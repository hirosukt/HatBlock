package love.chihuyu

import love.chihuyu.commands.impl.Hat
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class HatBlock : JavaPlugin(), Listener {

    companion object {
        lateinit var plugin: JavaPlugin
    }

    init {
        plugin = this
    }

    override fun onEnable() {
        logger.info("plugin has loaded.")
        server.pluginManager.registerEvents(this, this)
        Hat.register()
    }

    override fun onDisable() {
        logger.info("plugin has unloaded.")
    }
}