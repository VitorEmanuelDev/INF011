package chain.request;

public abstract class RequestHandler {

	  private final RequestHandler next;

	  public RequestHandler(RequestHandler next) {
		super();
		this.next = next;
	}

	public void handleRequest(Request req) {
	    if (next != null) {
	      next.handleRequest(req);
	    }
	  }

	  protected void printHandling(Request req) {
	   System.out.printf("%s handling request \"%s\"", this, req);
	  }

	  @Override
	  public abstract String toString();
	}