package id.heycoding.core.base

import id.heycoding.core.wrapper.ViewResource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlin.jvm.Throws


/**
 * Created by Irfan Nawawi on 24/01/24.
 * heycoding.tech
 * heycoding@gmail.com
 */
abstract class BaseUseCase<P, R : Any?>(private val dispatcher: CoroutineDispatcher) {
    suspend operator fun invoke(param: P? = null): Flow<ViewResource<R>> {
        return execute(param).catch { emit(ViewResource.Error(Exception(it))) }.flowOn(dispatcher)
    }

    @Throws(RuntimeException::class)
    abstract suspend fun execute(param: P? = null): Flow<ViewResource<R>>
}