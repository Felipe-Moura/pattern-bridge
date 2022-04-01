package weapon;

public class MageStaff extends Weapon{
	
	public MageStaff() {
		durabilite = 50;
		type = "Staff";
		damage = 10;
	}

	@Override
	public void attack() {
		
		System.out.println("Fireball launched dealing " + damage + " damage.");
		durabilite--;
		
	}

	@Override
	public void defense() {
		
		System.out.println("Magic barrier raised.");
		durabilite--;
		
	}

}
