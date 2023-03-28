package id.heycoding.layartancep.domain.usecase.movie

import id.heycoding.layartancep.data.mappingPopularMovieToUseCaseEntity
import id.heycoding.layartancep.domain.model.movie.Movies
import id.heycoding.layartancep.domain.repository.MovieRepository
import id.heycoding.layartancep.utils.ResultState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class PopularMovieUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(apiKey: String, language: String): Flow<ResultState<List<Movies>>> =
        flow {
            try {
                emit(ResultState.Loading())
                val movie = repository.getPopularMovie(
                    apiKey,
                    language
                ).results.mappingPopularMovieToUseCaseEntity()
                emit(ResultState.Success(movie))
            } catch (e: HttpException) {
                emit(
                    ResultState.Error(
                        e.localizedMessage ?: " An Unexpected Error Occurred"
                    )
                )
            } catch (e: IOException) {
                emit(ResultState.Error("Error Occurred"))
            }
        }
}