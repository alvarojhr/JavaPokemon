package Models;

public class Base {
    protected int id;
    protected String name;

    public Base(String nombre) {
        this.name = nombre;
    }

    public Base(){}

    private int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
