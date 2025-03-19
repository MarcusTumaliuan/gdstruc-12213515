public class SimpleHashtable {
    private SavedPlayer[] table;
    private int size;

    public SimpleHashtable(int capacity) {
        table = new SavedPlayer[capacity];
        size = 0;
    }

    private int hash(int key) {
        return key % table.length;
    }

    public void put(Player player) {
        int index = hash(player.getId());
        while (table[index] != null && !table[index].isDeleted()) {
            index = (index + 1) % table.length; // Linear probing
        }
        table[index] = new SavedPlayer(player);
        size++;
    }

    public Player get(int id) {
        int index = hash(id);
        while (table[index] != null) {
            if (!table[index].isDeleted() && table[index].getPlayer().getId() == id) {
                return table[index].getPlayer();
            }
            index = (index + 1) % table.length; // Linear probing
        }
        return null; // Not found
    }

    public void remove(int id) {
        int index = hash(id);
        while (table[index] != null) {
            if (!table[index].isDeleted() && table[index].getPlayer().getId() == id) {
                table[index].markAsDeleted();
                size--;
                return;
            }
            index = (index + 1) % table.length; // Linear probing
        }
    }

    public int getSize() {
        return size;
    }
}