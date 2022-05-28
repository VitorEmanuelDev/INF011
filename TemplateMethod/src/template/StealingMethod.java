package template;

public abstract class StealingMethod {

	  protected abstract String pickTarget();

	  protected abstract void confuseTarget(String target);

	  protected abstract void stealTheItem(String target);

	  /**
	   * Steal.
	   */
	  public void steal() {
	    var target = pickTarget();
	    System.out.printf("The target has been chosen as %s.", target);
	    confuseTarget(target);
	    stealTheItem(target);
	  }
	}
