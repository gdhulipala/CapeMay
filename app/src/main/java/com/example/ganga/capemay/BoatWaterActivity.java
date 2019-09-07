package com.example.ganga.capemay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BoatWaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        final ArrayList<Places> Place = new ArrayList<Places>();
        Place.add(new Places(R.string.boattours_one, R.string.boattourstitle_one));
        Place.add(new Places(R.string.boattours_two, R.string.boattourstitle_two));
        Place.add(new Places(R.string.boattours_three, R.string.boattourstitle_three));
        Place.add(new Places(R.string.boattours_four, R.string.boattourstitle_four));
        Place.add(new Places(R.string.boattours_five, R.string.boattourstitle_five));
        Place.add(new Places(R.string.boattours_six, R.string.boattourstitle_six));
        Place.add(new Places(R.string.boattours_seven, R.string.boattourstitle_seven));
        Place.add(new Places(R.string.boattours_eight, R.string.boattourstitle_eight));
        Place.add(new Places(R.string.boattours_nine, R.string.boattourstitle_nine));
        Place.add(new Places(R.string.boattours_ten, R.string.boattourstile_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(this, Place , R.color.category_boattours);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
