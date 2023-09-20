package com.learn;

import java.util.Random;

public class GuesstheBiggestNumber {


    public class BobGameStrategy {
        public static void main(String[] args) {
            int totalGames = 100;
            int bobWins = 0;
            Random random = new Random();

            for (int i = 0; i < totalGames; i++) {
                // Generate two random integers between 0 and 100
                int card1 = random.nextInt(101);
                int card2 = random.nextInt(101);

                // Implement Bob's strategy
                int bobChoice;
                if (card1 >= 50) {
                    bobChoice = card1;
                } else {
                    // If card1 is less than 50, commit to the other card
                    bobChoice = (card1 == card2) ? card1 : card2;
                }

                // Check if Bob's choice is the higher-value card
                if (bobChoice == Math.max(card1, card2)) {
                    bobWins++;
                }
            }

            double winningPercentage = (double) bobWins / totalGames * 100;
            System.out.println("Bob's winning percentage: " + winningPercentage + "%");
        }
    }

}
