package com.example.android.tourguidepensacola;

public class Card {

    //Constant value representing that no image was supplied for this card
    //May be removed if not needed
    private static final int NO_IMAGE_PROVIDED = -1;
    //Name of the location on the card
    private String cardName;
    //Info about the location on the card
    private String cardAbout;
    //Resource ID for the imag on the card
    private int cardImageID = NO_IMAGE_PROVIDED;

    //Class constructor
    Card(String name, String about, int imageResourceID) {
        cardName = name;
        cardAbout = about;
        cardImageID = imageResourceID;
    }

    //getter methods for accessing private variables
    public String getCardName() {
        return cardName;
    }

    public String getCardAbout() {
        return cardAbout;
    }

    public int getCardImage() {
        return cardImageID;
    }

    //Returns whether not an image is supplied for this card
    //May be removed later if not needed
    public boolean hasImage() {
        return cardImageID != NO_IMAGE_PROVIDED;
    }


}
