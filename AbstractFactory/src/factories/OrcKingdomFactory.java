package factories;

import interfaces.Army;
import interfaces.Castle;
import interfaces.King;
import orcs.OrcArmy;
import orcs.OrcCastle;
import orcs.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {

	  @Override
	  public Castle createCastle() {
	    return new OrcCastle();
	  }

	  @Override
	  public King createKing() {
	    return new OrcKing();
	  }
	  
	  @Override
	  public Army createArmy() {
	    return new OrcArmy();
	  }
	}