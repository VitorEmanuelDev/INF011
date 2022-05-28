package state;

public class Client {

	  /**
	   * Program entry point.
	   */
	  public static void main(String[] args) {

	    var mammoth = new Mammoth();
	    mammoth.observe();
	    mammoth.timePasses();
	    mammoth.observe();
	    mammoth.timePasses();
	    mammoth.observe();

	  }
	}