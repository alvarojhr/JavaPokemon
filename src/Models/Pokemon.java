package Models;

public class Pokemon extends Base{
    private int health;
    private int attackPoints;
    private int defensePoints;


    public Pokemon(String nombre, int health, int attackPoints, int defensePoints) {
        super(nombre);
        this.health = health;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }
}
