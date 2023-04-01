package id.heycoding.layartancep.domain.usecase.credit

//class CreditUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(
//        movieId: String
//    ): Flow<ResultState<List<Credits>>> = flow {
//        try {
//            emit(ResultState.Loading())
//            val movie = repository.getCreditMovie(
//                movieId
//            ).cast.mappingCreditToUseCaseEntity()
//            emit(ResultState.Success(movie))
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