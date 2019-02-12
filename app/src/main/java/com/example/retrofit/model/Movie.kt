package com.example.retrofit.model

import com.google.gson.annotations.SerializedName

class Movie {

    @SerializedName("vote_count")
    var voteCount: Int?= 0
    @SerializedName("id")
    var id:Int?=0
    @SerializedName("vide0")
    var video: Boolean?=null
    @SerializedName("vote_average")
    var voteAverage: Double?=0.0
    @SerializedName("title")
    var title:String?=null
    @SerializedName("popularity")
    var popularity:Double?=0.0
    @SerializedName("poster_path")
    var posterPath:String?=null
    @SerializedName("original_language")
    var originalLanguage:String?=null
    @SerializedName("original_title")
    var originalTitle:String?= null
    @SerializedName("genre_ids")
    var genreIds:   List<Int>?= null
    @SerializedName("backdrop_path")
    var backdropPasth:   String?= null
    @SerializedName("adult")
    var adult:   Boolean?=null
    @SerializedName("overview")
    var overview:   String?= null
    @SerializedName("release_date")
    var releaseDate:   String?= null


}