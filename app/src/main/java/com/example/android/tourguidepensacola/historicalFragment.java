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

public class historicalFragment extends Fragment {

    public historicalFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        RecyclerView recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.site_1_name), getString(R.string.site_1_about), R.drawable.dorr_house));
        cards.add(new Card(getString(R.string.site_2_name), getString(R.string.site_2_about), R.drawable.fort_pickens));
        cards.add(new Card(getString(R.string.site_3_name), getString(R.string.site_3_about), R.drawable.fort_barrancas));
        cards.add(new Card(getString(R.string.site_4_name), getString(R.string.site_4_about), R.drawable.fort_george));
        cards.add(new Card(getString(R.string.site_5_name), getString(R.string.site_5_about), R.drawable.crystal_icehouse));
        cards.add(new Card(getString(R.string.site_6_name), getString(R.string.site_6_about), R.drawable.grafitti_bridge));

        CustomCardAdapter historicalAdapter = new CustomCardAdapter(this, cards);
        recycle.setAdapter(historicalAdapter);








        return view;
    }
}
