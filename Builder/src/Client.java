import characteristics.Armor;
import characteristics.HairColor;
import characteristics.HairType;
import characteristics.Profession;
import characteristics.Weapon;
import hero.Builder;
import hero.Hero;

public class Client {
	public static void main(String[] args) {


		Hero mage =  new Builder(Profession.MAGE, "Riobard")
				.withHairColor(HairColor.BLACK)
				.withWeapon(Weapon.DAGGER)
				.build();
		System.out.println(mage.toString());

		Hero warrior = new Builder(Profession.WARRIOR, "Amberjill")
				.withHairColor(HairColor.BLOND)
				.withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL).withWeapon(Weapon.SWORD)
				.build();
		System.out.println(warrior.toString());

		Hero thief = new Builder(Profession.THIEF, "Desmond")
				.withHairType(HairType.BALD)
				.withWeapon(Weapon.BOW)
				.build();
		System.out.println(thief.toString());
	}
}
