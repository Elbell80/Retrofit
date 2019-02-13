package com.example.retrofit.main

import android.widget.Toast
import com.example.retrofit.listener.OnFinishListener
import com.example.retrofit.model.Movie
import com.example.retrofit.model.MovieResponse
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter

class MainActivityPresenter: MvpBasePresenter<MainActivityView>() {
    var mainInteractor= MainActivityInteractor()

    fun getMovieDetails(){
        var apikey="fbe59abd25dd434919b12e88d07eb166"
        mainInteractor.getData(apikey, object :OnFinishListener{
            override fun onSuccess(data: MutableList<Movie>) {
                view?.populaterecycler(data)

            }

            override fun onFailure(messsage: String) {



            }


        })

    }
}