package id.heycoding.home.presentation.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import id.heycoding.core.BuildConfig
import id.heycoding.home.databinding.ItemMoviePosterGridBinding
import id.heycoding.home.presentation.adapter.PopularAdapterClickListener
import id.heycoding.home.presentation.ui.home.homeitem.HomeUiItem


/**
 * Created by Irfan Nawawi on 28/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class HomePopularViewHolder(
    private val binding: ItemMoviePosterGridBinding,
    private val listener: PopularAdapterClickListener
) :
    RecyclerView.ViewHolder(binding.root) {

    fun bindView(item: HomeUiItem.PopularSectionItem) {
        with(item.popularViewParam) {
            val poster: String =
                BuildConfig.BASE_URL_IMAGE + "w500" + posterPath
            binding.ivPoster.load(poster)
            itemView.setOnClickListener {
                listener.onPopularMovieClicked(this)
            }
        }
    }
}