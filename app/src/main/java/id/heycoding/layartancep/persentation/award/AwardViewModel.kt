package id.heycoding.layartancep.persentation.award

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.heycoding.layartancep.persentation.award.genre.GenreState
import id.heycoding.layartancep.persentation.award.genre_movie.GenreMovieState
import id.heycoding.layartancep.utils.Constants
import id.heycoding.layartancep.utils.ResultState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AwardViewModel @Inject constructor(
//    private val genreUseCase: GenreUseCase,
//    private val genreMovieUseCase: GenreMovieUseCase
) : ViewModel() {
//    private val _listGenreData = MutableStateFlow(GenreState())
//    var listGenreData: StateFlow<GenreState> = _listGenreData
//
//    private val _listGenreMovieData = MutableStateFlow(GenreMovieState())
//    var listGenreMovieData: StateFlow<GenreMovieState> = _listGenreMovieData
//
//    fun getGenre() = viewModelScope.launch(Dispatchers.IO) {
//        genreUseCase().collect {
//            when (it) {
//                is ResultState.Success -> {
//                    _listGenreData.value = GenreState(genreList = it.data ?: emptyList())
//                }
//                is ResultState.Loading -> {
//                    _listGenreData.value = GenreState(isLoading = true)
//                }
//                is ResultState.Error -> {
//                    _listGenreData.value =
//                        GenreState(error = it.message ?: "An Unexpected Error")
//                }
//            }
//        }
//    }
//
//    fun getGenreMovie(query: String, page: String) = viewModelScope.launch(Dispatchers.IO) {
//        genreMovieUseCase(query, page).collect {
//            when (it) {
//                is ResultState.Success -> {
//                    _listGenreMovieData.value =
//                        GenreMovieState(genreMovieList = it.data ?: emptyList())
//                }
//                is ResultState.Loading -> {
//                    _listGenreMovieData.value = GenreMovieState(isLoading = true)
//                }
//                is ResultState.Error -> {
//                    _listGenreMovieData.value =
//                        GenreMovieState(error = it.message ?: "An Unexpected Error")
//                }
//            }
//        }
//    }
}