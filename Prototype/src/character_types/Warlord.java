package character_types;

public abstract class Warlord implements Prototype{
	public Warlord() {

	}

	public Warlord(Warlord warlord) {
	}

	@Override
	public abstract Warlord copy();
}
