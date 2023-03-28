package id.heycoding.layartancep.persentation.award.genre

import id.heycoding.layartancep.domain.model.genre.Genres

data class GenreState(
    val isLoading: Boolean = false,
    val genreList: List<Genres> = emptyList(),
    val error: String = ""
)