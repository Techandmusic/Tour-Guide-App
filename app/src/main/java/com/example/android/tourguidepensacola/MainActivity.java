package com.example.android.tourguidepensacola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.tourguidepensacola.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Card> testCards = new ArrayList<Card>();
        testCards.add(new Card(getString(R.string.card_test_1), getString(R.string.card_test_2), R.drawable.fort_george));
        testCards.add(new Card(getString(R.string.card_test_3), getString(R.string.card_test_4), R.drawable.jerrys_drive_in));
        testCards.add(new Card(getString(R.string.card_test_5), getString(R.string.card_test_6), R.drawable.avation_museum));


        CustomCardAdapter adapter = new CustomCardAdapter(this, testCards);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}


// TODO Add Location Descriptions to strings.xml (Done)
// TODO Import location images to drawable folder (Done)
// TODO Create Fragments for lists (Partially done)
// TODO Create ViewPager
// TODO Create Tabs and tabView for navigation
// TODO Modify MainActivity to use tabView for navigation
// TODO Add visual polish to app

/* Image attribution
*  theoarhouse.com
*  tripadvisor.com
*  leftatthefork.net
*  yelp.com
*  mygeorgiospizza.com
*  zagat.com
*  flickr.com
*  historicpensacola.org
*  pulsegulfcoast.com
*  cityofpensacola.com
*  gibbons-realty.com
*  city-data.com
*  filmnorthflorida.com
*  pnj.com
*  roadsideamerica.com
*  pinterest.com*/