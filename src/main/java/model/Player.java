package model;

public class Player {
    public Player() {
    }

    public Player(int id, int position) {
        this.id = id;
        this.position = position;
    }

    private int id;
    private int position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


}
