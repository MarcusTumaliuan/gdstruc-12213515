public class Main {
    public static void main(String[] args) {
        SimpleHashtable hashtable = new SimpleHashtable(10);

        Player player1 = new Player(1, "PlayerOne", 10);
        Player player2 = new Player(2, "PlayerTwo", 20);
        Player player3 = new Player(3, "PlayerThree", 30);

        hashtable.put(player1);
        hashtable.put(player2);
        hashtable.put(player3);

        System.out.println("Get Player with ID 2: " + hashtable.get(2));
        System.out.println("Removing Player with ID 2");
        hashtable.remove(2);
        System.out.println("Get Player with ID 2: " + hashtable.get(2));
        System.out.println("Current size of hashtable: " + hashtable.getSize());
    }
}