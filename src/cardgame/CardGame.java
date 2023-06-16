/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Random;

public class CardGame {
    
    public static void main(String[] args) {
        String[] suits = {"hearts", "clubs", "spades", "diamonds"};
        
        Card[] hand = generateHand(suits);
        
        // Ask the users for card specs
        // Assuming you want to match based on value and suit
        int desiredValue = getUserInputValue();
        String desiredSuit = getUserInputSuit();
        
        // Search for a match in the hand of cards
        boolean foundMatch = searchForMatch(hand, desiredValue, desiredSuit);
        
        if (foundMatch) {
            System.out.println("Match found in the hand of cards.");
        } else {
            System.out.println("No match found in the hand of cards.");
        }
    }
    
    private static Card[] generateHand(String[] suits) {
        int handSize = 7;
        Card[] hand = new Card[handSize];
        Random random = new Random();
        
        for (int i = 0; i < handSize; i++) {
            int randomValue = random.nextInt(13) + 1; // Generating random values between 1 and 13
            String randomSuit = suits[random.nextInt(suits.length)];
            hand[i] = new Card(randomValue, randomSuit);
        }
        
        return hand;
    }
    
    private static int getUserInputValue() {
        // Implement your logic to get user input for card value
        // You can use Scanner class or any other method to get the user input
        // and return the entered value as an integer
        return 0; // Placeholder, replace it with your implementation
    }
    
    private static String getUserInputSuit() {
        // Implement your logic to get user input for card suit
        // You can use Scanner class or any other method to get the user input
        // and return the entered suit as a String
        return null; // Placeholder, replace it with your implementation
    }
    
    private static boolean searchForMatch(Card[] hand, int desiredValue, String desiredSuit) {
        for (Card card : hand) {
            if (card.getValue() == desiredValue && card.getSuit().equalsIgnoreCase(desiredSuit)) {
                return true;
            }
        }
        
        return false;
    }
}
