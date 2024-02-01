package id.heycoding.home.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.heycoding.home.data.remote.model.viewparam.PopularViewParam
import id.heycoding.home.data.remote.model.viewparam.UpcomingViewParam
import id.heycoding.home.databinding.ItemMoviePosterBinding
import id.heycoding.home.databinding.ItemMoviePosterGridBinding
import id.heycoding.home.presentation.adapter.viewholder.HomePopularViewHolder
import id.heycoding.home.presentation.adapter.viewholder.HomeUpcomingViewHolder
import id.heycoding.home.presentation.ui.home.homeitem.HomeUiItem


/**
 * Created by Irfan Nawawi on 31/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
//class HomeAdapter(
//    private val listener: HomeAdapterClickListener
//) :
//    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//    private val items = mutableListOf<HomeUiItem>()
//    fun setItems(items: List<HomeUiItem>) {
//        this.items.clear()
//        this.items.addAll(items)
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return when (viewType) {
//            TYPE_POPULAR -> {
//                HomePopularViewHolder(
//                    ItemMoviePosterGridBinding.inflate(
//                        LayoutInflater.from(parent.context), parent, false
//                    ), listener
//                )
//            }
//
//            TYPE_UPCOMING -> {
//                HomeUpcomingViewHolder(
//                    ItemMoviePosterBinding.inflate(
//                        LayoutInflater.from(parent.context), parent, false
//                    ), listener
//                )
//            }
//
//            else -> throw IllegalArgumentException("Invalid view type")
//        }
//    }
//
//    override fun getItemCount(): Int = items.size
//
//    override fun getItemViewType(position: Int): Int {
//        return when (items[position]) {
//            is HomeUiItem.PopularSectionItem -> TYPE_POPULAR
//            is HomeUiItem.UpcomingSectionItem -> TYPE_UPCOMING
//        }
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        val item = items[position]
//        when (holder) {
//            is HomePopularViewHolder -> holder.bindView(item as HomeUiItem.PopularSectionItem)
//            is HomeUpcomingViewHolder -> holder.bindView(item as HomeUiItem.UpcomingSectionItem)
//        }
//    }
//
//    companion object {
//        private const val TYPE_POPULAR = 0
//        private const val TYPE_UPCOMING = 1
//    }
//}
//
//interface HomeAdapterClickListener {
//    fun onPopularMovieClicked(popularViewParam: PopularViewParam)
//    fun onUpcomingMovieClicked(upcomingViewParam: UpcomingViewParam)
//}