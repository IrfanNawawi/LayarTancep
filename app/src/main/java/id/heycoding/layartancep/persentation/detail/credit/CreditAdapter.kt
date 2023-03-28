package id.heycoding.layartancep.persentation.detail.credit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.heycoding.layartancep.databinding.ItemMovieCastBinding
import id.heycoding.layartancep.domain.model.credit.Credits
import id.heycoding.layartancep.utils.Constants

class CreditAdapter(var listCreditMovie: ArrayList<Credits>) :
    RecyclerView.Adapter<CreditAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemMovieCastBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Credits) {
            binding.apply {
                val profilePath: String =
                    Constants.BASE_URL_IMG_TMDB + "original" + movie.profilePath
                Glide.with(itemView.context).load(profilePath).into(imgProfileCast)
                tvCast.text = movie.name
            }
        }
    }

    fun setOnCreditMovie(movie: List<Credits>) {
        listCreditMovie.clear()
        listCreditMovie.addAll(movie)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemMovieCastBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCreditMovie[position])
    }

    override fun getItemCount(): Int = listCreditMovie.size
}