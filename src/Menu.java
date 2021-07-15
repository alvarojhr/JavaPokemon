import Models.Battle;
import Models.Pokemon;
import Models.User;

import java.util.Scanner;

public class Menu {
    public static void showMenuStart(){
        Scanner sc = new Scanner(System.in);
        int option;
        do {


            System.out.println("              _                              \n" +
                    "  _ __   ___ | | _____ _ __ ___   ___  _ __  \n" +
                    " | '_ \\ / _ \\| |/ / _ \\ '_ ` _ \\ / _ \\| '_ \\ \n" +
                    " | |_) | (_) |   <  __/ | | | | | (_) | | | |\n" +
                    " | .__/ \\___/|_|\\_\\___|_| |_| |_|\\___/|_| |_|\n" +
                    " |_|                                         \n" +
                    "             Welcome to your battle!          ");
            System.out.println("1. Play.");
            System.out.println("2. Settings");
            System.out.println("0. Exit.");
            System.out.print("Choose an option: ");
            option= sc.nextInt();

            switch (option){
                case 1:
                    //TODO: Generate starting play code
                    break;
                case 2:
                    //TODO: Generate setting game code. First priority. If you don't, you will get a zero grade.
                    showMenuSettings(sc);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (option != 0);
    }

    private static void showMenuSettings(Scanner sc){
        System.out.print("User: ");
        String user = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();

        if (User.isValid(user,pass)){
            //TODO: Settings menu - 1. List pokemons. 2. Add pokemon. 3. Update pokemon. 4. Delete pokemon. 5. Set Battle. 0. Go back.

            showSettingsMenu(sc);
        }else {
            System.out.println("\nAre you trying to hack us?");
        }
    }

    private static void showSettingsMenu(Scanner sc){
        int optionSetting;
        do {

            System.out.println("\nSETTINGS MENU\n");
            System.out.println("1. List Pokemons.");
            System.out.println("2. Add Pokemon.");
            System.out.println("3. Update Pokemon.");
            System.out.println("4. Delete Pokemon.");
            System.out.println("5. Set Battle.");
            System.out.println("0. Go back.");
            System.out.print("\nChoose an option:");
            optionSetting = sc.nextInt();

            switch (optionSetting){
                case 1:
                    System.out.println(Battle.getListPokes());
                    break;
                case 2:
                    //Battle.addPoke(sc);
                    break;
                case 3:
                    //Battle.updatePoke(sc);
                    break;
                case 4:
                    //Battle.deletePoke(sc);
                    break;
                case 5:

                    break;
                default:
                    break;
            }

        }while(optionSetting != 0);
    }
}
