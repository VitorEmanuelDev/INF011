package chain.orc;

import chain.request.Request;
import chain.request.RequestHandler;
import chain.request.RequestType;

public class OrcSoldier extends RequestHandler {

	  public OrcSoldier(RequestHandler handler) {
	    super(handler);
	  }

	  @Override
	  public void handleRequest(Request req) {
	    if (RequestType.COLLECT_TAX == req.getRequestType()) {
	      printHandling(req);
	      req.markHandled();
	    } else {
	      super.handleRequest(req);
	    }
	  }

	  @Override
	  public String toString() {
	    return "Orc soldier";
	  }
	}