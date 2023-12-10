package githubprj;

import java.util.Arrays;

public class TestVoiture {
    public static void main(String[] args) {
        // Créer des instances de Marque
        Marque toyota = new Marque("Bmw");
        Marque honda = new Marque("Toyota");
        Marque ford = new Marque("Ford");

        // Créer un tableau de Marque
        Marque[] marquesArray = { toyota, honda, ford };

        // Créer une instance de Garage avec le tableau
        Garage garage = new Garage(marquesArray);

        // Afficher les marques dans le garage
        garage.afficherMarques();

        // Trier les marques dans le garage
        garage.trier();
        System.out.println("\nMarques triées:");
        garage.afficherMarques();

        // Ajouter une nouvelle marque
        Marque nouvelleMarque = new Marque("mercedes-benz");
        garage.ajouterMarque(nouvelleMarque);
        System.out.println("\nAprès l'ajout de la nouvelle marque:");
        garage.afficherMarques();

        // Supprimer une marque
        garage.supprimerMarque(1);
        System.out.println("\nAprès la suppression d'une marque:");
        garage.afficherMarques();

        // Inverser l'ordre des marques
        garage.inverserOrdre();
        System.out.println("\nAprès l'inversion de l'ordre:");
        garage.afficherMarques();

        // Afficher le nombre d'éléments dans le garage
        System.out.println("\nNombre d'éléments dans le garage: " + garage.nombreElements());

        // Afficher l'élément le plus grand
        System.out.println("\nÉlément le plus grand dans le garage: " + garage.elementLePlusGrand());

        // Tester l'égalité de deux garages
        Garage autreGarage = new Garage(Arrays.copyOf(marquesArray, marquesArray.length));
        System.out.println("\nLes deux garages sont-ils égaux ? " + garage.estEgal(autreGarage));

        // Utiliser la classe MaListe
        MaListe maListe = new MaListe();
        maListe.alimenterListe(new Marque("Toyota"));
        maListe.alimenterListe(new Marque("Honda"));
        maListe.alimenterListe(new Marque("Ford"));

        // Afficher la liste
        System.out.println("\nListe initiale :");
        maListe.afficherListe();

        // Insérer un nouvel élément
        maListe.insererElement(1, new Marque("mercedes-benz"));

        // Afficher la liste après insertion
        System.out.println("\nListe après insertion :");
        maListe.afficherListe();

        // Tester si la liste contient un élément
        System.out.println("\nLa liste contient 'Nouvelle Marque'? " + maListe.rechercherElement(new Marque("Nouvelle Marque")));

        // Trier la liste
        maListe.trierListe();

        // Afficher la liste triée
        System.out.println("\nListe triée :");
        maListe.afficherListe();
    }
}
