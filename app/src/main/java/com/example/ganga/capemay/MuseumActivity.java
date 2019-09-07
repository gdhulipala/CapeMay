package com.example.ganga.capemay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        final ArrayList<Places> Place = new ArrayList<Places>();
        Place.add(new Places(R.string.museum_one, R.string.museumtitle_one));
        Place.add(new Places(R.string.museum_two, R.string.sightstitle_two));
        Place.add(new Places(R.string.museum_three, R.string.sightstitle_three));
        Place.add(new Places(R.string.museum_four, R.string.sightstitle_four));
        Place.add(new Places(R.string.museum_five, R.string.sightstitle_five));
        Place.add(new Places(R.string.museum_six, R.string.sightstitle_six));
        Place.add(new Places(R.string.museum_seven, R.string.sightstitle_seven));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(this, Place , R.color.category_museum);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
