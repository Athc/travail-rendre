package githubprj;

import java.util.Objects;

public class Marque implements Comparable<Marque> {
	protected String nom;
	
	 public Marque(String nom) {
	        this.nom = nom;
	    }

	@Override
	public String toString() {
		return "Marque [nom=" + nom + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marque other = (Marque) obj;
		return Objects.equals(nom, other.nom);
	}
	
	 @Override
	    public int compareTo(Marque autreMarque) {
	        return this.nom.compareTo(autreMarque.nom);
	    }

}
