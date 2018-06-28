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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.site_1_name), getString(R.string.site_1_about), R.drawable.dorr_house));
        cards.add(new Card(getString(R.string.site_2_name), getString(R.string.site_2_about), R.drawable.fort_pickens));
        cards.add(new Card(getString(R.string.site_3_name), getString(R.string.site_3_about), R.drawable.fort_barrancas));
        cards.add(new Card(getString(R.string.site_4_name), getString(R.string.site_4_about), R.drawable.fort_george));
        cards.add(new Card(getString(R.string.site_5_name), getString(R.string.site_5_about), R.drawable.crystal_icehouse));
        cards.add(new Card(getString(R.string.site_6_name), getString(R.string.site_6_about), R.drawable.grafitti_bridge));

        CustomCardAdapter adapter = new CustomCardAdapter(cards);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
