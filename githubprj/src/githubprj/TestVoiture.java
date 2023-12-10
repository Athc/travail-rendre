package githubprj;

import java.util.Arrays;

public class TestVoiture {
    public static void main(String[] args) {
        
        Marque toyota = new Marque("Bmw");
        Marque honda = new Marque("Toyota");
        Marque ford = new Marque("Ford");

        
        Marque[] marquesArray = { toyota, honda, ford };

        Garage garage = new Garage(marquesArray);

        
        garage.afficherMarques();

       
        garage.trier();
        System.out.println("\nMarques triées:");
        garage.afficherMarques();

        
        Marque nouvelleMarque = new Marque("mercedes-benz");
        garage.ajouterMarque(nouvelleMarque);
        System.out.println("\nAprès l'ajout de la nouvelle marque:");
        garage.afficherMarques();

        
        garage.supprimerMarque(1);
        System.out.println("\nAprès la suppression d'une marque:");
        garage.afficherMarques();

        
        garage.inverserOrdre();
        System.out.println("\nAprès l'inversion de l'ordre:");
        garage.afficherMarques();

        
        System.out.println("\nNombre d'éléments dans le garage: " + garage.nombreElements());

        
        System.out.println("\nÉlément le plus grand dans le garage: " + garage.elementLePlusGrand());

        
        Garage autreGarage = new Garage(Arrays.copyOf(marquesArray, marquesArray.length));
        System.out.println("\nLes deux garages sont-ils égaux ? " + garage.estEgal(autreGarage));

        
        MaListe maListe = new MaListe();
        maListe.alimenterListe(new Marque("Toyota"));
        maListe.alimenterListe(new Marque("Honda"));
        maListe.alimenterListe(new Marque("Ford"));

        
        System.out.println("\nListe initiale :");
        maListe.afficherListe();

        
        maListe.insererElement(1, new Marque("mercedes-benz"));

        
        System.out.println("\nListe après insertion :");
        maListe.afficherListe();

        
        System.out.println("\nLa liste contient 'Nouvelle Marque'? " + maListe.rechercherElement(new Marque("Nouvelle Marque")));

        
        maListe.trierListe();

        // Afficher la liste triée
        System.out.println("\nListe triée :");
        maListe.afficherListe();
    }
}
