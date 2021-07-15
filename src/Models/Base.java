package Models;

public class Base {
    protected int id;
    protected String name;

    public Base(String nombre) {
        this.name = nombre;
    }

    public Base(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Base(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
