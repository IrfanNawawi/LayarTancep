package id.heycoding.layartancep.domain.usecase.genre

//class GenreUseCase @Inject constructor(
//    private val repository: MovieRepository
//) {
//    operator fun invoke(): Flow<ResultState<List<Genres>>> = flow {
//        try {
//            emit(ResultState.Loading())
//            val genre = repository.getGenre().genres.mappingGenreToUseCaseEntity()
//            emit(ResultState.Success(genre))
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