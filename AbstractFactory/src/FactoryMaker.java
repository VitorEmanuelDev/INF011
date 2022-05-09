import factories.ElfKingdomFactory;
import factories.KingdomFactory;
import factories.OrcKingdomFactory;
import kingdom.KingdomTypeEnum;

public class FactoryMaker {

  public static KingdomFactory makeFactory(KingdomTypeEnum type) {
    switch (type) {
      case ELF:
        return new ElfKingdomFactory();
      case ORC:
        return new OrcKingdomFactory();
      default:
        throw new IllegalArgumentException("KingdomType not supported.");
    }
  }
}