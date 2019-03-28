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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class baseFragment extends Fragment
{
    //Fragment's Context Variable
    private Context mContext;
    //ArrayList to store cards
    private ArrayList<Card> cards;

    //Fragment's built in getContext method
    public Context getmContext() {
        mContext = this.getContext();
        return mContext;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment, container, false);
        //Create RecyclerView, set FixedSize property, and LayoutManager
        RecyclerView recycle = (RecyclerView) view.findViewById(R.id.recycler_view);
        recycle.setHasFixedSize(true);
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        //Add cards to ArrayList
        cards = new ArrayList<>();
        //Create RecyclerView adapter and set it to the RecyclerView
        CustomCardAdapter museumAdapter = new CustomCardAdapter(getmContext(), cards);
        recycle.setAdapter(museumAdapter);

        return view;
    }

    public void addCards(String cardName, String cardAbout, int imageResourceId)
    {
        cards.add(new Card(cardName, cardAbout, imageResourceId));
    }
}
