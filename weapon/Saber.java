package weapon;

public class Saber extends Weapon{

	
	public Saber() {
		durabilite = 100;
		type = "Sword";
		damage = 5;
	}
	
	
	@Override
	public void attack() {
		
		System.out.println("Slashed dealing " + damage + " damage.");
		durabilite--;
		
	}

	@Override
	public void defense() {
		
		System.out.println("Parried.");
		durabilite--;
		
	}

}
