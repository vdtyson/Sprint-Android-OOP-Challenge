package com.versilistyson.sprintprojectweek6

import com.versilistyson.sprintprojectweek6.model.civilizations.Civilization
import com.versilistyson.sprintprojectweek6.model.structures.Structure
import com.versilistyson.sprintprojectweek6.model.technologies.Technology
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

interface AOERequestApi {

        @GET("/civilizations")
        fun getCivilizations(): Call<Civilization>

        @GET("/units")
        fun getUnits(): Call<List<Unit>>

        @GET("/structures")
        fun getStructures(): Call<List<Structure>>

        @GET("/technologies")
        fun getTechnologies(): Call<List<Technology>>

        companion object Factory {

                private const val BASE_URL = "https://age-of-empires-2-api.herokuapp.com/api/v1/"

                fun create(): AOERequestApi {
                        val logger = HttpLoggingInterceptor()
                        logger.level = HttpLoggingInterceptor.Level.BASIC
                        logger.level = HttpLoggingInterceptor.Level.BODY

                        val okHttpClient = OkHttpClient.Builder()
                                .addInterceptor(logger)
                                .retryOnConnectionFailure(false)
                                .readTimeout(10, TimeUnit.SECONDS)
                                .connectTimeout(15, TimeUnit.SECONDS)
                                .build()
                        val retrofit = Retrofit.Builder()
                                .client(okHttpClient)
                                .baseUrl(BASE_URL)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build()
                        return retrofit.create(AOERequestApi::class.java)
                }
        }
}