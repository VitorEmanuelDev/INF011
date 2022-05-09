import java.util.Scanner;

import blacksmith.BlackSmith;
import blacksmith.ElfBlackSmith;
import blacksmith.OrcBlackSmith;
import weapon.Weapon;
import weapon.WeaponTypeEnum;

public class Client {
    private static BlackSmith blacksmith;
    private static Weapon weapon1, weapon2, weapon3;

    public static void main(String[] args) {
    	
    	  
        System.out.println("Elf or Orc?");
    	
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

    	
    	if(name.equalsIgnoreCase("orc")){
    		blacksmith = new OrcBlackSmith();
            weapon1 = blacksmith.manufactureWeapon(WeaponTypeEnum.SPEAR);
            weapon2 = blacksmith.manufactureWeapon(WeaponTypeEnum.AXE);
            weapon3 = blacksmith.manufactureWeapon(WeaponTypeEnum.SHORT_SWORD);
            System.out.println(weapon1 +" "+ weapon2+" "+weapon3);
    	}else if(name.equalsIgnoreCase("elf")){
    		blacksmith = new ElfBlackSmith();
            weapon1 = blacksmith.manufactureWeapon(WeaponTypeEnum.SPEAR);
            weapon2 = blacksmith.manufactureWeapon(WeaponTypeEnum.AXE);
            weapon3 = blacksmith.manufactureWeapon(WeaponTypeEnum.SHORT_SWORD);
            System.out.println(weapon1 +" "+ weapon2+" "+weapon3);
    	}else {
    		System.out.println("Invalid option");
    	}

    }
}