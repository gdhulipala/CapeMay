package com.example.ganga.capemay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        final ArrayList<Places> Place = new ArrayList<Places>();
        Place.add(new Places(R.string.sights_one, R.string.sightstitle_one));
        Place.add(new Places(R.string.sights_two, R.string.sightstitle_two));
        Place.add(new Places(R.string.sights_three, R.string.sightstitle_three));
        Place.add(new Places(R.string.sights_four, R.string.sightstitle_four));
        Place.add(new Places(R.string.sights_five, R.string.sightstitle_five));
        Place.add(new Places(R.string.sights_six, R.string.sightstitle_six));
        Place.add(new Places(R.string.sights_seven, R.string.sightstitle_seven));
        Place.add(new Places(R.string.sights_eight, R.string.sightstitle_eight));
        Place.add(new Places(R.string.sights_nine, R.string.sightstitle_nine));
        Place.add(new Places(R.string.sights_ten, R.string.sightstitle_ten));

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
