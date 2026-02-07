// Started the 06/02/2026

import mseAPP.USERS.User;
import mseAPI.printClass.printClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scannerMain = new Scanner(System.in);
        String command, choice;
        do {
            printClass.software();
            command = scannerMain.nextLine();
            switch(command){
                case "user":
                    printClass.printMainSentence("Please, enter your username:");
                    choice = scannerMain.nextLine();
                    try {
                        User U1 = new User(choice);
                        U1.printName();
                    } catch (Exception e){
                        printClass.printMainSentence("...INVALID USERNAME...");
                    }
                    break;
                case "exit":
                    System.out.println("bye");
                    break;
                default:
                    printClass.printMainSentence("...ERROR...");
                    break;

            }
        } while (!"exit".equals((command)));

    }
    // Je dois bien ordonner mon affichage de mon main en implementant ma classe printClass
    // boucle à créer des utilisateurs à fabriquer des utilisateurs
    // Il faut verifier qu'il n'ajoute pas de prenom, et bien coder qui enleve les espaces etc
}

