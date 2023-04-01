package id.heycoding.layartancep.domain.usecase

interface UseCase<T, U> {
    fun execute(param: T): U
}