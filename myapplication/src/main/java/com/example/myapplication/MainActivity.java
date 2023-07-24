package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.ratingbar.RatingBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setMaxStars(5);
        ratingBar.setRating(3); // Set the initial rating

        ratingBar.setOnRatingChangedListener(rating -> {
            // Handle the rating change event here
            Toast.makeText(this, "Rating: " + rating, Toast.LENGTH_SHORT).show();
        });
    }
}
