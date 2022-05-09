package weapon;

public class ElfWeapon implements Weapon{
	
    private WeaponTypeEnum weaponType;

    public ElfWeapon(WeaponTypeEnum weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponTypeEnum getWeaponType() {
        return weaponType;
    }
    @Override
    public String toString() {
        return "an elfish " + weaponType;
    }
}
