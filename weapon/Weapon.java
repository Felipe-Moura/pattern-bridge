package weapon;

public abstract class Weapon {
	
	public int durabilite;
	public String type;
	public int damage;
	
	public abstract void attack();
	public abstract void defense();
	
	public void fixWeapon() {
		this.durabilite++;
	}

}
