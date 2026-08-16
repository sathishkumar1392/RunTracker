package com.sathish.core.domain

sealed interface Result<out D,out E: Error> {
	data class Success<out D>(val data:D) : Result<D,Nothing>
	data class Error<out E: com.sathish.core.domain.Error> (val error:E) : Result<Nothing,E>
}

inline fun <T,E:Error,R> Result<T,E>.map(map:(T) -> R): Result<R,E> = when(this) {
	is Result.Success -> Result.Success(map(this.data))
	is Result.Error -> this
}

fun <T,E:Error> Result<T,E>.asEmptyDataResult() : EmptyDataResult<E> {
	return map{}
}

typealias EmptyDataResult<E> = Result<Unit,E>