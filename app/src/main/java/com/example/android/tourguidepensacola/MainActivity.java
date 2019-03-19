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


        //Create the ViewPager for the list Fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        //Create the PagerAdapter
        PagerAdapter pagerAdapter = new TourGuidePagerAdapter(this, getSupportFragmentManager());
        //Set the PagerAdapter to the ViewPager
        viewPager.setAdapter(pagerAdapter);
        //Create the main TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        //Call the setupWithViewPager method to connect TabLayout automatically
        tabLayout.setupWithViewPager(viewPager);


    }
}

//Working version with original code









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

/*Code Attribution
 * Although I didn't directly copy any code I did draw some inspiration from github.com/TheBaileyBrew/JurrasicTourGuide. Big Thanks!!
 * I also found the article at https://willowtreeapps.com/ideas/android-fundamentals-working-with-the-recyclerview-adapter-and-viewholder-pattern/ quite helpful
 * */