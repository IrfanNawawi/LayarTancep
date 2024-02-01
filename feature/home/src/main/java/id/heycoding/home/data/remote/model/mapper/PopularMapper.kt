package id.heycoding.home.data.remote.model.mapper

import id.heycoding.home.data.remote.model.viewparam.PopularViewParam
import id.heycoding.shared.data.remote.model.response.MovieResponse
import id.heycoding.shared.utils.ext.orFalse
import id.heycoding.shared.utils.ext.orNol
import id.heycoding.shared.utils.ext.orNolDouble
import id.heycoding.shared.utils.mapper.ViewParamMapper


/**
 * Created by Irfan Nawawi on 29/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
object PopularMapper: ViewParamMapper<MovieResponse, PopularViewParam> {
    override fun toViewParam(dataObject: MovieResponse?): PopularViewParam = PopularViewParam(
        backdropPath = dataObject?.backdropPath.orEmpty(),
        id = dataObject?.id.orNol(),
        originalLanguage = dataObject?.originalLanguage.orEmpty(),
        originalTitle = dataObject?.originalTitle.orEmpty(),
        overview = dataObject?.overview.orEmpty(),
        popularity = dataObject?.popularity.orNolDouble(),
        posterPath = dataObject?.posterPath.orEmpty(),
        releaseDate = dataObject?.releaseDate.orEmpty(),
        title = dataObject?.title.orEmpty(),
        video = dataObject?.video.orFalse(),
        voteAverage = dataObject?.voteAverage.orNolDouble(),
        voteCount = dataObject?.voteCount.orNol()
    )
}