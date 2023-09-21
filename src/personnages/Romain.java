package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String text) {
		System.out.println(prendreParole()+"<"+text+">");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le romain "+nom+" : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if(force>0) {
			parler("Aie");
		}
		
		else {
			parler("j abandonne... ");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus",8);
		romain.prendreParole();
		romain.parler("LES GAU... LES GAU GAU.. LES GAULOIS !!");
		romain.recevoirCoup(25);
		
	}
	
	
}
