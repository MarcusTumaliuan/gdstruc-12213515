public class SavedPlayer {
    private Player player;
    private boolean isDeleted;

    public SavedPlayer(Player player) {
        this.player = player;
        this.isDeleted = false;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void markAsDeleted() {
        this.isDeleted = true;
    }
}
