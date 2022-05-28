package memento;

import java.util.Stack;

public class Client {

	  /**
	   * Program entry point.
	   */
	  public static void main(String[] args) {
	    var states = new Stack<StarMemento>();

	    var star = new Star(StarType.SUN, 10000000, 500000);
	    System.out.println(star.toString());
	    states.add(star.getMemento());
	    star.timePasses();
	    System.out.println(star.toString());
	    states.add(star.getMemento());
	    star.timePasses();
	    System.out.println(star.toString());
	    states.add(star.getMemento());
	    star.timePasses();
	    System.out.println(star.toString());
	    states.add(star.getMemento());
	    star.timePasses();
	    System.out.println(star.toString());
	    while (states.size() > 0) {
	      star.setMemento(states.pop());
	      System.out.println(star.toString());
	    }
	  }
	}
