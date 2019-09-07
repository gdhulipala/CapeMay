package com.example.ganga.capemay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.sightslandmarks);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SightsActivity}
                Intent numbersIntent = new Intent(MainActivity.this, SightsActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.outdoor);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OutdoorActivity}
                Intent familyIntent = new Intent(MainActivity.this, OutdoorActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        // Find the View that shows the colors category
        TextView colors = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumsActivity}
                Intent colorsIntent = new Intent(MainActivity.this, MuseumActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView phrases = (TextView) findViewById(R.id.tours);

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToursActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, ToursActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });
        // Find the View that shows the phrases category
        TextView boatTours = (TextView) findViewById(R.id.boattours);

        // Set a click listener on that View
        boatTours.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToursActivity}
                Intent boatToursIntent = new Intent(MainActivity.this, BoatWaterActivity.class);

                // Start the new activity
                startActivity(boatToursIntent);
            }
        });

        TextView natureTours = (TextView) findViewById(R.id.nature);

        // Set a click listener on that View
        natureTours.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToursActivity}
                Intent natureToursIntent = new Intent(MainActivity.this, NatureActivity.class);

                // Start the new activity
                startActivity(natureToursIntent);
            }
        });

        TextView amuseTours = (TextView) findViewById(R.id.amusementparks);

        // Set a click listener on that View
        amuseTours.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToursActivity}
                Intent amuseToursIntent = new Intent(MainActivity.this, AmusementActivity.class);

                // Start the new activity
                startActivity(amuseToursIntent);
            }
        });
    }
    }

