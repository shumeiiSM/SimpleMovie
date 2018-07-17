package com.example.a17010233.simplemovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Step 1b: Create a ListView variable
    ListView lvMovie;

    //Step 2a: Create an ArrayList variable
    ArrayList<String> alMovieList;

    //Step 3a: Create an ArrayAdapter
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1c: Bing the UI element to the Java variable
        lvMovie = findViewById(R.id.listViewMovie);

        // Step 2b: Initialise the ArrayList
        alMovieList = new ArrayList<>();

        //Step 2c: Add data to the ArrayList
        alMovieList.add("Love War Release Date: 2018.03");
        alMovieList.add("End War Release Date: 2018.07");

        //Step 3c: Initialise the ArrayAdapter and bind it to the ArrayList
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);

        lvMovie.setAdapter(aaMovie);
    }
}
