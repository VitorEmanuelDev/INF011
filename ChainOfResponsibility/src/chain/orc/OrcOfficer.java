package chain.orc;

import chain.request.Request;
import chain.request.RequestHandler;
import chain.request.RequestType;

public class OrcOfficer extends RequestHandler {

	  public OrcOfficer(RequestHandler handler) {
	    super(handler);
	  }

	  @Override
	  public void handleRequest(Request req) {
	    if (RequestType.WATCH_PRISONER == req.getRequestType()) {
	      printHandling(req);
	      req.markHandled();
	    } else {
	      super.handleRequest(req);
	    }
	  }

	  @Override
	  public String toString() {
	    return "Orc officer";
	  }

	}