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

public class restaurantFragment extends Fragment {
    private Context mContext;

    public restaurantFragment() {}

    public Context getmContext() {
        mContext = this.getContext();
        return mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);

        RecyclerView recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(getString(R.string.restaurant_1_name), getString(R.string.restaurant_1_about), R.drawable.oar_house));
        cards.add(new Card(getString(R.string.restaurant_2_name), getString(R.string.restaurant_2_about), R.drawable.fish_house_atlas));
        cards.add(new Card(getString(R.string.restaurant_3_name), getString(R.string.restaurant_3_about), R.drawable.jerrys_drive_in));
        cards.add(new Card(getString(R.string.restaurant_4_name), getString(R.string.restaurant_4_about), R.drawable.dharma_blue));
        cards.add(new Card(getString(R.string.restaurant_5_name), getString(R.string.restaurant_5_about), R.drawable.georgios_pizza));
        cards.add(new Card(getString(R.string.restaurant_6_name), getString(R.string.restaurant_6_about), R.drawable.elbow_room));

        CustomCardAdapter restaurantAdapter = new CustomCardAdapter(getmContext(), cards);
        recycle.setAdapter(restaurantAdapter);



        return view;
    }
}
