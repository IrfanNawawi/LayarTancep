package id.heycoding.layartancep.domain.usecase.detail

import id.heycoding.layartancep.data.mappingDetailMovieToUseCaseEntity
import id.heycoding.layartancep.domain.model.detail.DetailMovies
import id.heycoding.layartancep.domain.repository.MovieRepository
import id.heycoding.layartancep.utils.ResultState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class DetailMovieUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(
        movieId: String,
        apiKey: String,
        language: String,
    ): Flow<ResultState<List<DetailMovies>>> = flow {
        try {
            emit(ResultState.Loading())
            val movie = repository.getDetailMovie(
                movieId,
                apiKey,
                language
            ).mappingDetailMovieToUseCaseEntity()
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