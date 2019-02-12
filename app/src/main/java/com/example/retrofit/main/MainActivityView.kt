package com.example.retrofit.main

import com.example.retrofit.model.Movie
import com.example.retrofit.model.MovieResponse
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter
import com.hannesdorfmann.mosby.mvp.MvpView

interface MainActivityView: MvpView {

    fun populaterecycler(list: MutableList<Movie>)
}