package id.heycoding.layartancep.data

import id.heycoding.layartancep.domain.model.movie.Movies
import id.heycoding.layartancep.domain.repository.MovieRepository
import id.heycoding.layartancep.utils.Source
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(
    private val movieSourceFactory: MovieSourceFactory
) : MovieRepository {
    override suspend fun getPopularMovie(): List<Movies> {
        return movieSourceFactory.create(Source.LOCAL).getPopularMovies()
            .ifEmpty { syncMovieRemote() }
    }

    private suspend fun syncMovieRemote(): List<Movies>{
        return movieSourceFactory.create(Source.NETWORK).getPopularMovies()
            .also {
                movieSourceFactory.create(Source.LOCAL).insertMovieDao(it)
            }
    }
}