package id.heycoding.layartancep.data

import id.heycoding.layartancep.domain.model.movie.Movies

interface MovieDataSource {
    suspend fun getPopularMovies(): List<Movies>
    suspend fun insertMovieDao(data: List<Movies>)
}