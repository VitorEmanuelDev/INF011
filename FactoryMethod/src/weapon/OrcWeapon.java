package weapon;

public class OrcWeapon implements Weapon{
    private WeaponTypeEnum weaponType;

    public OrcWeapon(WeaponTypeEnum weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public WeaponTypeEnum getWeaponType() {
        return weaponType;
    }
    @Override
    public String toString() {
        return "an orcish " + weaponType;
    }

}
