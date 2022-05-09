package blacksmith;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

import weapon.OrcWeapon;
import weapon.Weapon;
import weapon.WeaponTypeEnum;

public class OrcBlackSmith implements BlackSmith{
    private static final Map<WeaponTypeEnum, OrcWeapon> ORCARSENAL;

    static {
        ORCARSENAL = new EnumMap<>(WeaponTypeEnum.class);
        Arrays.stream(WeaponTypeEnum.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponTypeEnum weaponType) {
        return (Weapon) ORCARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "The orc blacksmith";
    }
}
