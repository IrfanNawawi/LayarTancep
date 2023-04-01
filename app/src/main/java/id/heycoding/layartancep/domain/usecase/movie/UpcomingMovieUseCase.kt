package id.heycoding.layartancep.domain.usecase.movie

//class UpcomingMovieUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(): Flow<ResultState<List<Movies>>> =
//        flow {
//            try {
//                emit(ResultState.Loading())
//                val movie = repository.getUpcomingMovie().results.mappingUpcomingMovieToUseCaseEntity()
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