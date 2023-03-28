package id.heycoding.layartancep.persentation.detail

import id.heycoding.layartancep.domain.model.detail.DetailMovies

data class DetailMovieState(
    val isLoading: Boolean = false,
    val detailList: List<DetailMovies> = emptyList(),
    val error: String = ""
)