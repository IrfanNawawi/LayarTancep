package id.heycoding.home.data.remote.model.viewparam


/**
 * Created by Irfan Nawawi on 29/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
data class UpcomingViewParam(
    val backdropPath: String,
    val id: Int,
    val originalLanguage: String,
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    val posterPath: String,
    val releaseDate: String,
    val title: String,
    val video: Boolean,
    val voteAverage: Double,
    val voteCount: Int
)
