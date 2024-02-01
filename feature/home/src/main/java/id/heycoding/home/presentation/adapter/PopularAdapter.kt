package id.heycoding.home.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.heycoding.home.data.remote.model.viewparam.PopularViewParam
import id.heycoding.home.databinding.ItemMoviePosterBinding
import id.heycoding.home.databinding.ItemMoviePosterGridBinding
import id.heycoding.home.presentation.adapter.viewholder.HomePopularViewHolder
import id.heycoding.home.presentation.ui.home.homeitem.HomeUiItem


/**
 * Created by Irfan Nawawi on 28/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class PopularAdapter(private val listener: PopularAdapterClickListener) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val items = mutableListOf<HomeUiItem>()
    fun setItems(items: List<HomeUiItem>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomePopularViewHolder(
            ItemMoviePosterGridBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), listener
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HomePopularViewHolder -> {
                holder.bindView(items[position] as HomeUiItem.PopularSectionItem)
            }
        }
    }
}

interface PopularAdapterClickListener {
    fun onPopularMovieClicked(popularViewParam: PopularViewParam)
}