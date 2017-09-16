package fi.badgamers.oluetta

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.support.v4.content.ContextCompat.startActivity
import android.content.pm.PackageManager
import android.content.ComponentName


class HomeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, FullscreenActivity::class.java)
        startActivityForResult(intent, 0)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        finish()
    }

    companion object {
        @JvmStatic
        fun homeComponentEnabled(context: Context, enable: Boolean) {
            Log.d("HomeActivity", "Set enabled=" + enable)
            val packageManager = context.packageManager
            val componentName = ComponentName(context, HomeActivity::class.java)

            val componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName)
            val isEnabled: Boolean = componentEnabledSetting == PackageManager.COMPONENT_ENABLED_STATE_ENABLED

            if (isEnabled != enable) {
                var newEnabledState = PackageManager.COMPONENT_ENABLED_STATE_ENABLED
                if (!enable) {
                    newEnabledState = PackageManager.COMPONENT_ENABLED_STATE_DISABLED
                }
                packageManager.setComponentEnabledSetting(
                        componentName,
                        newEnabledState,
                        PackageManager.DONT_KILL_APP
                )
            }
        }
    }
}