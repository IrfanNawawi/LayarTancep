package id.heycoding.layartancep.domain.usecase.review

//class ReviewUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(
//        movieId: String
//    ): Flow<ResultState<List<Reviews>>> = flow {
//        try {
//            emit(ResultState.Loading())
//            val review = repository.getReviewByMovie(
//                movieId
//            ).results.mappingReviewToUseCaseEntity()
//            emit(ResultState.Success(review))
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