package com.example.android.tourguidepensacola;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.tourguidepensacola.Card;
import com.example.android.tourguidepensacola.CustomCardAdapter;
import com.example.android.tourguidepensacola.R;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class historicalFragment extends Fragment {
    //Fragment's Context Variable
    private Context mContext;

    //Create instance of Fragment
    public historicalFragment() {
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
        cards.add(new Card(getString(R.string.site_1_name), getString(R.string.site_1_about), R.drawable.dorr_house));
        cards.add(new Card(getString(R.string.site_2_name), getString(R.string.site_2_about), R.drawable.fort_pickens));
        cards.add(new Card(getString(R.string.site_3_name), getString(R.string.site_3_about), R.drawable.fort_barrancas));
        cards.add(new Card(getString(R.string.site_4_name), getString(R.string.site_4_about), R.drawable.fort_george));
        cards.add(new Card(getString(R.string.site_5_name), getString(R.string.site_5_about), R.drawable.crystal_icehouse));
        cards.add(new Card(getString(R.string.site_6_name), getString(R.string.site_6_about), R.drawable.grafitti_bridge));
        //Create RecyclerView adapter and set it to the RecyclerView
        CustomCardAdapter historicalAdapter = new CustomCardAdapter(getmContext(), cards);
        recycle.setAdapter(historicalAdapter);


        return view;
    }
}
