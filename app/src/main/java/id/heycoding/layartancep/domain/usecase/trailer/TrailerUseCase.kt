package id.heycoding.layartancep.domain.usecase.trailer

//class TrailerUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(
//        movieId: String
//    ): Flow<ResultState<List<Trailers>>> = flow {
//        try {
//            emit(ResultState.Loading())
//            val trailer = repository.getTrailerByMovie(
//                movieId
//            ).results.mappingTrailerToUseCaseEntity()
//            emit(ResultState.Success(trailer))
//        } catch (e: HttpException) {
//            emit(
//                ResultState.Error(
//                    e.localizedMessage ?: " An Unexpected Error Occurred"
//                )
//            )
//        } catch (e: IOException) {
//            emit(ResultState.Error("Error Occurred"))
//        }
//    }
//}