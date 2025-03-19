import java.util.Objects;

public class Player {
    private int id;
    private String username;
    private int level;

    public Player(int id, String Username, int level) {
        this.id = id;
        this.username = username;
        this.level = level;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id= " + id +
                ", name='" + username + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(username, player.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, level);
    }
}