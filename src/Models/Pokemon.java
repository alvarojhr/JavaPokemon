package Models;

public class Pokemon extends Base{
    private int health;
    private int attackPoints;
    private int defensePoints;
    private static int countPokemons=1;

    public Pokemon(String nombre, int health, int attackPoints, int defensePoints) {
        super(countPokemons,nombre);
        this.health = health;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        countPokemons++;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

//    @Override
//    public String toString() {
//        return String.format("|%3d|%-12s|%6d|%6d|%7d|\n", this.getId(),this.getName(),this.health,this.attackPoints, this.defensePoints);
//    }



}
