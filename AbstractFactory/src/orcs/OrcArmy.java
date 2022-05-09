package orcs;
import interfaces.Army;

public class OrcArmy implements Army {
  static final String DESCRIPTION = "This is the orcs Army!";
  @Override
  public String getDescription() {
    return DESCRIPTION;
  }
}