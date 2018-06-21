package com.example.android.tourguidepensacola;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card> {

    public CardAdapter(Context context, ArrayList<Card> cards) {
        super(context, 0, cards);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
