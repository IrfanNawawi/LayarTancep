package id.heycoding.home.presentation.ui.home.homeitem

import id.heycoding.home.data.remote.model.viewparam.PopularViewParam
import id.heycoding.home.data.remote.model.viewparam.UpcomingViewParam


/**
 * Created by Irfan Nawawi on 17/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
sealed class HomeUiItem {
    data class PopularSectionItem(val popularViewParam: PopularViewParam) : HomeUiItem()
    data class UpcomingSectionItem(val upcomingViewParam: UpcomingViewParam) : HomeUiItem()
}