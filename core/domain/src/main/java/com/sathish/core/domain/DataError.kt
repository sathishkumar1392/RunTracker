package com.sathish.core.domain

sealed interface DataError : Error {
	enum class Network : DataError {
		REQUEST_TIMEOUT,
		TOO_MANY_REQUESTS,
		PAYLOAD_TOO_LARGE,
		SERVER_ERROR,
		SERIALIZATION,
		NO_INTERNET,
		UNKNOWN,
		UNAUTHORIZED,
		CONFLICT

	}

	enum class Local : DataError {
		DISK_FULL
	}
}