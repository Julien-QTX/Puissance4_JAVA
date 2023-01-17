package org.main;

import org.tableau.Tableau;
import org.menu.Menu;

public class Main {
    static Tableau tableau;
    public static void main(String[] args) {
        System.out.println("Bienvenue sur notre Puissance 4");
        Menu.menu();

        tableau = new Tableau();
        System.out.println(tableau);


    }
}