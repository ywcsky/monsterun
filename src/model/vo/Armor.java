package model.vo;

public class Armor {
    private String name;
    private int def;

    public Armor(String name, int def) {
        this.name = name;
        this.def = def;
    }

    public Armor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
