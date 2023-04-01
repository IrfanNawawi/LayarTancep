package id.heycoding.layartancep.domain.usecase.movie

//class GenreMovieUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(
//        withGenre: String,
//        page: String
//    ): Flow<ResultState<List<Movies>>> = flow {
//        try {
//            emit(ResultState.Loading())
//            val movie = repository.getMovieByGenre(
//                withGenre,
//                page
//            ).results.mappingGenreMovieToUseCaseEntity()
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