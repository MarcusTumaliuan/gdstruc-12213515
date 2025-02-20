import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int DECK_SIZE = 30;
    private static final String[] CARD_NAMES = {
            "Ace", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace", "Two",
            "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen",
            "King", "Ace", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
    };

    public static void main(String[] args) {
        CardStack playerDeck = new CardStack(DECK_SIZE);
        CardStack discardedPile = new CardStack(DECK_SIZE);
        CardStack playerHand = new CardStack(5); // Max 5 cards in hand
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Initialize the player deck with cards
        for (int i = 0; i < DECK_SIZE; i++) {
            playerDeck.push(new Card(CARD_NAMES[i]));
        }

        while (!playerDeck.isEmpty()) {
            int command = random.nextInt(3); // 0: Draw, 1: Discard, 2: Get from Discard
            int x = random.nextInt(5) + 1; // Random value from 1 to 5

            switch (command) {
                case 0: // Draw x cards
                    System.out.println("Command: Draw " + x + " cards");
                    for (int i = 0; i < x && !playerDeck.isEmpty(); i++) {
                        playerHand.push(playerDeck.pop());
                    }
                    break;

                case 1: // Discard x cards
                    System.out.println("Command: Discard " + x + " cards");
                    for (int i = 0; i < x && !playerHand.isEmpty(); i++) {
                        discardedPile.push(playerHand.pop());
                    }
                    break;

                case 2: // Get x cards from the discarded pile
                    System.out.println("Command: Get " + x + " cards from the discarded pile");
                    for (int i = 0; i < x && !discardedPile.isEmpty(); i++) {
                        playerHand.push(discardedPile.pop());
                    }
                    break;
            }

            // Display current status
            System.out.println("Player Hand: " + Arrays.toString(playerHand.getCards()));
            System.out.println("Remaining cards in Player Deck: " + playerDeck.size());
            System.out.println("Cards in Discarded Pile: " + discardedPile.size());

            // Wait for player to proceed
            System.out.println("Press Enter to proceed to the next turn...");
            scanner.nextLine();
        }

        System.out.println("Game Over! The player deck is empty.");
        scanner.close();
    }
}