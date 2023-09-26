package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion;
	private Village village;
	public Chef(String nom, int force, int effetPotion, Village village) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.village = village;
	}
	public String getNom() {
		return nom;
	}
	
	private void parler(String text) {

		System.out.println(prendreParole()+"<"+text+">");
	}
	private String prendreParole() {

		return "Le chef "+nom+" du village "+ village.getNom() + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoir de "+romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	
}
