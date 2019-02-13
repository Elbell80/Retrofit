package com.example.retrofit.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.LinearLayout
import com.example.retrofit.R
import com.example.retrofit.adapter.MoviesAdapter
import com.example.retrofit.model.Movie
import com.example.retrofit.model.MovieResponse
import com.hannesdorfmann.mosby.mvp.MvpActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item_movie.*


class MainActivity : MvpActivity<MainActivityView, MainActivityPresenter>(), MainActivityView {

    var moviesadapter: MoviesAdapter?=null
    var movies_list: MutableList<Movie> =ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.getMovieDetails()

        //var recyclerview=findViewById<RecyclerView>(R.id.recycler_view)
        recycler_view.layoutManager=LinearLayoutManager(this)

        Log.e("movies",movies_list.toString())


    }

    override fun populaterecycler(list: MutableList<Movie>) {


        if (moviesadapter == null) {
            moviesadapter = MoviesAdapter(list)
            recycler_view.adapter=moviesadapter
        } else {
            this.movies_list.clear()
            this.movies_list.addAll(list)
            moviesadapter?.notifyDataSetChanged()
        }

    }

    override fun createPresenter(): MainActivityPresenter {
        return MainActivityPresenter()
    }

}
