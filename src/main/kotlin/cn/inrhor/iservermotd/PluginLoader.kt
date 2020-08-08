package cn.inrhor.iservermotd

import cn.inrhor.iservermotd.utlis.Load
import cn.inrhor.iservermotd.utlis.MsgUtil

class PluginLoader {

    fun init() { // 启动阶段
        MsgUtil.send("${MsgUtil.tag} ┍  &a正在加载  &fIServerMotd  &a插件")
        MsgUtil.send("${MsgUtil.tag} ┝  &3插件当前版本： &f0.0.1")
        MsgUtil.send("${MsgUtil.tag} ┕  &a插件正常运行")
        Load.run()
    }

}