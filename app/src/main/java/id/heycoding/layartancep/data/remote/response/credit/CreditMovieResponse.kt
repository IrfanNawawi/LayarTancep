package id.heycoding.layartancep.data.remote.response.credit


import com.google.gson.annotations.SerializedName

data class CreditMovieResponse(
    @SerializedName("cast")
    val cast: List<Cast>,
    @SerializedName("crew")
    val crew: List<Crew>,
    @SerializedName("id")
    val id: Int
)