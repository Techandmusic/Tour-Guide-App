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
        testCards.add(new Card(getString(R.string.card_test_1), getString(R.string.card_test_2), R.drawable.android_party));
        testCards.add(new Card(getString(R.string.card_test_3), getString(R.string.card_test_4), R.drawable.brisketsandwich));


        CustomCardAdapter adapter = new CustomCardAdapter(this, testCards);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}

// TODO Add cardView xml file for list items (Done)
// TODO Add RecyclerView to hold CardViews (Done)
// TODO Create Fragments for lists
// TODO Create ViewPager
// TODO Create Tabs and tabView for navigation
// TODO Create Location class to store information for cards (custom object) (Done)
// TODO Create custom adapter to populate cards from instances for the class (Done)
// TODO Fix positioning and spacing os items on cards to get the look right
