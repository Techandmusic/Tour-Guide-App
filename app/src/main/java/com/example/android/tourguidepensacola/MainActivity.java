package com.example.android.tourguidepensacola;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.TabLayout;

import com.example.android.tourguidepensacola.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        PagerAdapter pagerAdapter = new TourGuidePagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);





    }
}


// TODO Add Location Descriptions to strings.xml (Done)
// TODO Import location images to drawable folder (Done)
// TODO Create Fragments for lists (Done)
// TODO Create ViewPager (Done)
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