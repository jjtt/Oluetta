package fi.badgamers.oluetta

import android.view.GestureDetector
import android.view.MotionEvent

class GestureListener(private val activity: FullscreenActivity) : GestureDetector.SimpleOnGestureListener() {

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        activity.onDoubleTap()
        return true
    }
}