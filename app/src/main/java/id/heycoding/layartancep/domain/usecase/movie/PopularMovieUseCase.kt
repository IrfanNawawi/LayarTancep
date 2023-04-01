package id.heycoding.layartancep.domain.usecase.movie

import id.heycoding.layartancep.domain.model.movie.Movies
import id.heycoding.layartancep.domain.repository.MovieRepository
import javax.inject.Inject

//class PopularMovieUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(): Flow<ResultState<List<Movies>>> =
//        flow {
//            try {
//                emit(ResultState.Loading())
//                val movie = repository.getPopularMovie().results.mappingPopularMovieToUseCaseEntity()
//                emit(ResultState.Success(movie))
//            } catch (e: HttpException) {
//                emit(
//                    ResultState.Error(
//                        e.localizedMessage ?: " An Unexpected Error Occurred"
//                    )
//                )
//            } catch (e: IOException) {
//                emit(ResultState.Error("Error Occurred"))
//            }
//        }
//}

class PopularMovieUseCase @Inject constructor(
    private val repository: MovieRepository
) {

    suspend fun execute(): List<Movies> {
        return repository.getPopularMovie()
    }
}