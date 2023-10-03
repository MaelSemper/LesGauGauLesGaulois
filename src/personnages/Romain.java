package personnages;

public class Romain {
	private String texte;
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		if (force <0) {
		    throw new IllegalArgumentException("Force negative" + force);
		  }
		this.nom = nom;
		this.force = force;

	}

	public void sEquiper(Equipement stuff) {
		final String SOLDAT = "Le soldat"; 
		switch (nbEquipement) {
		case 0:
			equipe(stuff, 0);
			break;
		case 1:
			if (equipements[0] == stuff) {
				System.out.println(SOLDAT + nom + " possede deja un " + stuff);

			} else {
				equipe(stuff, 1);
			}
			break;
		default:
			System.out.println(SOLDAT + nom + " est deja bien protege !");
			break;
		}
	}

	private void equipe(Equipement stuff, int i) {
		equipements[i] = stuff;
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

//	public void recevoirCoup(int forceCoup) {
//		assert force > 0 : "il est ko";
//		int tmp = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie");
//		}
//
//		else {
//			parler("j abandonne... ");
//
//		}
//
//		assert tmp > force : "omg il a pas perdu d hp !!";
//
//	}

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if(force > 0) {
			parler("Aïe");}
		else {
			force = 0;
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force ducoup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement saforce est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}      
				
			}
			texte +=resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if(forceCoup < 0) {
			forceCoup = 0;
		}
		return forceCoup;
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + "s'envole sous la force du coup.");
		// TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null){
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
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

	public int getForce() {
		// TODO Auto-generated method stub
		return force;
	}

}
