package sample.common

import coil.memory.MemoryCache

sealed class Screen {

    data object List : Screen()

    data class Detail(
        val image: Image,
        val placeholder: MemoryCache.Key?,
    ) : Screen()
}
