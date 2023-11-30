package com.vt.source.remote

import android.util.Log
import com.vt.ApiResponse
import com.vt.api.ApiService
import com.vt.domain.ResultItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(
    private val apiService: ApiService,
    private val ioDispatcher: CoroutineDispatcher
) {
    fun searchJokes(query: String?): Flow<ApiResponse<List<ResultItem>>> {
        return flow {
            try {
                val response = apiService.searchJokes(query)
                val list = response.result
                if (list.isNullOrEmpty()) {
                    emit(ApiResponse.Success(response.result!!))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e(REMOTE_DATA_SOURCE_TAG, e.message.toString())
            }
        }.flowOn(ioDispatcher)
    }

    companion object {
        val REMOTE_DATA_SOURCE_TAG: String = RemoteDataSource::class.java.simpleName
    }
}