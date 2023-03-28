package id.heycoding.layartancep.persentation.dashboard

import id.heycoding.layartancep.domain.model.movie.Movies

interface DashboardCallback {
    fun onDetailMovie(movie: Movies)
}