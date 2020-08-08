package cn.inrhor.iservermotd.cmds

import cn.inrhor.iservermotd.utlis.Load
import cn.inrhor.iservermotd.utlis.MsgUtil
import io.izzel.taboolib.module.command.base.BaseCommand
import io.izzel.taboolib.module.command.base.BaseMainCommand
import io.izzel.taboolib.module.command.base.BaseSubCommand
import io.izzel.taboolib.module.command.base.SubCommand
import org.bukkit.command.Command
import org.bukkit.command.CommandSender

@BaseCommand(name = "IServerMotd", aliases = ["isi"], permission = "isi.use")
class Command : BaseMainCommand() {
    @SubCommand(description = "重载配置", permission = "isi.reload")
    val reload = object : BaseSubCommand() {
        override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>) {
            Load.run()
            sender.sendMessage("${MsgUtil.tag}§a已重载 §fIServerMotd §a配置")
        }
    }
}