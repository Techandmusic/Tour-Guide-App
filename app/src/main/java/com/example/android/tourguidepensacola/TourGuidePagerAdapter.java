package com.example.android.tourguidepensacola;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourGuidePagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    //Class constructor
    public TourGuidePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    //getItem returns Fragment based on position
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new restaurantFragment();
            case 1:
                return new museumFragment();
            case 2:
                return new parkFragment();
            case 3:
                return new historicalFragment();
            default:
                return null;
        }
    }

    //getCount returns number of Fragments
    @Override
    public int getCount() {
        return 4;
    }

    //getPageTitle returns string resource associated with a fragment
    //according to position
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.restaurant_title);
            case 1:
                return mContext.getString(R.string.museum_title);
            case 2:
                return mContext.getString(R.string.park_title);
            case 3:
                return mContext.getString(R.string.historical_title);
            default:
                return null;
        }
    }
}
