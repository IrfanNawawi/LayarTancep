package id.heycoding.layartancep.data.local.dao

import androidx.room.*
import id.heycoding.layartancep.data.local.entity.movie.MoviesEntity

@Dao
interface MovieDao {

    @Query("SELECT * FROM movies order by popularity DESC")
    fun getPopularMovies(): List<MoviesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPopularMovies(movies: List<MoviesEntity>)

    @Delete
    fun delete(movie: MoviesEntity)
}