package character_types;
public abstract class Beast implements Prototype {

	public Beast() {

	}

	public Beast(Beast source) {
	}

	@Override
	public abstract Beast copy();
}