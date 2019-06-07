package com.namazed.beatboxbignerdranch

class Sound internal constructor(internal val assetPath: String) {
    val name: String
    internal var soundId: Int = 0

    init {
        val components = assetPath.split("/".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val filename = components[components.size - 1]
        name = filename.replace(".wav", "")
    }
}