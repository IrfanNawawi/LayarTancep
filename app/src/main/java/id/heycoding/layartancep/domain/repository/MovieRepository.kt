package id.heycoding.layartancep.domain.repository

import id.heycoding.layartancep.data.remote.response.credit.CreditMovieResponse
import id.heycoding.layartancep.data.remote.response.detail.DetailMovieResponse
import id.heycoding.layartancep.data.remote.response.genre.GenreResponse
import id.heycoding.layartancep.data.remote.response.movie.MovieResponse
import id.heycoding.layartancep.data.remote.response.review.ReviewResponse
import id.heycoding.layartancep.data.remote.response.trailer.TrailerResponse

interface MovieRepository {

    // Feature Genre
    suspend fun getGenre(apiKey: String, language: String): GenreResponse

    // Feature Movie by Genre
    suspend fun getMovieByGenre(
        apiKey: String,
        language: String,
        withGenre: String,
        page: String
    ): MovieResponse

    // Feature Review by Movie
    suspend fun getReviewByMovie(movieId: String, apiKey: String, language: String): ReviewResponse

    // Feature Trailer by Movie
    suspend fun getTrailerByMovie(
        movieId: String,
        apiKey: String,
        language: String
    ): TrailerResponse

    // Feature Popular Movie
    suspend fun getPopularMovie(apiKey: String, language: String): MovieResponse

    // Feature Upcoming Movie
    suspend fun getUpcomingMovie(apiKey: String, language: String): MovieResponse

    // Feature Search Movie
    suspend fun getSearchMovie(apiKey: String, language: String, query: String): MovieResponse

    // Feature Detail Movie
    suspend fun getDetailMovie(
        movieId: String,
        apiKey: String,
        language: String
    ): DetailMovieResponse

    // Feature Credit Movie
    suspend fun getCreditMovie(
        movieId: String,
        apiKey: String,
        language: String
    ): CreditMovieResponse
}