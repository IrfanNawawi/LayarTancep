package id.heycoding.layartancep.data.remote.services

import id.heycoding.layartancep.data.remote.response.credit.CreditMovieResponse
import id.heycoding.layartancep.data.remote.response.detail.DetailMovieResponse
import id.heycoding.layartancep.data.remote.response.genre.GenreResponse
import id.heycoding.layartancep.data.remote.response.movie.MovieResponse
import id.heycoding.layartancep.data.remote.response.review.ReviewResponse
import id.heycoding.layartancep.data.remote.response.trailer.TrailerResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TmdbApi {

    // Feature Genre
    @GET("genre/movie/list")
    suspend fun getListGenre(): GenreResponse

    // Feature Movie by Genre
    @GET("discover/movie")
    suspend fun getMoviebyGenre(
        @Query("with_genres") withGenres: String,
        @Query("page") page: String
    ): MovieResponse

    // Feature Review by Movie
    @GET("movie/{movie_id}/reviews")
    suspend fun getReviewbyMovie(
        @Path("movie_id") movieId: String,
    ): ReviewResponse

    // Feature Trailer by Movie
    @GET("movie/{movie_id}/videos")
    suspend fun getTrailerbyMovie(
        @Path("movie_id") movieId: String,
    ): TrailerResponse

    // Feature Popular Movie
    @GET("movie/popular")
    suspend fun getPopularMovie(): MovieResponse

    // Feature Popular Movie
    @GET("movie/upcoming")
    suspend fun getUpcomingMovie(): MovieResponse

    // Feature Search Movie
    @GET("search/movie")
    suspend fun getSearchMovie(
        @Query("query") query: String
    ): MovieResponse

    // Feature Detail Movie
    @GET("movie/{movie_id}")
    suspend fun getDetailMovie(
        @Path("movie_id") movieId: String,
    ): DetailMovieResponse

    // Feature Credits by Movie
    @GET("movie/{movie_id}/credits")
    suspend fun getCreditbyMovie(
        @Path("movie_id") movieId: String,
    ): CreditMovieResponse
}