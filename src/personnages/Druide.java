package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d une force " + effetPotionMin + " a "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public int getForcePotion() {
		return forcePotion;
	}

	public void booster(Gaulois gaulois) {
		if (gaulois.getNom().equals("Obelix")) {
			parler("Non, Obelix ! Tu n auras pas de potion magique !");
		}

		else {
			gaulois.boirePotion(forcePotion);
		}

	}

	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt((effetPotionMax - effetPotionMin + 1) + effetPotionMin);
		if (forcePotion > 7) {
			System.out.println("j ai prepare une super potion de force " + forcePotion);
		} else {
			System.out.println(
					"je n ai pas trouve tous les ingredients, ma potion est seulement de force " + forcePotion);
		}
	}

	public void parler(String text) {
		// TODO Auto-generated method stub
		System.out.println(prendreParole() + "<" + text + ">");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le druide " + nom + " : ";
	}

	public static void main(String[] args) {
		Druide druide = new Druide("oh", 5, 10);
		druide.preparerPotion();

	}

}
