package id.heycoding.layartancep.data.remote

import android.util.Log
import id.heycoding.layartancep.data.MovieDataSource
import id.heycoding.layartancep.data.mapper.MovieMapper.mappingMovieResponseToMovies
import id.heycoding.layartancep.data.remote.services.TmdbApi
import id.heycoding.layartancep.domain.model.movie.Movies
import javax.inject.Inject

class MovieRemoteDataSource @Inject constructor(private val tmdbApi: TmdbApi) : MovieDataSource {
//    override suspend fun getGenre(): GenreResponse {
//        return tmdbApi.getListGenre()
//    }
//
//    override suspend fun getMovieByGenre(
//        withGenre: String,
//        page: String
//    ): MovieResponse {
//        return tmdbApi.getMoviebyGenre(
//            withGenres = withGenre,
//            page = page
//        )
//    }
//
//    override suspend fun getReviewByMovie(
//        movieId: String
//    ): ReviewResponse {
//        return tmdbApi.getReviewbyMovie(movieId = movieId)
//    }
//
//    override suspend fun getTrailerByMovie(
//        movieId: String
//    ): TrailerResponse {
//        return tmdbApi.getTrailerbyMovie(movieId = movieId)
//    }
//
//    override suspend fun getUpcomingMovie(): MovieResponse {
//        return tmdbApi.getUpcomingMovie()
//    }
//
//    override suspend fun getSearchMovie(
//        query: String
//    ): MovieResponse {
//        return tmdbApi.getSearchMovie(query = query)
//    }
//
//    override suspend fun getDetailMovie(
//        movieId: String
//    ): DetailMovieResponse {
//        return tmdbApi.getDetailMovie(movieId = movieId)
//    }
//
//    override suspend fun getCreditMovie(
//        movieId: String
//    ): CreditMovieResponse {
//        return tmdbApi.getCreditbyMovie(movieId = movieId)
//    }

    override suspend fun getPopularMovies(): List<Movies> {
        return tmdbApi.getPopularMovie().mappingMovieResponseToMovies()
    }

    override suspend fun insertMovieDao(data: List<Movies>) {
        Log.d("masuk sini remote","$data")
    }

}