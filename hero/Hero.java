package hero;

import weapon.Weapon;

public abstract class Hero{
	
	private Weapon heroWeapon;
	
	public Hero(Weapon weapon) {
		this.heroWeapon = weapon;
	}
	
	public void attack() {
		this.heroWeapon.attack();
	}
	
	public void defense() {
		this.heroWeapon.defense();
	}
	
	public abstract void pickUpWeapon();
	
	public String getWeaponType() {
		return this.heroWeapon.type;
	}

}
