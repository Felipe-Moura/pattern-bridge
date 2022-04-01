import hero.Hero;
import hero.Mage;
import hero.Warrior;
import weapon.MageStaff;
import weapon.Saber;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * implement the bridge patter using weapon and hero as abstract classes
		 * */
		
		Hero joana = new Warrior(new Saber());
		Hero carlos = new Mage(new MageStaff());
		
		
		System.out.println("Joana enters the fight");
		joana.pickUpWeapon();
		joana.attack();
		joana.defense();
		
		System.out.println("\nCarlos enters the fight");
		carlos.pickUpWeapon();
		carlos.attack();
		carlos.defense();
		
		
	}

}
