package blacksmith;
import weapon.Weapon;
import weapon.WeaponTypeEnum;

public interface BlackSmith {
  Weapon manufactureWeapon(WeaponTypeEnum weaponType);
}
