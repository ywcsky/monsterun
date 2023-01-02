package model.vo;

public class Weapon {
    private String name;
    private int atk;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public Weapon() {
    }

    public Weapon(String name, int atk) {
        this.name = name;
        this.atk = atk;
    }
}
