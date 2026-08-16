package com.sathish.core.domain

sealed interface DataError : Error {
	enum class Network : DataError {
		REQUEST_TIMEOUT,
		UNAUTHORIZED,
		CONFLICT,
		TOO_MANY_REQUEST,
		PAYLOAD_TOO_LARGE,
		SERVER_ERROR,
		SERIALIZATION,
		NO_INTERNET,
		TIMEOUT,
		UNKNOWN,
	}

	enum class Database : DataError {
		CONNECTION_FAILED,
		TIMEOUT,
		UNKNOWN,
		DISK_FULL
	}
}