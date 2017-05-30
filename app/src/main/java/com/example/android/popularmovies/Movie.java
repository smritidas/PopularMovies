package com.example.android.popularmovies;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;


public class Movie implements Parcelable{

    //Added LOG tag for debugging
    private static final String LOG_TAG = Movie.class.getSimpleName();

    private String mTitle;
    private String mYear;
    private String mTrailerPrimaryUri;
    private String mThumbnail;


    private Movie(Parcel in){
        this.mTitle = in.readString();
        this.mYear = in.readString();
        this.mTrailerPrimaryUri = in.readString();
        this.mThumbnail = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flag) {
        dest.writeString(this.mTitle);
        dest.writeString(this.mYear);
        dest.writeString(this.mTrailerPrimaryUri);
        dest.writeString(this.mThumbnail);

    }

    public final Parcelable.Creator<Movie> CREATOR = new
            Creator<Movie>() {
                @Override
                public Movie createFromParcel(Parcel parcel) {
                    return new Movie(parcel);
                }

                @Override
                public Movie[] newArray(int i) {
                    return new Movie[0];
                }
            };
}
