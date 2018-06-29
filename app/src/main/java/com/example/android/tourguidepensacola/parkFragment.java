package com.example.android.tourguidepensacola;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class parkFragment extends Fragment {
    //Fragment's Context Variable
    private Context mContext;
    //Create instance of Fragment
    public parkFragment() {}
    //Fragment's built in getContext method
    public Context getmContext() {
        mContext = this.getContext();
        return mContext;
    }

    //Create view and perform additional tasks
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        //Create RecyclerView, set FixedSize property, and LayoutManager
        RecyclerView recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        //Create ArrayList of cards, and cards for this Fragment's category
        ArrayList<Card> parkCards = new ArrayList<>();
        parkCards.add(new Card(getString(R.string.park_1_name), getString(R.string.park_1_about), R.drawable.bartram_park));
        parkCards.add(new Card(getString(R.string.park_2_name), getString(R.string.park_2_about), R.drawable.bayview_park));
        parkCards.add(new Card(getString(R.string.park_3_name), getString(R.string.park_3_about), R.drawable.veterans_park));
        parkCards.add(new Card(getString(R.string.park_4_name), getString(R.string.park_4_about), R.drawable.seville_square));
        //Create RecyclerView adapter and set it to the RecyclerView
        CustomCardAdapter parkAdapter = new CustomCardAdapter(getmContext(), parkCards);
        recycle.setAdapter(parkAdapter);


        return view;
    }
}
