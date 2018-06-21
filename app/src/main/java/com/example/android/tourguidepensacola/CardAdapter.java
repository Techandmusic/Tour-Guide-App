package com.example.android.tourguidepensacola;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CardAdapter extends ArrayAdapter<Card> {

    public CardAdapter(Context context, ArrayList<Card> cards) {
        super(context, 0, cards);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        //check if existing view is being reused, if not inflate the view
        View cardView = convertView;
        if (cardView == null){
            cardView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card, parent, false);
        }

        // Get the @link{Card} object located at this position in the list
        Card currentCard = getItem(position);

        //Find the image view in the card with ID card_image
        ImageView cardImageView = (ImageView) cardView.findViewById(R.id.card_image);

        // Set ImageView to Image Resource ID if the card has an image
        if (currentCard.hasImage()) {
            cardImageView.setImageResource();
        }
    }
}
