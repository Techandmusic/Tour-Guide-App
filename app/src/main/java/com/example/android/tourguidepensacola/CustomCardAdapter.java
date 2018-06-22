package com.example.android.tourguidepensacola;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomCardAdapter extends RecyclerView.Adapter<CustomCardAdapter.CardHolder> {
    private ArrayList<Card> cards;
    private Context context;
    private LayoutInflater inflater;

    public class CardHolder extends RecyclerView.ViewHolder {
        public ImageView cardImage;
        public TextView cardName;
        public TextView cardAbout;

        public CardHolder(View cardView){
            super(cardView);

            cardImage = (ImageView) cardView.findViewById(R.id.card_image);
            cardName = (TextView) cardView.findViewById(R.id.card_name);
            cardAbout = (TextView) cardView.findViewById(R.id.card_about);
        }
    }

    public CustomCardAdapter(Context context, ArrayList<Card> cards) {
        this.inflater = LayoutInflater.from(context);
        this.cards = cards;

    }


    @Override
    public CardHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card, parent, false);
        return new CardHolder(view);



    }


    @Override
    public void onBindViewHolder(CardHolder holder, int position) {
        Card currentCard = cards.get(position);
        holder.cardImage.setImageResource(currentCard.getCardImage());
        holder.cardName.setText(currentCard.getCardName());
        holder.cardAbout.setText(currentCard.getCardAbout());

    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
