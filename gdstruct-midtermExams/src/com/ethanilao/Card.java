package com.ethanilao;

public class Card {
    private String mCardName;

    public Card(String mCardName) {
        this.mCardName = mCardName;
    }

    public String getmCardName() {
        return mCardName;
    }

    public void setmCardName(String mCardName) {
        this.mCardName = mCardName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "mCardName='" + mCardName + '\'' +
                '}';
    }
}
