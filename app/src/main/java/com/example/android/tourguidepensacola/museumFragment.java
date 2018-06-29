package com.example.android.tourguidepensacola;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class museumFragment extends Fragment {
    //Fragment's Context Variable
    private Context mContext;

    //Create instance of Fragment
    public museumFragment() {
    }

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
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.museum_1_name), getString(R.string.museum_1_about), R.drawable.avation_museum));
        cards.add(new Card(getString(R.string.museum_2_name), getString(R.string.museum_2_about), R.drawable.wentworth_museum));
        cards.add(new Card(getString(R.string.museum_3_name), getString(R.string.museum_3_about), R.drawable.pmaphoto));
        cards.add(new Card(getString(R.string.museum_4_name), getString(R.string.museum_4_about), R.drawable.museum_of_commerce));
        cards.add(new Card(getString(R.string.museum_5_name), getString(R.string.museum_5_about), R.drawable.museum_of_industry));
        cards.add(new Card(getString(R.string.museum_6_name), getString(R.string.museum_6_about), R.drawable.childrens_museum));
        //Create RecyclerView adapter and set it to the RecyclerView
        CustomCardAdapter museumAdapter = new CustomCardAdapter(getmContext(), cards);
        recycle.setAdapter(museumAdapter);


        return view;


    }
}
