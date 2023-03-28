package id.heycoding.layartancep.persentation.detail.trailer

import id.heycoding.layartancep.domain.model.trailer.Trailers

data class TrailerMovieState(
    val isLoading: Boolean = false,
    val trailerList: List<Trailers> = emptyList(),
    val error: String = ""
)