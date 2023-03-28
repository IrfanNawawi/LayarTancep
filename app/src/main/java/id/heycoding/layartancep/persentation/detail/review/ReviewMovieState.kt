package id.heycoding.layartancep.persentation.detail.review

import id.heycoding.layartancep.domain.model.review.Reviews

data class ReviewMovieState(
    val isLoading: Boolean = false,
    val reviewList: List<Reviews> = emptyList(),
    val error: String = ""
)