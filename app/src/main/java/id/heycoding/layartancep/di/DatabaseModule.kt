package id.heycoding.layartancep.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import id.heycoding.layartancep.data.local.dao.MovieAppDatabase
import id.heycoding.layartancep.data.local.dao.MovieDao

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    private const val DB_NAME = "moviedb"

    @Provides
    fun provideMyRoomDatabase(@ApplicationContext context: Context): MovieAppDatabase {
        return Room.databaseBuilder(
            context,
            MovieAppDatabase::class.java,
            DB_NAME
        ).build()
    }

    @Provides
    fun providePrayDao(movieAppDatabase: MovieAppDatabase): MovieDao {
        return movieAppDatabase.movieDao()
    }
}