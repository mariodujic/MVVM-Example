package com.groundzero.asynclabs.features.content.feed.api

import retrofit2.Response
import retrofit2.http.GET

interface FeedApi {

    @GET("feed?page=1&sport=football")
    suspend fun getFeed(): Response<List<FeedResponse>>
}