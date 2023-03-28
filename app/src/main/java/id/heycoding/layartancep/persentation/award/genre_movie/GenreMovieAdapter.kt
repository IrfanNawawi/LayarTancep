package id.heycoding.layartancep.persentation.award.genre_movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.heycoding.layartancep.databinding.ItemMovieAwardBinding
import id.heycoding.layartancep.domain.model.movie.Movies
import id.heycoding.layartancep.persentation.award.AwardCallback
import id.heycoding.layartancep.utils.Constants


class GenreMovieAdapter(
    var listGenreMovie: ArrayList<Movies>,
    private val callback: AwardCallback
) :
    RecyclerView.Adapter<GenreMovieAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemMovieAwardBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movies) {
            binding.apply {
                val poster: String =
                    Constants.BASE_URL_IMG_TMDB + "original" + movie.posterPath
                Glide.with(itemView.context).load(poster).into(imgPosterAward)
                tvTitle.text = movie.title
                tvDesc.text = movie.overview

                itemView.setOnClickListener {
                    callback.onDetailAwardMovie(movie)
                }
            }
        }
    }

    fun setOnGenreMovie(movie: List<Movies>) {
        listGenreMovie.clear()
        listGenreMovie.addAll(movie)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemMovieAwardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: GenreMovieAdapter.ViewHolder, position: Int) {
        holder.bind(listGenreMovie[position])
    }

    override fun getItemCount(): Int = listGenreMovie.size

    fun filterList(filterList: ArrayList<Movies>) {
        listGenreMovie = filterList
        notifyDataSetChanged()
    }
}