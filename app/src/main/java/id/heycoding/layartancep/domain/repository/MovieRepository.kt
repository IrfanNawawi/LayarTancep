package id.heycoding.layartancep.domain.repository

import id.heycoding.layartancep.data.remote.response.credit.CreditMovieResponse
import id.heycoding.layartancep.data.remote.response.detail.DetailMovieResponse
import id.heycoding.layartancep.data.remote.response.genre.GenreResponse
import id.heycoding.layartancep.data.remote.response.movie.MovieResponse
import id.heycoding.layartancep.data.remote.response.review.ReviewResponse
import id.heycoding.layartancep.data.remote.response.trailer.TrailerResponse
import id.heycoding.layartancep.domain.model.movie.Movies

interface MovieRepository {

//    // Feature Genre
//    suspend fun getGenre(): GenreResponse
//
//    // Feature Movie by Genre
//    suspend fun getMovieByGenre(
//        withGenre: String,
//        page: String
//    ): MovieResponse
//
//    // Feature Review by Movie
//    suspend fun getReviewByMovie(movieId: String): ReviewResponse
//
//    // Feature Trailer by Movie
//    suspend fun getTrailerByMovie(
//        movieId: String
//    ): TrailerResponse

    // Feature Popular Movie
    suspend fun getPopularMovie(): List<Movies>

//    // Feature Upcoming Movie
//    suspend fun getUpcomingMovie(): MovieResponse
//
//    // Feature Search Movie
//    suspend fun getSearchMovie(query: String): MovieResponse
//
//    // Feature Detail Movie
//    suspend fun getDetailMovie(
//        movieId: String
//    ): DetailMovieResponse
//
//    // Feature Credit Movie
//    suspend fun getCreditMovie(
//        movieId: String
//    ): CreditMovieResponse
}