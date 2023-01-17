package org.humain;

import org.main.Puissance4;
import org.joueur.Joueur;
import org.jeu.Jeu;
import org.tableau.Tableau;

public class Humain extends Joueur {

    public Humain(String nom,int couleur) {
        super(nom, couleur);
    }

    public void joue(Jeu jeu) {
        tableau.Tableau();

        boolean valide;
        do {
            System.out.println("Joueur " + this.getNom() + ", entrez un numéro de colonne" +
                    "  (entre 1 et " + jeu.getTaille() + ") : ");

            int col = Puissance4.scanner.nextInt(); // on pourrait faire ici la validation de la lecture
            col--;                                  // remet entre 0 et taille-1 (indice à la Java)

            valide = jeu.joueCoup(col, this.getCouleur());
            if (valide == false) {
                System.out.println("-> Coup NON valide.");
            }
        } while (valide == false);
    }
}
