package elves;

import character_types.Mage;

public class ElfMage extends Mage {

	  private final String helpType;

	  public ElfMage(String helpType) {
	    this.helpType = helpType;
	  }

	public ElfMage(ElfMage elfMage) {
		this.helpType = elfMage.helpType;
	}

	@Override
	  public ElfMage copy() {
	    return new ElfMage(this);
	  }

	  @Override
	  public String toString() {
	    return "Elven mage helps in " + helpType;
	  }

}
