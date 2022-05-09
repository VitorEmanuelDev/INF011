package orcs;

import character_types.Mage;

public class OrcMage extends Mage {

	  private final String helpType;

	  public OrcMage(String helpType) {
	    this.helpType = helpType;
	  }

	public OrcMage(OrcMage orcMage) {
		this.helpType = orcMage.helpType;
	}

	@Override
	  public OrcMage copy() {
	    return new OrcMage(this);
	  }

	  @Override
	  public String toString() {
	    return "Orc mage helps in " + helpType;
	  }

}
