package blacksmith;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

import weapon.ElfWeapon;
import weapon.Weapon;
import weapon.WeaponTypeEnum;

public class ElfBlackSmith implements BlackSmith{
	
    private static final Map<WeaponTypeEnum, ElfWeapon> ELFARSENAL;

    static {
        ELFARSENAL = new EnumMap<>(WeaponTypeEnum.class);
        Arrays.stream(WeaponTypeEnum.values()).forEach(type -> ELFARSENAL.put(type, new ElfWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponTypeEnum weaponType) {
        return (Weapon) ELFARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The elf blacksmith";
    }

}
