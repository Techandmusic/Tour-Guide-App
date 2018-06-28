package com.example.android.tourguidepensacola;

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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.park_1_name), getString(R.string.park_1_about), R.drawable.bartram_park));
        cards.add(new Card(getString(R.string.park_2_name), getString(R.string.park_2_about), R.drawable.bayview_park));
        cards.add(new Card(getString(R.string.park_3_name), getString(R.string.park_3_about), R.drawable.veterans_park));
        cards.add(new Card(getString(R.string.park_4_name), getString(R.string.park_4_about), R.drawable.seville_square));


        return view;
    }
}
