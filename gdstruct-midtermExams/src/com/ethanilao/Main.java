package com.ethanilao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Initialize Card Deck
        CardStack cardStack = new CardStack();

        // Named cards, duplicates are made
        cardStack.addToFrontDeck(new Card("King"));
        cardStack.addToFrontDeck(new Card("Queen"));
        cardStack.addToFrontDeck(new Card("Jester"));
        cardStack.addToFrontDeck(new Card("Knight"));
        cardStack.addToFrontDeck(new Card("Bishop"));
        cardStack.addToFrontDeck(new Card("King"));
        cardStack.addToFrontDeck(new Card("Queen"));
        cardStack.addToFrontDeck(new Card("Jester"));
        cardStack.addToFrontDeck(new Card("Knight"));
        cardStack.addToFrontDeck(new Card("Bishop"));
        cardStack.addToFrontDeck(new Card("King"));
        cardStack.addToFrontDeck(new Card("Queen"));
        cardStack.addToFrontDeck(new Card("Jester"));
        cardStack.addToFrontDeck(new Card("Knight"));
        cardStack.addToFrontDeck(new Card("Bishop"));
        cardStack.addToFrontDeck(new Card("King"));
        cardStack.addToFrontDeck(new Card("Queen"));
        cardStack.addToFrontDeck(new Card("Jester"));
        cardStack.addToFrontDeck(new Card("Knight"));
        cardStack.addToFrontDeck(new Card("Bishop"));
        cardStack.addToFrontDeck(new Card("King"));
        cardStack.addToFrontDeck(new Card("Queen"));
        cardStack.addToFrontDeck(new Card("Jester"));
        cardStack.addToFrontDeck(new Card("Knight"));
        cardStack.addToFrontDeck(new Card("Bishop"));
        cardStack.addToFrontDeck(new Card("King"));
        cardStack.addToFrontDeck(new Card("Queen"));
        cardStack.addToFrontDeck(new Card("Jester"));
        cardStack.addToFrontDeck(new Card("Knight"));
        cardStack.addToFrontDeck(new Card("Bishop"));

        // Drawn card deck
        CardStack drawnDeck = new CardStack();

        // Discarded deck
        CardStack discardedDeck = new CardStack();

        // For player input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");

        String playerName = scanner.nextLine(); // Read user input
        System.out.println(("\nHello " + playerName) + ", this is a program to simulate a card game.");

        // Round check
        int roundNumber = 0;

        Random rand = new Random();

        int rngCommand = rand.nextInt(3);
        int rngIndex = rand.nextInt(6);

        // Unless the cardStack is completely empty, the program will keep on going
        while (true)
        {
            roundNumber++;

            // Display round number
            System.out.println("Round " + roundNumber);

            rngCommand = rand.nextInt(3);
            rngIndex = rand.nextInt(6);

            if (cardStack.getListSize() > 0)
            {
                if (rngCommand == 0)
                {
                    System.out.println("\nDraw cards.");
                    drawnDeck.addToFrontDeck(cardStack.drawCard(rngIndex, drawnDeck));
                }

                else if (rngCommand == 1)
                {
                    System.out.println("\nDiscard cards.");
                    discardedDeck.addToFrontDeck(cardStack.drawCard(rngIndex, discardedDeck));
                }

                else if (rngCommand == 2)
                {
                    System.out.println("\nGet discarded cards.");
                    drawnDeck.addToFrontDeck(discardedDeck.drawCard(rngIndex, drawnDeck));
                }
            }

            else {
                if (rngCommand == (0 | 1))
                {
                    System.out.println("\nDiscard cards.");
                    discardedDeck.addToFrontDeck(drawnDeck.drawCard(rngIndex, discardedDeck));
                }

                else if (rngCommand == 2)
                {
                    System.out.println("\nGet discarded cards.");
                    drawnDeck.addToFrontDeck(discardedDeck.drawCard(rngIndex, drawnDeck));
                }
            }

            // Display card deck
            System.out.println("\nDisplay default deck: ");
            cardStack.printList();

            // Display player deck
            System.out.println("\nDisplay player deck: ");
            drawnDeck.printList();

            // Display discarded deck
            System.out.println("\nDisplay discarded deck: ");
            discardedDeck.printList();

            System.out.println("\n");
            scanner.nextLine();

            if (discardedDeck.getListSize() >= 30)
            {
                System.out.println("\nRounds done: " + roundNumber);
                System.out.println(playerName + "'s deck: ");
                discardedDeck.printList();
                break;
            }
        }
    }
}
