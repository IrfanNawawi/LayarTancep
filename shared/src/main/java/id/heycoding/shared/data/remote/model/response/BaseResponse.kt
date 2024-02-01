package id.heycoding.shared.data.remote.model.response

import com.google.gson.annotations.SerializedName

data class BaseResponse<D>(
    @SerializedName("results")
    val data: D?,
    @SerializedName("total_results")
    val totalResults: Int?
)