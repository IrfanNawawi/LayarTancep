package id.heycoding.layartancep.persentation.award

import id.heycoding.layartancep.domain.model.genre.Genres
import id.heycoding.layartancep.domain.model.movie.Movies

interface AwardCallback {
    fun onDetailAwardMovie(movie: Movies)
    fun onGenreMovieId(movieId: Genres)
}