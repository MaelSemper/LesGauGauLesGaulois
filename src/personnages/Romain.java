package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		assert !(force < 0) : "omggggggg";
		this.nom = nom;
		this.force = force;

	}

	public void sEquiper(Equipement stuff) {
		switch (nbEquipement) {
		case 0:
			equipe(stuff, 0);
			break;
		case 1:
			if (equipement[0] == stuff) {
				System.out.println("le soldat " + nom + " possede deja un " + stuff);

			} else {
				equipe(stuff, 1);
			}
			break;
		default:
			System.out.println("le soldat " + nom + " est deja bien protege !");
			break;
		}
	}

	private void equipe(Equipement stuff, int i) {
		equipement[i] = stuff;
		nbEquipement++;
		System.out.println("le soldat " + nom + " s equipe avec un " + stuff);
	}

	public String getNom() {
		return nom;
	}

	public void parler(String text) {
		System.out.println(prendreParole() + "<" + text + ">");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force > 0 : "il est ko";
		int tmp = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		}

		else {
			parler("j abandonne... ");

		}

		assert tmp > force : "omg il a pas perdu d hp !!";

	}

	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 6);
		romain.prendreParole();
		romain.parler("LES GAU... LES GAU GAU.. LES GAULOIS !!");
		romain.recevoirCoup(25);
		System.out.println(Equipement.BOUCLIER);
		System.out.println(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.BOUCLIER);

	}

}
