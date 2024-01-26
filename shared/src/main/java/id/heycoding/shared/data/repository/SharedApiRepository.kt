package id.heycoding.shared.data.repository

import id.heycoding.core.wrapper.DataResource
import id.heycoding.shared.data.model.request.DetailMovieRequest
import id.heycoding.shared.data.remote.datasource.SharedFeatureApiDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


/**
 * Created by Irfan Nawawi on 25/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
interface SharedApiRepository {
    suspend fun detailMovie(movieId: Int): Flow<DataResource<Any>>
}

class SharedApiRepositoryImpl(private val dataSource: SharedFeatureApiDataSource): Repository(), SharedApiRepository {
    override suspend fun detailMovie(movieId: Int): Flow<DataResource<Any>> {
        return flow {
            emit(safeNetworkCall { dataSource.detailMovie(DetailMovieRequest(movieId)) })
        }
    }

}