package id.heycoding.layartancep.data.mapper

import id.heycoding.layartancep.data.local.entity.movie.MoviesEntity
import id.heycoding.layartancep.data.remote.response.movie.MovieResponse
import id.heycoding.layartancep.domain.model.movie.Movies
import id.heycoding.layartancep.utils.ElvisExtensions.orFalse
import id.heycoding.layartancep.utils.ElvisExtensions.orNol

object MovieMapper {
    fun MovieResponse?.mappingMovieResponseToMovies(): List<Movies> {
        val newList: MutableList<Movies> = mutableListOf()

        this?.results?.forEach {
            newList.add(
                Movies(
                    id = it.id.orNol(),
                    adult = it.adult.orFalse(),
                    backdropPath = it.backdropPath.orEmpty(),
                    originalLanguage = it.originalLanguage.orEmpty(),
                    originalTitle = it.originalTitle.orEmpty(),
                    overview = it.overview.orEmpty(),
                    popularity = it.popularity.orNol(),
                    posterPath = it.posterPath.orEmpty(),
                    releaseDate = it.releaseDate.orEmpty(),
                    title = it.title.orEmpty(),
                    video = it.video.orFalse(),
                    voteAverage = it.voteAverage.orNol(),
                    voteCount = it.voteCount.orNol()
                )
            )
        }

        return newList
    }

    fun List<Movies>?.mappingMoviesToMovieEntity(): List<MoviesEntity> {
        val newList: MutableList<MoviesEntity> = mutableListOf()

        this?.forEach {
            newList.add(
                MoviesEntity(
                    id = it.id.orNol(),
                    adult = it.adult.orFalse(),
                    backdropPath = it.backdropPath.orEmpty(),
                    originalLanguage = it.originalLanguage.orEmpty(),
                    originalTitle = it.originalTitle.orEmpty(),
                    overview = it.overview.orEmpty(),
                    popularity = it.popularity.orNol(),
                    posterPath = it.posterPath.orEmpty(),
                    releaseDate = it.releaseDate.orEmpty(),
                    title = it.title.orEmpty(),
                    video = it.video.orFalse(),
                    voteAverage = it.voteAverage.orNol(),
                    voteCount = it.voteCount.orNol()
                )
            )
        }

        return newList

    }

    fun List<MoviesEntity>?.mappingPopularMovieEntityToMovies(): List<Movies> {
        val newList: MutableList<Movies> = mutableListOf()

        this?.forEach {
            newList.add(
                Movies(
                    id = it.id.orNol(),
                    adult = it.adult.orFalse(),
                    backdropPath = it.backdropPath.orEmpty(),
                    originalLanguage = it.originalLanguage.orEmpty(),
                    originalTitle = it.originalTitle.orEmpty(),
                    overview = it.overview.orEmpty(),
                    popularity = it.popularity.orNol(),
                    posterPath = it.posterPath.orEmpty(),
                    releaseDate = it.releaseDate.orEmpty(),
                    title = it.title.orEmpty(),
                    video = it.video.orFalse(),
                    voteAverage = it.voteAverage.orNol(),
                    voteCount = it.voteCount.orNol()
                )
            )
        }

        return if (this.isNullOrEmpty()) {
            emptyList()
        } else {
            newList
        }
    }
}