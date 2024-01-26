package id.heycoding.shared.data.remote.datasource

import id.heycoding.shared.data.model.request.DetailMovieRequest
import id.heycoding.shared.data.model.response.MovieResponse
import id.heycoding.shared.data.remote.services.SharedFeatureApi


/**
 * Created by Irfan Nawawi on 25/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
interface SharedFeatureApiDataSource {
    suspend fun detailMovie(movieId: DetailMovieRequest): MovieResponse
}

class SharedFeatureApiDataSourceImpl(private val sharedFeatureApi: SharedFeatureApi): SharedFeatureApiDataSource {
    override suspend fun detailMovie(movieId: DetailMovieRequest): MovieResponse {
        return sharedFeatureApi.detailMovie(movieId)
    }

}