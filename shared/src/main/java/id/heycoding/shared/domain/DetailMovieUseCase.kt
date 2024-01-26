package id.heycoding.shared.domain

import id.heycoding.core.base.BaseUseCase
import id.heycoding.core.wrapper.DataResource
import id.heycoding.core.wrapper.ViewResource
import id.heycoding.shared.data.model.mapper.MovieMapper
import id.heycoding.shared.data.model.viewparam.MovieViewParam
import id.heycoding.shared.data.repository.SharedApiRepository
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map


/**
 * Created by Irfan Nawawi on 26/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class DetailMovieUseCase(private val repository: SharedApiRepository, dispatcher: CoroutineDispatcher) : BaseUseCase<DetailMovieUseCase.Param, MovieViewParam>(dispatcher) {

    data class Param(val movie: MovieViewParam)

    override suspend fun execute(param: Param?): Flow<ViewResource<MovieViewParam>> = flow {
        param?.let {
            val movie = param.movie
            val movieId = param.movie.id

            repository.detailMovie(movieId).map {
                when(it) {
                    is DataResource.Success -> {
                        ViewResource.Success(movie)
                    }
                    is DataResource.Error -> {
                        ViewResource.Error(it.exception)
                    }
                }
            }
        }
    }
}