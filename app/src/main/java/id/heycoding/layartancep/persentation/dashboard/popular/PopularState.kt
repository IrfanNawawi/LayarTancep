package id.heycoding.layartancep.persentation.dashboard.popular

import id.heycoding.layartancep.domain.model.movie.Movies

data class PopularState(
    val isLoading: Boolean = false,
    val popularList: List<Movies> = emptyList(),
    val error: String = ""
)