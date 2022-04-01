package hero;

import weapon.Weapon;

public class Warrior extends Hero{

	public Warrior(Weapon weapon) {
		super(weapon);
	}

	@Override
	public void pickUpWeapon() {
		
		System.out.println("Draw the " + getWeaponType());
		
	}

}
