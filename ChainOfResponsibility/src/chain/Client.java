package chain;

import chain.orc.OrcKing;
import chain.request.Request;
import chain.request.RequestType;

public class Client {


  public static void main(String[] args) {

    var king = new OrcKing();
    king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
    king.makeRequest(new Request(RequestType.WATCH_PRISONER, "watch prisoner"));
    king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
  }
}

