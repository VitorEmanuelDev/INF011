package elves;

import character_types.Beast;

public class ElfBeast extends Beast {

	private final String helpType;

	public ElfBeast(ElfBeast elfBeast) {
		super(elfBeast);
		this.helpType = elfBeast.helpType;
	}

	public ElfBeast(String helpType) {
		this.helpType = helpType;
	}

	@Override
	public ElfBeast copy() {
		return new ElfBeast(this);
	}

	@Override
	public String toString() {
		return "Elven eagle helps in " + helpType;
	}
	 
}
