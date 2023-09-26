package personnages;

public enum Equipement {
	CASQUE("casque"), BOUCLIER("bouclier");

	private String nom;

	private Equipement(String n) {
		nom = n;
	}

	@Override
	public String toString() {
		return nom;
	}
}
