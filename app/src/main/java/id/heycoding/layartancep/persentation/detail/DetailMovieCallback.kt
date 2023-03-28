package id.heycoding.layartancep.persentation.detail

import id.heycoding.layartancep.domain.model.trailer.Trailers

interface DetailMovieCallback {
    fun onNavigateYoutube(trailers: Trailers)
}