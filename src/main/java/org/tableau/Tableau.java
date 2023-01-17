package org.tableau;

import org.cases.Cases;
import java.util.ArrayList;

public class Tableau {
    private ArrayList<ArrayList<Cases>> tableau = new ArrayList<ArrayList<Cases>>();
    private int ligne = 6;
    private int colonne = 7;
    private int tour_du_joueur = 1;

    public Tableau() {
        for (int i = 0; i < ligne; i++) {
            ArrayList<Cases> line = new ArrayList<Cases>();
            for (int j = 0; j < colonne; j++) {
                Cases cases = new Cases();
                line.add(cases);
            }
            this.tableau.add(line);
        }
    }


    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < this.tableau.get(0).size(); i++) {
            returnString.append(" ").append(i).append(" ");
        }
        returnString.append("\n");
        for (int i = 0; i < this.tableau.size(); i++) {
            for (int j = 0; j < this.tableau.get(0).size(); j++) {
                if (this.tableau.get(i).get(j).getPlayer() == 0) {
                    returnString.append("[-]");
                } else if (this.tableau.get(i).get(j).getPlayer() == 1) {
                    returnString.append("[X]");
                } else if (this.tableau.get(i).get(j).getPlayer() == 2) {
                    returnString.append("[O]");
                }
            }
            returnString.append("\n");
        }
        return returnString.toString();
    }

    public int getTurnOfPlayer() {
        return tour_du_joueur;
    }

    public void setTurnOfPlayer(int turnOfPlayer) {
        this.tour_du_joueur = turnOfPlayer;
    }

    public ArrayList<ArrayList<Cases>> getBoard() {
        return tableau;
    }
};