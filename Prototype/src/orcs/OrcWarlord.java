package orcs;

import character_types.Warlord;

public class OrcWarlord extends Warlord {

	  private final String helpType;

	  public OrcWarlord(String helpType) {
	    this.helpType = helpType;
	  }

	  public OrcWarlord(OrcWarlord orcWarlord) {
	    super(orcWarlord);
	    this.helpType = orcWarlord.helpType;
	  }

	  @Override
	  public OrcWarlord copy() {
	    return new OrcWarlord(this);
	  }

	  @Override
	  public String toString() {
	    return "Orc warlord helps in " + helpType;
	  }
}
