package coil.size

import android.content.Context
import dev.drewhamilton.poko.Poko

/**
 * The default [SizeResolver] that returns the maximum dimension of the display as the size.
 */
@Poko
internal class DisplaySizeResolver(private val context: Context) : SizeResolver {

    override suspend fun size(): Size {
        val metrics = context.resources.displayMetrics
        val maxDimension = Dimension(maxOf(metrics.widthPixels, metrics.heightPixels))
        return Size(maxDimension, maxDimension)
    }
}
