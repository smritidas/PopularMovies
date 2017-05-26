package com.example.android.popularmovies;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
    implements MovieFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add in Fragment initiation
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
            //call the MovieFragment code
            .add(R.id.movies_container,new MovieFragment())
            .commit();
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
