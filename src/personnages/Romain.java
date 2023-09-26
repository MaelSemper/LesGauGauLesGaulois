package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert !(force < 0):"omggggggg";
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
		assert force > 0:"il est ko";
		int tmp = force;
		force -= forceCoup;
		if(force>0) {
			parler("Aie");
		}
		
		else {
			parler("j abandonne... ");
			
		}
		
		assert tmp < force:"omg il a pas perdu d hp !!";
		
		
	}
	
	public static void main(String[] args) {
		Romain romain = new Romain("Minus",6);
		romain.prendreParole();
		romain.parler("LES GAU... LES GAU GAU.. LES GAULOIS !!");
		romain.recevoirCoup(25);
		
	}
	
	
}
