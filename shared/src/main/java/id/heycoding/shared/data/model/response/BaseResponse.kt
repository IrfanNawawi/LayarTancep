package id.heycoding.shared.data.model.response

import com.google.gson.annotations.SerializedName

data class BaseResponse(
    @SerializedName("results")
    val movieResponses: List<MovieResponse>?,
    @SerializedName("total_results")
    val totalResults: Int?
)