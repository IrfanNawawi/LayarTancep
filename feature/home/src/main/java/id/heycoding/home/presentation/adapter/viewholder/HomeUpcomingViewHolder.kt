package id.heycoding.home.presentation.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import id.heycoding.core.BuildConfig
import id.heycoding.home.databinding.ItemMoviePosterBinding
import id.heycoding.home.presentation.adapter.PopularAdapterClickListener
import id.heycoding.home.presentation.adapter.UpcomingAdapterClickListener
import id.heycoding.home.presentation.ui.home.homeitem.HomeUiItem


/**
 * Created by Irfan Nawawi on 28/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class HomeUpcomingViewHolder(
    private val binding: ItemMoviePosterBinding,
    private val listener: UpcomingAdapterClickListener
) : RecyclerView.ViewHolder(binding.root) {

    fun bindView(item: HomeUiItem.UpcomingSectionItem) {
        with(item.upcomingViewParam) {
            val poster: String =
                BuildConfig.BASE_URL_IMAGE + "w500" + posterPath
            binding.ivPoster.load(poster)
            itemView.setOnClickListener {
                listener.onUpcomingMovieClicked(this)
            }
        }
    }
}