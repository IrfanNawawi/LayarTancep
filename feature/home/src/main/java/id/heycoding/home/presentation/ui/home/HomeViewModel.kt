package id.heycoding.home.presentation.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import id.heycoding.core.wrapper.ViewResource
import id.heycoding.home.domain.GetPopularMovieUseCase
import id.heycoding.home.domain.GetUpcomingMovieUseCase
import id.heycoding.home.presentation.ui.home.homeitem.HomeUiItem
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.launch


/**
 * Created by Irfan Nawawi on 28/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
class HomeViewModel(
    private val getPopularMovieUseCase: GetPopularMovieUseCase,
    private val getUpcomingMovieUseCase: GetUpcomingMovieUseCase
) : ViewModel() {
    val homePopularResult: MutableLiveData<ViewResource<List<HomeUiItem>>> = MutableLiveData()
    val homeUpcomingResult: MutableLiveData<ViewResource<List<HomeUiItem>>> = MutableLiveData()

    fun fetchHomePopular() {
        viewModelScope.launch {
            getPopularMovieUseCase().collect {
                homePopularResult.value = it
            }
        }
    }

    fun fetchHomeUpcoming() {
        viewModelScope.launch {
            getUpcomingMovieUseCase().collect {
                homeUpcomingResult.value = it
            }
        }
    }
}