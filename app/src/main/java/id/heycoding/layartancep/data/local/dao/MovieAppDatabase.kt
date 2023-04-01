package id.heycoding.layartancep.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import id.heycoding.layartancep.data.local.entity.movie.MoviesEntity
import id.heycoding.layartancep.utils.Converters

@Database(entities = [MoviesEntity::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class MovieAppDatabase : RoomDatabase(){
    abstract fun movieDao(): MovieDao
}