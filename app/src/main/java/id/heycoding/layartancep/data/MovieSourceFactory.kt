package id.heycoding.layartancep.data

import id.heycoding.layartancep.data.local.MovieLocalDataSource
import id.heycoding.layartancep.data.remote.MovieRemoteDataSource
import id.heycoding.layartancep.utils.Source
import javax.inject.Inject

class MovieSourceFactory @Inject constructor(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource
) {

    fun create(source: Source): MovieDataSource {
        return when (source) {
            Source.NETWORK -> movieRemoteDataSource
            else -> movieLocalDataSource
        }
    }
}