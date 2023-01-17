package org.main;

import org.humain.Humain;
import org.jeu.Jeu;
import org.ordinateur.Ordinateur;
import org.tableau.Tableau;

import java.util.Scanner;

public class Puissance4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Entrez votre nom: ");
        String nom = scanner.nextLine();

        Partie IA = new Partie(new Humain(nom, Jeu.ROUGE), new Ordinateur(Jeu.BLEU));
        IA.joue();

        Partie DUO = new Partie(new Humain(nom, Jeu.ROUGE), new Humain(nom, Jeu.BLEU));
        DUO.joue();
    }
    static Tableau tableau;
    public static void main(String[] args) {
        System.out.println("Bienvenue sur notre Puissance 4");
        Menu.menu();

        tableau = new Tableau();
        System.out.println(tableau);


    }
}