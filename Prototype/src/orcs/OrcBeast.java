package orcs;

import character_types.Beast;

public class OrcBeast extends Beast {

	private final String helpType;

	public OrcBeast(OrcBeast orcBeast) {
		super(orcBeast);
		this.helpType = orcBeast.helpType;
	}

	public OrcBeast(String helpType) {
		this.helpType = helpType;
	}

	@Override
	public OrcBeast copy() {
		return new OrcBeast(this);
	}

	@Override
	public String toString() {
		return "Orc eagle helps in " + helpType;
	}
	
}
