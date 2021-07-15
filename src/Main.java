import Models.Base;
import Models.Player;
import Models.Pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokemon pika = new Pokemon("Pikachu", 100, 30, 10);
        System.out.println(pika);
        Menu.showMenuStart();
    }
}
