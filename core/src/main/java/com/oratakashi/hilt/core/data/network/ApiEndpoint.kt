package com.oratakashi.hilt.core.data.network

import io.reactivex.Single
import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiEndpoint {
    @GET("hotel")
    fun getHotel() : Single<ResponseBody>
}