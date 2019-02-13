package com.example.retrofit.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.LinearLayout
import com.example.retrofit.adapter.MoviesAdapter.MovieViewHolder
import android.view.LayoutInflater
import com.example.retrofit.R
import com.example.retrofit.model.Movie
import com.example.retrofit.model.MovieResponse


class MoviesAdapter(val items : MutableList<Movie>): RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var moviesLayout: LinearLayout? = null
        var movieTitle= itemView.findViewById<TextView>(R.id.title)
        var data= itemView.findViewById<TextView>(R.id.subtitle)
        var movieDescription= itemView.findViewById<TextView>(R.id.description)
        var rating= itemView.findViewById<TextView>(R.id.rating)

    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MoviesAdapter.MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_movie, parent, false)
        return MovieViewHolder(view)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MoviesAdapter.MovieViewHolder, p1: Int) {
        //holder.movieTitle.text(movies.get(position).getTitle());
        holder?.movieTitle?.text=items.get(p1).title
        holder?.data?.text=items.get(p1).releaseDate
        holder?.movieDescription?.text=items.get(p1).overview
        holder?.rating?.text= items.get(p1).voteAverage.toString()

        }

}