package id.heycoding.layartancep.persentation.detail.credit

import id.heycoding.layartancep.domain.model.credit.Credits

data class CreditMovieState(
    val isLoading: Boolean = false,
    val creditList: List<Credits> = emptyList(),
    val error: String = ""
)
