package com.example.retrofit.main

import android.content.ContentValues.TAG
import android.util.Log
import android.widget.Toast
import com.example.retrofit.listener.OnFinishListener
import com.example.retrofit.model.MovieResponse
import com.example.retrofit.rest.ApiClient
import com.example.retrofit.rest.ApiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



class MainActivityInteractor {
    fun getData(apikey: String, listener: OnFinishListener) {

        if(apikey.isEmpty()){
            listener.onFailure("Please get the API KEY from themoviedb.org.")

        }

        var apiservice= ApiClient().getClient()?.create(ApiInterface::class.java)
        val call = apiservice?.getTopRatedMovies(apikey)
        call?.enqueue(object :Callback<MovieResponse>{
            override fun onFailure(call: Call<MovieResponse>?, t: Throwable?) {
                Log.e("retrooo", t.toString());

            }

            override fun onResponse(call: Call<MovieResponse>?, response: Response<MovieResponse>?) {

                val movies = response?.body()?.results
                if(movies!=null){
                    listener.onSuccess(movies)
                    Log.d("retrofit", "Number of movies received: " + movies?.get(0).title)
                }
            }
        })




    }


}

private fun Any.isEmpty(): Boolean {
    return true

}


