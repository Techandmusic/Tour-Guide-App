package com.example.android.tourguidepensacola;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomCardAdapter extends RecyclerView.Adapter<CustomCardAdapter.CardHolder> {
    //Private class variables for the adapter
    private ArrayList<Card> cards;
    private Context context;
    private LayoutInflater inflater;

    //Class constuctor
    public CustomCardAdapter(Context context, ArrayList<Card> cards) {
        this.inflater = LayoutInflater.from(context);
        this.cards = cards;

    }

    //Cardholder method creates the viewholder
    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card, parent, false);
        return new CardHolder(view);


    }

    // onBindViewHolder finds current card in the ArrayList
    // and sets text and images to the appropriate views
    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        Card currentCard = cards.get(position);
        holder.cardImage.setImageResource(currentCard.getCardImage());
        holder.cardName.setText(currentCard.getCardName());
        holder.cardAbout.setText(currentCard.getCardAbout());

    }

    //getItemCount method returns size of cards ArrayList for simplicity
    @Override
    public int getItemCount() {
        return cards.size();
    }

    //Embedded CardHolder Class
    public class CardHolder extends RecyclerView.ViewHolder {
        public ImageView cardImage;
        public TextView cardName;
        public TextView cardAbout;

        //CardHolder Class constructor
        public CardHolder(View cardView) {
            super(cardView);

            cardImage = (ImageView) cardView.findViewById(R.id.card_image);
            cardName = (TextView) cardView.findViewById(R.id.card_name);
            cardAbout = (TextView) cardView.findViewById(R.id.card_about);
        }
    }
}
