package com.example.android.popularmovies;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by SmritiDas on 2017-05-30.
 */

public class MovieAdapter extends ArrayAdapter<Movie> {
    private static final String TAG_NAME = MovieAdapter.class.getSimpleName();

    Activity mActivity;
    ArrayList<Movie> mMovies;

    public MovieAdapter(Activity context, ArrayList<Movie> movies){
        super(context, 0, movies);
        this.mActivity = context;
        this.mMovies = movies;

    }

    public static class ViewHolder{
        ImageView mImageViewMovie;
    }

    @Override
    public int getCount(){
        return mMovies.size();
    }

    @Override
    public Movie getItem(int position){
        return mMovies.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    /**
     * Populate the gridview item
     *
     * 1. If the view wasn't seen previously
     * 2. Inflate the view
     * 3. Inflate the imageview
     * 4. setTag - hold the new information
     * 5. Else
     * 6. getTag - access the existing information
     * 7. Fetch and load the info into the inflated imageview
     *
     */

    @Override
    public View getView(int position, View view, ViewGroup parent){
        ViewHolder viewHolder;

        if (view == null){
            view = LayoutInflater.from(mActivity).inflate(R.layout.gridview_image, null);
            viewHolder = new ViewHolder();
            viewHolder.mImageViewMovie = (ImageView) view.findViewById(R.id.imageViewMovie);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Picasso.with(mActivity).load(mMovies.get(position).mThumbnail).
                memoryPolicy(MemoryPolicy.NO_CACHE).into(viewHolder.mImageViewMovie);

        return view;

    }
}
