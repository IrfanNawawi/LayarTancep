package id.heycoding.layartancep.domain.usecase.genre

import id.heycoding.layartancep.data.mappingGenreToUseCaseEntity
import id.heycoding.layartancep.domain.model.genre.Genres
import id.heycoding.layartancep.domain.repository.MovieRepository
import id.heycoding.layartancep.utils.ResultState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GenreUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(apiKey: String, language: String): Flow<ResultState<List<Genres>>> = flow {
        try {
            emit(ResultState.Loading())
            val genre = repository.getGenre(apiKey, language).genres.mappingGenreToUseCaseEntity()
            emit(ResultState.Success(genre))
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