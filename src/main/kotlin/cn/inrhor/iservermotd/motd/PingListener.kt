package cn.inrhor.iservermotd.motd

import io.izzel.taboolib.module.inject.TListener
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.server.ServerListPingEvent

@TListener
class PingListener : Listener {

    @EventHandler
    fun onPing(ev : ServerListPingEvent) {
        ev.motd = InfoFile.motdOne+"\n"+InfoFile.motdTwo
        ev.setServerIcon(InfoFile.icon)
    }

}