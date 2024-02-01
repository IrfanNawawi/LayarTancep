package id.heycoding.shared.data.remote.services

import id.heycoding.shared.data.remote.model.request.DetailMovieRequest
import id.heycoding.shared.data.remote.model.response.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path


/**
 * Created by Irfan Nawawi on 25/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
interface SharedFeatureApi {
    @GET("movie/{movie_id}")
    suspend fun detailMovie(@Path("movie_id") movieId: DetailMovieRequest): MovieResponse
}