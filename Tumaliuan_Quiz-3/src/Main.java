import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int MAX_GAMES = 10;
    private static int gamesCreated = 0;
    private static PlayerQueue playerQueue = new PlayerQueue();
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (gamesCreated < MAX_GAMES) {
            System.out.println("Press Enter to enqueue players...");
            scanner.nextLine();

            int playersToAdd = random.nextInt(7) + 1; // Random number between 1 and 7
            for (int i = 0; i < playersToAdd; i++) {
                String playerName = "Player" + (playerQueue.size() + 1);
                playerQueue.enqueue(new Player(playerName));
                System.out.println(playerName + " has been added to the queue.");
            }

            if (playerQueue.size() >= 5) {
                System.out.println("Starting a game with the first 5 players in the queue...");
                Player[] playersInGame = playerQueue.dequeue(5);
                System.out.println("Game started with players:");
                for (Player player : playersInGame) {
                    System.out.println(player.getName());
                }
                gamesCreated++;
                System.out.println("Total games created: " + gamesCreated);
            } else {
                System.out.println("Not enough players to start a game. Current queue size: " + playerQueue.size());
            }
        }

        System.out.println("Maximum games created. Exiting...");
        scanner.close();
    }
}
