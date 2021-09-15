package com.ethanilao;

import java.util.Objects;

public class Player {
    private int id;
    private String name;
    private int lvl;

    public Player(int id, String name, int lvl) {
        this.id = id;
        this.name = name;
        this.lvl = lvl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lvl=" + lvl +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && lvl == player.lvl && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lvl);
    }
}
