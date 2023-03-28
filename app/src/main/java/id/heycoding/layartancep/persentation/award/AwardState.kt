package id.heycoding.layartancep.persentation.award

import id.heycoding.layartancep.domain.model.movie.Movies

data class AwardState(
    val isLoading: Boolean = false,
    val searchMovieList: List<Movies> = emptyList(),
    val error: String = ""
)