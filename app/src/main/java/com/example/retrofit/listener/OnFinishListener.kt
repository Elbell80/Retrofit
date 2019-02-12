package com.example.retrofit.listener

import com.example.retrofit.model.Movie
import com.example.retrofit.model.MovieResponse
import java.util.ArrayList

interface OnFinishListener {
    fun onSuccess(data: MutableList<Movie>)
    fun onFailure(messsage: String)
}
