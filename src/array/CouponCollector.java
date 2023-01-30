package array;

public class CouponCollector {
    public static void main(String[] args) {

        final int NUMBER_OF_CARDS = 52; // Declare a final int variable that says how many cards are in a deck.
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"}; // Create an array of string called suits that tracks of what each card is.
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // Create an array of String called ranks that tell the number of a card.

        boolean[] found = new boolean[4]; // Create an array of boolean called found.

        int numberOfPicks = 0; // How many picks into deck we actually had. Initialize to 0.

        int count = 0;

        while (count < 4) {
            numberOfPicks++;
            int index = (int) (Math.random() * NUMBER_OF_CARDS); // pick random cards between card[0]~card[51].
            if (!found[index / 13]) { // If we haven't found this card
                found[index/13] = true;
                count++;

                String suit = suits[index / 13]; // deck[i] / 13 is 0, 1, 2, or 3, which determines the suit (line 23).
                String rank = ranks[index % 13]; // deck[i] % 13 is a value between 0 and 12, which determines the rank (line 24).
                System.out.println(rank + " of " + suit);
            }
        }

        System.out.println("Number  of picks: " + numberOfPicks);
    }
}

// (Simulation: coupon collector’s problem) Coupon collector is a classic statistics problem with many practical
// applications. The problem is to repeatedly pick objects from a set of objects and find out how many picks are
// needed for all the objects to be picked at least once. A variation of the problem is to pick cards from a
// shuffled deck of 52 cards repeatedly, and find out how many picks are needed before you see one of each suit.
// Assume a picked card is placed back in the deck before picking another. Write a program to simulate the
// number of picks needed to get four cards from each suit and display the four cards picked (it is possible a
// card may be picked twice).

// https://mediaplayer.pearsoncmg.com/assets/secs-liang-Coupon_Collectors_Problem