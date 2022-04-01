package hero;

import weapon.Weapon;

public class Mage extends Hero{

	public Mage(Weapon weapon) {
		super(weapon);
	}

	@Override
	public void pickUpWeapon() {
		
		System.out.println("Hold the " + getWeaponType());
		
	}

}
