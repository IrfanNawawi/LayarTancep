package id.heycoding.home.presentation.ui.home.homeitem

import id.heycoding.home.data.remote.model.viewparam.PopularViewParam
import id.heycoding.home.data.remote.model.viewparam.UpcomingViewParam


/**
 * Created by Irfan Nawawi on 01/02/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
data class DataItem(
    var popularViewParam: List<PopularViewParam>,
    var upcomingViewParam: List<UpcomingViewParam>,
)
