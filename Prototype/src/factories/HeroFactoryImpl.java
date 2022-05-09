package factories;
import character_types.Beast;
import character_types.Mage;
import character_types.Warlord;

public class HeroFactoryImpl implements HeroFactory {

  private final Mage mage;
  private final Warlord warlord;
  private final Beast beast;
  

  public HeroFactoryImpl(Mage mage, Warlord warlord, Beast beast) {
	super();
	this.mage = mage;
	this.warlord = warlord;
	this.beast = beast;
}

public Mage createMage() {
    return mage.copy();
  }

  public Warlord createWarlord() {
    return warlord.copy();
  }

  public Beast createBeast() {
    return beast.copy();
  }
}