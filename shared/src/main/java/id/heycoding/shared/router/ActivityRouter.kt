package id.heycoding.shared.router

import android.content.Context
import android.content.Intent


/**
 * Created by Irfan Nawawi on 26/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
interface ActivityRouter {
    fun homeActivity(context: Context): Intent
}