package com.ethanilao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardStack {
    private CardNode head;
    private int listSize;
    private int rngCommand;
    private int rngIndex;

    public void addToFrontDeck(Card card)
    {
        if (card == null)
        {
            return;
        }

        CardNode cardNode = new CardNode(card);
        cardNode.setNextCardNode(head);
        head = cardNode;
    }

    public Card drawCard(int playerIndex, CardStack deck)
    {
        CardNode tempNode = head;

        if (tempNode == null)
        {
            System.out.println("No cards to draw from.");
            return null;
        }

        for (int i = 0; i < playerIndex; i++)
        {
            if (head == null)
            {
                return null;
            }

            head = head.nextCardNode;
        }

        for (int i = 0; i < playerIndex - 1; i++)
        {
            if (tempNode == null)
            {
                System.out.println("No cards to draw from.");
                return null;
            }

            tempNode.card.getmCardName();
            deck.addToFrontDeck(tempNode.card);
            tempNode = tempNode.nextCardNode;
        }

        return tempNode.getCard();
    }

    public void checkDiscarded()
    {
        CardNode current = head;
    }

    public void printList()
    {
        CardNode current = head;

        if (current == null)
        {
            System.out.println("This deck is empty.");
            return;
        }

        while(current != null)
        {
            if (current == null)
            {
                break;
            }

            else {
                System.out.println(current.getCard().getmCardName());
                current = current.getNextCardNode();
            }
        }
    }

    public int getListSize()
    {
        listSize = 0;

        CardNode current = head;
        while (current != null)
        {
            listSize++;
            current = current.getNextCardNode();
        }

        return listSize;
    }

}
