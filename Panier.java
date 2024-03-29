import java.util.ArrayList;

public class Panier {

	private ArrayList<Orange> liste;
	private final int max;
	
	public Panier(int m) {
		liste = new ArrayList<Orange>();
		max = m;
	}
	
	public ArrayList getListe() {
		return liste;
	}
	
	public void setListe(ArrayList al) {
		liste = al;
	}
	
	public int getMax() {
		return max;
	}

	public int getNbElements() {
		return liste.size();
	}
	
	public boolean estPlein() {
		if(getNbElements()==max) return true;
		return false;
	}
	
	public boolean estVide() {
		if(getNbElements()==0) return true;
		return false;
	}
	
	public boolean ajoute(Orange o) {
		if(!estPlein()) {
			liste.add(o);
			return true;
		}
		else System.out.println("Panier déjà plein.");
		return false;
	}
	
	public boolean retire() {
		if(!estVide()) {
			liste.remove(liste.size()-1);
			return true;
		}
		else System.out.println("Panier vide.");
		return false;
	}
	
	public double getPrix() {
		double p = 0;
		for(Orange o : liste) {
			p += o.getPrix();
		}
		return p;
	}
	
	public static void main(String[] args) throws PrixNegatifException {
		Panier p = new Panier(2);
		System.out.println("Panier plein ? "+p.estPlein());
		System.out.println("Panier vide ? "+p.estVide());
		
		p.retire();
		
		Orange o1 = new Orange(0.6,"Ouais");
		p.ajoute(o1);
		
		System.out.println("Panier plein ? "+p.estPlein());
		System.out.println("Panier vide ? "+p.estVide());
		
		Orange o2 = new Orange(0.8,"Okkk");
		p.ajoute(o2);
		
		System.out.println("Panier plein ? "+p.estPlein());
		System.out.println("Panier vide ? "+p.estVide());
		
		System.out.println(p.getPrix());
		
		p.retire();
		
		System.out.println("Panier plein ? "+p.estPlein());
		System.out.println("Panier vide ? "+p.estVide());
		
	}
	
}
