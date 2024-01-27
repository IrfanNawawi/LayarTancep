package id.heycoding.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import id.heycoding.core.base.BaseActivity
import id.heycoding.shared.router.ActivityRouter
import id.heycoding.splashscreen.databinding.ActivitySplashScreenBinding
import org.koin.android.ext.android.inject

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding, Nothing>(ActivitySplashScreenBinding::inflate) {
    private val activityRouter: ActivityRouter by inject()
    override val viewModel: Nothing
        get() = TODO("Not yet implemented")

    override fun initView() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        Handler().postDelayed({
            startActivity(activityRouter.homeActivity(this).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
            finish()
        }, 5000)
    }

}