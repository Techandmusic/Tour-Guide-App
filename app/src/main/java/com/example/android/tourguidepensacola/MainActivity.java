package com.example.android.tourguidepensacola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

// TODO Add cardView xml file for list items (Done)
// TODO Add RecyclerView to hold CardViews
// TODO Create Fragments for lists
// TODO Create ViewPager
// TODO Create Tabs and tabView for navigation
// TODO Create Location class to store information for cards (custom object) (Done)
// TODO Create custom adapter to populate cards from instances for the class
