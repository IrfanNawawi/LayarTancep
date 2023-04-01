package id.heycoding.layartancep.data.local

import android.util.Log
import id.heycoding.layartancep.data.MovieDataSource
import id.heycoding.layartancep.data.local.dao.MovieDao
import id.heycoding.layartancep.data.mapper.MovieMapper.mappingPopularMovieEntityToMovies
import id.heycoding.layartancep.data.mapper.MovieMapper.mappingMoviesToMovieEntity
import id.heycoding.layartancep.domain.model.movie.Movies
import javax.inject.Inject

class MovieLocalDataSource @Inject constructor(private val movieDao: MovieDao) : MovieDataSource {
    override suspend fun getPopularMovies(): List<Movies> {
        return movieDao.getPopularMovies().mappingPopularMovieEntityToMovies()
    }

    override suspend fun insertMovieDao(data: List<Movies>) {
        Log.d("masuk sini local","$data")
        val movieEntities = data.mappingMoviesToMovieEntity()
        movieDao.insertPopularMovies(movieEntities)
    }
}