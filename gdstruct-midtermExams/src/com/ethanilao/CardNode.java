package com.ethanilao;

public class CardNode {
    Card card;
    CardNode nextCardNode;

    public CardNode(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public CardNode getNextCardNode() {
        return nextCardNode;
    }

    public void setNextCardNode(CardNode nextCardNode) {
        this.nextCardNode = nextCardNode;
    }
}
