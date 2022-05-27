package chain.orc;

import chain.request.Request;
import chain.request.RequestHandler;
import chain.request.RequestType;

public class OrcCommander extends RequestHandler {

	  public OrcCommander(RequestHandler handler) {
	    super(handler);
	  }

	  @Override
	  public void handleRequest(Request req) {
	    if (RequestType.DEFEND_CASTLE == req.getRequestType()) {
	      printHandling(req);
	      req.markHandled();
	    } else {
	      super.handleRequest(req);
	    }
	  }

	  @Override
	  public String toString() {
	    return "Orc commander";
	  }
	}