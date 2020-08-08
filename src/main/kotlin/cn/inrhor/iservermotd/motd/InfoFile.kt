package cn.inrhor.iservermotd.motd

import cn.inrhor.iservermotd.IServerMotd
import org.bukkit.Bukkit
import org.bukkit.util.CachedServerIcon
import java.io.File


object InfoFile {
    var motdOne : String? = null
    var motdTwo : String? = null
    var icon : CachedServerIcon? = null

    fun getDate() {
        motdOne = IServerMotd.config.getString("motd.text.one")?.replace("&", "§")+"§r"
        motdTwo = IServerMotd.config.getString("motd.text.two")?.replace("&", "§")

        val motdIcon = IServerMotd.config.getString("motd.icon")

        val file = File(IServerMotd.plugin.dataFolder, "$motdIcon.png")

        if (!file.exists()) return
        icon =
            Bukkit.loadServerIcon(
                file
            )
    }
}