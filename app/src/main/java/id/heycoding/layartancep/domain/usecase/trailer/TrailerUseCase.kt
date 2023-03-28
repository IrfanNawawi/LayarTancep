package id.heycoding.layartancep.domain.usecase.trailer

import id.heycoding.layartancep.data.mappingTrailerToUseCaseEntity
import id.heycoding.layartancep.domain.model.trailer.Trailers
import id.heycoding.layartancep.domain.repository.MovieRepository
import id.heycoding.layartancep.utils.ResultState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class TrailerUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(
        movieId: String,
        apiKey: String,
        language: String
    ): Flow<ResultState<List<Trailers>>> = flow {
        try {
            emit(ResultState.Loading())
            val trailer = repository.getTrailerByMovie(
                movieId,
                apiKey,
                language
            ).results.mappingTrailerToUseCaseEntity()
            emit(ResultState.Success(trailer))
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