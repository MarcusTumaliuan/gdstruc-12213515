import java.util.LinkedList;
import java.util.Queue;

public class PlayerQueue {
    private Queue<Player> queue;

    public PlayerQueue() {
        queue = new LinkedList<>();
    }

    public void enqueue(Player player) {
        queue.add(player);
    }

    public Player[] dequeue(int count) {
        Player[] players = new Player[count];
        for (int i = 0; i < count; i++) {
            players[i] = queue.poll();
        }
        return players;
    }

    public int size() {
        return queue.size();
    }
}