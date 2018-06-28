package com.example.android.tourguidepensacola;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourGuidePagerAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public TourGuidePagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

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

    @Override
    public int getCount() {
        return 4;
    }


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
