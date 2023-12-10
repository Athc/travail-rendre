package githubprj;

import java.util.Objects;

public class Voiture extends Marque {
   
    private String modele;

    public Voiture(String nomMarque, String modele) {
        super(nomMarque);
        this.modele = modele;
    }

    @Override
    public String toString() {
        return "Voiture [modele=" + modele + ", nom=" + nom + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Voiture other = (Voiture) obj;
        return Objects.equals(modele, other.modele);
    }

    @Override
    public Voiture clone() {
        return new Voiture(this.nom, this.modele);
    }

    public int compareTo(Voiture autreVoiture) {
        // Compare based on both brand name and model
        int result = this.nom.compareTo(autreVoiture.nom);
        if (result == 0) {
            result = this.modele.compareTo(autreVoiture.modele);
        }
        return result;
    }

    public String getNom() {
        return nom;
    }
}
