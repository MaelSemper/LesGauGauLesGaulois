package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum]; 
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
		
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef+" il y a : ");
		for(int i = 0; i < nbVillageois;i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	public boolean ajouterHabitant(Gaulois gaulois) {
		if(nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois += 1;
			return true;
		}
		return false;
	}
	
	public Gaulois trouverHabitant(int n) {
		return villageois[n];
	}
	
	public String getNom() {
		return nom;}
	
	public static void main(String[] args) {
		Village v1 = new Village("Village des irreductibles",30);
		
		Chef chef = new Chef("Abraracoursix", 6, 0, v1);
		v1.setChef(chef);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix",25);
		v1.ajouterHabitant(asterix);
		v1.ajouterHabitant(obelix);
		
		Gaulois gaulois = v1.trouverHabitant(1);
		
		v1.afficherVillageois();
		
	}
	
}
