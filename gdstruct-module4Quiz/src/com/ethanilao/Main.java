package com.ethanilao;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Create a int for how many games were played
        int gamesPlayed = 0;

        // Maximum amount of games
        int maxGames;

        // Create random seed
        Random rand = new Random();

        // Random players for queueing
        int randomPlayers;

        // Create arrayQueue
        ArrayQueue arrayQueue;

        // Scanner
        Scanner scanner = new Scanner(System.in);
        String pressEnter;

        //
        int totalPlayers = 0;

        // Minimum players to get
        int minPlayers = 5;


        while (true)
        {
            // Pick random values from 1 to 7 (0 - 6)
            randomPlayers = rand.nextInt(7);

            // Add random values for player queueing
            totalPlayers += randomPlayers;

            // Print out random numbers
            if (randomPlayers == 1)
            {
                System.out.println("\n" + randomPlayers + " player has entered the queue.");
            }

            else if (randomPlayers == 0)
            {
                System.out.println("\nNo players found.");
            }

            else {
                System.out.println("\n" + randomPlayers + " players have entered the queue.");
            }

            // Print out the totalPlayer values
            System.out.println("\nPlayers in queue: " + totalPlayers);

            // Substitute for System("pause");
            pressEnter = scanner.nextLine();

            // If total players are at 5 or more, time to start the game
            if (totalPlayers >= 5)
            {
                // Increment gamesPlayed
                gamesPlayed++;

                // How many games are played
                System.out.println("\nGames played: " + gamesPlayed);

                // Instantiate a new arrayQueue
                arrayQueue = new ArrayQueue(totalPlayers);

                // Add players based on totalPlayers given
                for (int i = 0; i < totalPlayers; i++)
                {
                    arrayQueue.add(new Player("Player " + (i + 1), i + 1));
                }

                // Print out that a game is in session
                System.out.println("\nGame is in session...");

                // Subtract totalPlayers
                totalPlayers -= minPlayers;

                // Boot up 5 players from the queue
                for (int i = 0; i < minPlayers; i++)
                {
                    arrayQueue.remove();
                }

                System.out.println("\nCurrent players in queue: " + totalPlayers);
            }

            maxGames = 10;

            // If it reaches 10 games, end the loop
            if (gamesPlayed == maxGames)
            {
                break;
            }
        }


    }
}
