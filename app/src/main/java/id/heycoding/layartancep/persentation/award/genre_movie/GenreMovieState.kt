package id.heycoding.layartancep.persentation.award.genre_movie

import id.heycoding.layartancep.domain.model.movie.Movies

data class GenreMovieState(
    val isLoading: Boolean = false,
    val genreMovieList: List<Movies> = emptyList(),
    val error: String = ""
)