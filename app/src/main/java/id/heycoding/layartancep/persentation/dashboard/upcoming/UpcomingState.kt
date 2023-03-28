package id.heycoding.layartancep.persentation.dashboard.upcoming

import id.heycoding.layartancep.domain.model.movie.Movies

data class UpcomingState(
    val isLoading: Boolean = false,
    val upcomingList: List<Movies> = emptyList(),
    val error: String = ""
)