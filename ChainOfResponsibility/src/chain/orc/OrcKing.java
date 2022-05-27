package chain.orc;

import chain.request.Request;
import chain.request.RequestHandler;

public class OrcKing {

	  private RequestHandler chain;

	  public OrcKing() {
	    buildChain();
	  }

	  private void buildChain() {
	    chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
	  }

	  public void makeRequest(Request req) {
	    chain.handleRequest(req);
	  }

	}