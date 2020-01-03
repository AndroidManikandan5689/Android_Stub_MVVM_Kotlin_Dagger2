package com.chozhanaadu.androidstub.data.remote

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiHelper {

    @GET(ApiEndPoint.ENDPOINT_SERVER_DISTRICT)
    fun getAllDistrict(): Call<ResponseBody?>?


    @GET(ApiEndPoint.ENDPOINT_ALL_THOGUTHI)
    fun getAllThoguthi(
        @Query(
            value = "did",
            encoded = true
        ) id: String?
    ): Call<ResponseBody?>?


    @POST(ApiEndPoint.ENDPOINT_SERVER_LOGIN)
    fun login(@Body RequestBody: RequestBody?): Call<ResponseBody?>?

    @POST(ApiEndPoint.ENDPOINT_SERVER_REGISTER)
    fun register(@Body requestBody: RequestBody?): Call<ResponseBody?>?

}