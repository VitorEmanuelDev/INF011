package hero;


import characteristics.Armor;
import characteristics.HairColor;
import characteristics.HairType;
import characteristics.Profession;
import characteristics.Weapon;
import hero.Hero;

public class Builder {

    private final Profession profession;
    private final String name;
    private HairType hairType;
    private HairColor hairColor;
    private Armor armor;
    private Weapon weapon;


    public Builder(Profession profession, String name) {
      if (profession == null || name == null) {
        throw new IllegalArgumentException("profession and name can not be null");
      }
      this.profession = profession;
      this.name = name;
    }

    public Builder withHairType(HairType hairType) {
      this.setHairType(hairType);
      return this;
    }

    public Builder withHairColor(HairColor hairColor) {
      this.setHairColor(hairColor);
      return this;
    }

    public Builder withArmor(Armor armor) {
      this.setArmor(armor);
      return this;
    }

    public Builder withWeapon(Weapon weapon) {
      this.setWeapon(weapon);
      return this;
    }

    public Hero build() {
      return new Hero(this);
    }

	public Profession getProfession() {
		return profession;
	}

	public String getName() {
		return name;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public void setHairColor(HairColor hairColor) {
		this.hairColor = hairColor;
	}

	public HairType getHairType() {
		return hairType;
	}

	public void setHairType(HairType hairType) {
		this.hairType = hairType;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}
  }