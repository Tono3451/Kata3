package software.ulpgc.es.model;

public class Player {
    private final String name;
    private final String nacionality;
    private final String position;
    private final String squad;

    public Player(String name, String nacionality, String position, String squad) {
        this.name = name;
        this.nacionality = nacionality;
        this.position = position;
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public String getNacionality() {
        return nacionality;
    }

    public String getPosition() {
        return position;
    }

    public String getSquad() {
        return squad;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", nacionality='" + nacionality + '\'' +
                ", position='" + position + '\'' +
                ", squad='" + squad + '\'' +
                '}';
    }
}
