package character_types;

public abstract class Mage implements Prototype {
	public Mage() {

	}

	public Mage(Mage mage) {
	}

	@Override
	public abstract Mage copy();
}
