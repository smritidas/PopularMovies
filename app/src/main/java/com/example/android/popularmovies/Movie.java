package com.example.android.popularmovies;

import java.util.List;

/**
 * Created by SmritiDas on 2017-05-29.
 */

public class Movie {

    //Added LOG tag for debugging
    private static final String LOG_TAG = Movie.class.getSimpleName();

    private String mTitle;
    private String mYear;
    private String mTrailerPrimaryUri;
    private String mThumbnail;

    private List<Movie> Movies;

    Movie(String strTitle, String strYear, String strTrailer, String strThumbnail){
        this.mTitle = strTitle;
        this.mYear = strYear;
        this.mTrailerPrimaryUri = strTrailer;
        this.mThumbnail = strThumbnail;

    }


}
