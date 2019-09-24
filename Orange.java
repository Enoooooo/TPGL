public class Orange {

	private double prix;
	private String origine;
	
	public Orange(double p, String o) throws PrixNegatifException {
		if(p<0.0) {
			throw new PrixNegatifException();
		}
		else {
			prix = p;
			origine = o;
		}
	}
	
	public double getPrix() {
		return prix;
	}
	
	public String getOrigine() {
		return origine;
	}
	
	public String toString() {
		return "Cette orange de "+origine+" coûte "+prix+"€";
	}
	
	public void affiche() {
		System.out.println(toString());
	}
	
	public static void main(String[] args) throws PrixNegatifException {
		Orange o1 = new Orange(0.6,"France");
		o1.affiche();
		Orange o2 = new Orange(-0.3,"Oui");
		o2.affiche();
	}
}
