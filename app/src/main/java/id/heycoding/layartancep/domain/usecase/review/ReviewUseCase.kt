package id.heycoding.layartancep.domain.usecase.review

import id.heycoding.layartancep.data.mappingReviewToUseCaseEntity
import id.heycoding.layartancep.domain.model.review.Reviews
import id.heycoding.layartancep.domain.repository.MovieRepository
import id.heycoding.layartancep.utils.ResultState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ReviewUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(
        movieId: String,
        apiKey: String,
        language: String
    ): Flow<ResultState<List<Reviews>>> = flow {
        try {
            emit(ResultState.Loading())
            val review = repository.getReviewByMovie(
                movieId,
                apiKey,
                language
            ).results.mappingReviewToUseCaseEntity()
            emit(ResultState.Success(review))
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