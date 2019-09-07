package com.example.ganga.capemay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AmusementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of words
        final ArrayList<Places> Place = new ArrayList<Places>();
        Place.add(new Places(R.string.amusementparks_one, R.string.amusementparkstitle_one));
        Place.add(new Places(R.string.amusementparks_two, R.string.amusementparkstitle_two));
        Place.add(new Places(R.string.amusementparks_three, R.string.amusementparkstitle_three));
        Place.add(new Places(R.string.amusementparks_four, R.string.amusementparkstitle_four));
        Place.add(new Places(R.string.amusementparks_five, R.string.amusementparkstitle_five));
        Place.add(new Places(R.string.amusementparks_six, R.string.amusementparkstitle_six));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlacesAdapter adapter = new PlacesAdapter(this, Place , R.color.category_amusementparks);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
