package com.vt.domain

import com.google.gson.annotations.SerializedName

data class JokesResponse(

    @field:SerializedName("result")
    val result: List<ResultItem>? = null,

    @field:SerializedName("total")
    val total: Int? = null
)