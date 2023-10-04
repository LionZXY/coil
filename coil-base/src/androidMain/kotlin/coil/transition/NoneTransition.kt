package coil.transition

import coil.request.ErrorResult
import coil.request.ImageResult
import coil.request.SuccessResult
import dev.drewhamilton.poko.Poko

/**
 * A transition that applies the [ImageResult] on the [TransitionTarget] without animating.
 */
@Poko
internal class NoneTransition(
    private val target: TransitionTarget,
    private val result: ImageResult
) : Transition {

    override fun transition() {
        when (result) {
            is SuccessResult -> target.onSuccess(result.image)
            is ErrorResult -> target.onError(result.image)
        }
    }

    class Factory : Transition.Factory {

        override fun create(target: TransitionTarget, result: ImageResult): Transition {
            return NoneTransition(target, result)
        }
    }
}
