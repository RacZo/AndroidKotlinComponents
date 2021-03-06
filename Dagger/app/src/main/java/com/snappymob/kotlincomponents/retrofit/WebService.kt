package com.snappymob.kotlincomponents.retrofit

import android.arch.lifecycle.LiveData
import com.snappymob.kotlincomponents.model.Repo
import com.snappymob.kotlincomponents.network.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by ahmedrizwan on 9/9/17.
 * Retrofit Service class
 * TODO: Add your Web Api Endpoints here!
 */
interface WebService {

    @GET("users/{login}/repos")
    fun getRepos(@Path("login") login: String): LiveData<ApiResponse<List<Repo>>>

}