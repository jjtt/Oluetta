package fi.badgamers.oluetta

import android.view.GestureDetector
import android.view.MotionEvent

class GestureListener(private val activity: FullscreenActivity) : GestureDetector.SimpleOnGestureListener() {
    private var count: Int = 0
    private var lastTimestamp: Long = 0


    override fun onDoubleTap(e: MotionEvent?): Boolean {
        val now = System.currentTimeMillis()
        if (now - lastTimestamp > 500) {
            count = 1
        } else {
            count++
        }

        lastTimestamp = now

        if (count > 2) {
            activity.onDoubleTap()
        }

        return true
    }
}