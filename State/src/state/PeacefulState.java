package state;

public class PeacefulState implements State {

	  private final Mammoth mammoth;

	  public PeacefulState(Mammoth mammoth) {
	    this.mammoth = mammoth;
	  }

	  @Override
	  public void observe() {
	   System.out.printf("%s is calm and peaceful.\n", mammoth);
	  }

	  @Override
	  public void onEnterState() {
		  System.out.printf("%s calms down.\n", mammoth);
	  }

	}