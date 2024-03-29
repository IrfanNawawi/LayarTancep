package id.heycoding.home.data.remote.service

import id.heycoding.shared.data.remote.model.response.BaseResponse
import id.heycoding.shared.data.remote.model.response.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by Irfan Nawawi on 27/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
interface HomeFeatureApi {
    @GET("movie/popular")
    suspend fun getPopularMovie(): BaseResponse<List<MovieResponse>>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovie(): BaseResponse<List<MovieResponse>>
}