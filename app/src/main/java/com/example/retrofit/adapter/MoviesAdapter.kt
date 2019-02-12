package com.example.retrofit.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.LinearLayout
import com.example.retrofit.adapter.MoviesAdapter.MovieViewHolder
import android.view.LayoutInflater
import com.example.retrofit.R
import com.example.retrofit.model.MovieResponse


class MoviesAdapter(val items : MutableList<MovieResponse>): RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {
    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var moviesLayout: LinearLayout? = null
        var movieTitle: TextView? = null
        var data: TextView? = null
        var movieDescription: TextView? = null
        var rating: TextView? = null

    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MoviesAdapter.MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_movie, parent, false)
        return MovieViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 0
    }

    override fun onBindViewHolder(holder: MoviesAdapter.MovieViewHolder, p1: Int) {
        //holder.movieTitle.text(movies.get(position).getTitle());
        //holder?.movieTitle?.text=

        }

}