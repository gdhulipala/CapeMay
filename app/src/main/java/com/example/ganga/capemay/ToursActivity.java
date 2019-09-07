package com.example.ganga.capemay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ToursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        final ArrayList<Places> Place = new ArrayList<Places>();
        Place.add(new Places(R.string.tours_one, R.string.tourstitle_one));
        Place.add(new Places(R.string.tours_two, R.string.tourstitle_two));
        Place.add(new Places(R.string.tours_three, R.string.tourstitle_three));
        Place.add(new Places(R.string.tours_four, R.string.tourstitle_four));
        Place.add(new Places(R.string.tours_five, R.string.tourstitle_five));
        Place.add(new Places(R.string.tours_six, R.string.tourstitle_six));
        Place.add(new Places(R.string.tours_seven, R.string.tourstitle_seven));
        Place.add(new Places(R.string.tours_eight, R.string.tourstitle_eight));
        Place.add(new Places(R.string.tours_nine, R.string.tourstitle_nine));
        Place.add(new Places(R.string.tours_ten, R.string.tourstitle_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(this, Place , R.color.category_sights);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}
