package com.example.retrofit.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofit.R
import com.example.retrofit.model.MovieResponse
import com.hannesdorfmann.mosby.mvp.MvpActivity


class MainActivity : MvpActivity<MainActivityView, MainActivityPresenter>(), MainActivityView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.getMovieDetails()

    }

    override fun populaterecycler(list: MutableList<MovieResponse>) {


    }

    override fun createPresenter(): MainActivityPresenter {
        return MainActivityPresenter()
    }
}
