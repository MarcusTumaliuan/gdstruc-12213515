import java.util.Objects;

public class Player {
    public int id;
    private String Name;
    private int level;

    public Player(int id, String name, int level) {
        this.id = id;
        Name = name;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(Name, player.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, level);
    }
}
