package cn.inrhor.iservermotd.utlis

import org.bukkit.Bukkit

object MsgUtil {

    const val tag = "§7§l[ §c§li §7§l]§r "

    fun send(msg : String) {
        Bukkit.getConsoleSender().sendMessage(msg.replace("&", "§"))
    }

}