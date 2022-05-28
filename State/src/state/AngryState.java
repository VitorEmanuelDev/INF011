package state;

public class AngryState implements State {

	  private final Mammoth mammoth;

	  public AngryState(Mammoth mammoth) {
	    this.mammoth = mammoth;
	  }

	  @Override
	  public void observe() {
		  System.out.printf("%s is furious!\n", mammoth);
	  }

	  @Override
	  public void onEnterState() {
		  System.out.printf("%s gets angry!\n", mammoth);
	  }

	}