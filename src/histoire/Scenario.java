package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Druide druide = new Druide("Panoramix", 5, 10);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 20);
		Romain romain = new Romain("Minus", 6);
		
		druide.parler("je vais aller preparer une petite potion.. ");
		druide.preparerPotion();
		druide.booster(obelix);
		
		obelix.parler("Par belenos, ce n est pas juste !");
		
		druide.booster(asterix);
		
		asterix.parler("Bonjour");
		
		romain.parler("UN GAU GAU... UN GAULOIS !!");
		
		asterix.frapper(romain);
		asterix.frapper(romain);
		asterix.frapper(romain);

	}

}
