package org.main;

import org.tableau.Tableau;

import javax.sound.sampled.Line;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Tableau tableau;
    public static void main(String[] args) {
        tableau = new Tableau();
        System.out.println(tableau);
    }
}