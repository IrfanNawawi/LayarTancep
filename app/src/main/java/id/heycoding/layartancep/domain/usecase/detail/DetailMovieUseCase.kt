package id.heycoding.layartancep.domain.usecase.detail

//class DetailMovieUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(
//        movieId: String
//    ): Flow<ResultState<List<DetailMovies>>> = flow {
//        try {
//            emit(ResultState.Loading())
//            val movie = repository.getDetailMovie(
//                movieId
//            ).mappingDetailMovieToUseCaseEntity()
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