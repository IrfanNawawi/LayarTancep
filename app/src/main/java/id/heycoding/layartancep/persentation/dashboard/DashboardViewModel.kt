package id.heycoding.layartancep.persentation.dashboard

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.heycoding.layartancep.domain.usecase.movie.PopularMovieUseCase
import id.heycoding.layartancep.persentation.dashboard.popular.PopularState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val popularMovieUseCase: PopularMovieUseCase,
//    private val upcomingMovieUseCase: UpcomingMovieUseCase
) : ViewModel() {
    private val _listPopularData = MutableStateFlow(PopularState())
    var listPopularData: StateFlow<PopularState> = _listPopularData

//    private val _listUpcomingData = MutableStateFlow(UpcomingState())
//    var listUpcomingData: StateFlow<UpcomingState> = _listUpcomingData

    fun getPopularMovie() {
        _listPopularData.value = PopularState(isLoading = true)
        viewModelScope.launch(Dispatchers.IO) {

            try {
                val popularMovies = popularMovieUseCase.execute()
                _listPopularData.value = PopularState(popularList = popularMovies)
            } catch (error: Exception) {
                _listPopularData.value = PopularState(error = error.message.toString())
            }
        }
    }

//    fun getUpcomingMovie() = viewModelScope.launch(Dispatchers.IO) {
//        upcomingMovieUseCase().collect {
//            when (it) {
//                is ResultState.Success -> {
//                    _listUpcomingData.value = UpcomingState(upcomingList = it.data ?: emptyList())
//                }
//                is ResultState.Loading -> {
//                    _listUpcomingData.value = UpcomingState(isLoading = true)
//                }
//                is ResultState.Error -> {
//                    _listUpcomingData.value =
//                        UpcomingState(error = it.message ?: "An Unexpected Error")
//                }
//            }
//        }
//    }
}