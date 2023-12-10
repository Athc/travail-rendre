package githubprj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MaListe {
    private List<Marque> elements;

    // Constructeur
    public MaListe() {
        this.elements = new ArrayList<>();
    }

    // Fonction pour alimenter la liste
    public void alimenterListe(Marque element) {
        elements.add(element);
    }

    // Fonction pour afficher la liste
    public void afficherListe() {
        for (Marque element : elements) {
            System.out.println(element);
        }
    }

    // Fonction pour parcourir la liste à l'aide d'un itérateur
    public void parcourirListe() {
        Iterator<Marque> iterator = elements.iterator();
        while (iterator.hasNext()) {
            Marque element = iterator.next();
            System.out.println(element);
        }
    }

    // Fonction pour insérer un élément dans la liste
    public void insererElement(int index, Marque element) {
        elements.add(index, element);
    }

    // Fonction pour récupérer un élément de la liste
    public Marque recupererElement(int index) {
        return elements.get(index);
    }

    // Fonction pour supprimer un élément de la liste
    public void supprimerElement(Marque element) {
        elements.remove(element);
    }

    // Fonction pour rechercher un élément dans la liste
    public boolean rechercherElement(Marque element) {
        return elements.contains(element);
    }

    // Fonction pour trier la liste
    public void trierListe() {
        Collections.sort(elements);
    }

    // Fonction pour copier la liste dans un nouveau tableau
    public List<Marque> copierListe() {
        return new ArrayList<>(elements);
    }

    // Fonction pour mélanger les éléments de la liste
    public void melangerListe() {
        Collections.shuffle(elements);
    }

    // Fonction pour inverser les éléments de la liste
    public void inverserListe() {
        Collections.reverse(elements);
    }

    // Fonction pour extraire une partie de la liste
    public List<Marque> extrairePartie(int debut, int fin) {
        return elements.subList(debut, fin);
    }

    // Fonction pour comparer deux listes
    public boolean comparerListes(List<Marque> autreListe) {
        return elements.equals(autreListe);
    }

    // Fonction pour échanger deux éléments dans la liste
    public void echangerElements(int index1, int index2) {
        Collections.swap(elements, index1, index2);
    }

    // Fonction pour vider la liste
    public void viderListe() {
        elements.clear();
    }

    // Fonction pour tester si la liste est vide
    public boolean estVide() {
        return elements.isEmpty();
    }

}
