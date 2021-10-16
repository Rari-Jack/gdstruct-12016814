package com.ethanilao;

public class Player {
    private String mName;
    private int mLevel;

    public Player(String mName, int mLevel) {
        this.mName = mName;
        this.mLevel = mLevel;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    @Override
    public String toString() {
        return "Player{" +
                "mName='" + mName + '\'' +
                ", mLevel=" + mLevel +
                '}';
    }
}
