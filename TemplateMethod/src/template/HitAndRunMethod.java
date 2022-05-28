package template;

public class HitAndRunMethod extends StealingMethod {

	  @Override
	  protected String pickTarget() {
	    return "old goblin woman";
	  }

	  @Override
	  protected void confuseTarget(String target) {
	    System.out.printf("Approach the %s from behind.", target);
	  }

	  @Override
	  protected void stealTheItem(String target) {
		  System.out.println("Grab the handbag and run away fast!");
	  }
	}
