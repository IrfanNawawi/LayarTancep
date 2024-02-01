package id.heycoding.layartancep.router

import android.content.Context
import android.content.Intent
import id.heycoding.home.presentation.ui.home.HomeActivity
import id.heycoding.shared.router.ActivityRouter


/**
 * Created by Irfan Nawawi on 26/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class ActivityRouterImpl: ActivityRouter {
    override fun homeActivity(context: Context): Intent {
        return Intent(context, HomeActivity::class.java)
    }
}