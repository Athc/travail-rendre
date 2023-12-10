package githubprj;

import java.util.Arrays;

public class Garage {
    private Marque[] marques;
    private int nombreElements;

    public Garage(Marque[] marques) {
        this.marques = Arrays.copyOf(marques, marques.length);
        this.nombreElements = marques.length;
    }

    public void trier() {
        Arrays.sort(marques);
    }

    public void ajouterMarque(Marque nouvelleMarque) {
        if (nombreElements < marques.length) {
            marques[nombreElements] = nouvelleMarque;
            nombreElements++;
        } else {
            System.out.println("Le tableau est plein. Impossible d'ajouter une nouvelle marque.");
        }
    }

    public void supprimerMarque(int index) {
        if (index >= 0 && index < nombreElements) {
            for (int i = index; i < nombreElements - 1; i++) {
                marques[i] = marques[i + 1];
            }
            nombreElements--;
        } else {
            System.out.println("Index invalide. Impossible de supprimer la marque.");
        }
    }

    public int nombreElements() {
        return nombreElements;
    }

    public void inverserOrdre() {
        for (int i = 0; i < nombreElements / 2; i++) {
            // Swap elements at i and nombreElements - i - 1
            Marque temp = marques[i];
            marques[i] = marques[nombreElements - i - 1];
            marques[nombreElements - i - 1] = temp;
        }
    }

    public void afficherMarques() {
        System.out.println("Marques dans le garage:");
        for (int i = 0; i < nombreElements; i++) {
            System.out.println(marques[i].toString());
        }
    }

    public Marque elementLePlusGrand() {
        if (nombreElements > 0) {
            Marque[] copieMarques = Arrays.copyOf(marques, nombreElements);
            Arrays.sort(copieMarques);
            return copieMarques[nombreElements - 1];
        } else {
            return null;
        }
    }

    public boolean estEgal(Garage autreGarage) {
        if (this.nombreElements != autreGarage.nombreElements) {
            return false;
        }

        for (int i = 0; i < this.nombreElements; i++) {
            if (!this.marques[i].equals(autreGarage.marques[i])) {
                return false;
            }
        }

        return true;
    }
}
