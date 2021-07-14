package Models;

import java.util.ArrayList;

public class Player extends Base{
    private int age;
    private int score;
    private double money;
    private Pokemon pokemonSelected;
    private ArrayList<Pokemon> pokedex;

    public Player(String nombre){
        super(nombre);
        this.id = id;
        this.name = nombre;
    }

    public Player(String nombre, int age, int score, double money) {
        super(nombre);
        this.age = age;
        this.score = score;
        this.money = money;
    }
}