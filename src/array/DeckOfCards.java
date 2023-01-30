package array;public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"}; // The program creates an array suits for four suits (line 4)
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // and an array ranks for 13 cards in a suit (lines 5).
// Each element in these arrays is a string.

        // Initialize cards // The program initializes deck with values 0–51 in lines 9 and 10.
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // Lines 13–19 randomly shuffle the deck. After a deck is shuffled, deck[i] contains an arbitrary value.
        for (int i = 0; i < deck.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13]; // deck[i] / 13 is 0, 1, 2, or 3, which determines the suit (line 23).
            String rank = ranks[deck[i] % 13]; // deck[i] % 13 is a value between 0 and 12, which determines the rank (line 24).
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}

// The problem is to create a program that will randomly select four cards from a deck of cards.