package id.heycoding.layartancep.domain.usecase.movie

//class SearchMovieUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(
//        query: String
//    ): Flow<ResultState<List<Movies>>> =
//        flow {
//            try {
//                emit(ResultState.Loading())
//                val movie = repository.getSearchMovie(
//                    query
//                ).results.mappingSearchMovieToUseCaseEntity()
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