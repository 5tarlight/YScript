package com.github.yeahx4.script

import java.io.File
import java.io.FileInputStream
import java.util.*

class ScriptFileManager {
    companion object {
        const val path = "plugins/YScript/"
        val dir = File(path)

        fun readScript(name: String) {

        }

        fun readScripts(): List<String> {
            var list = mutableListOf<String>();
            dir.walkTopDown().forEach { list.add(it.name) }
            return list
        }
    }
}