package com.ethanilao;

import java.util.Objects;

public class Player {
    private String mName;

    public Player(String mName) {
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(mName, player.mName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mName);
    }

    @Override
    public String toString() {
        return "Player{" +
                "mName='" + mName + '\'' +
                '}';
    }
}
