package com.example.retrofit.model

import com.google.gson.annotations.SerializedName



class MovieResponse {
    @SerializedName("page")
    private val page: Int = 0
    @SerializedName("total_results")
    private val totalResults: Int = 0
    @SerializedName("total_pages")
    private val totalPages: Int = 0
    @SerializedName("results")
    val results: MutableList<Movie>? = null
}