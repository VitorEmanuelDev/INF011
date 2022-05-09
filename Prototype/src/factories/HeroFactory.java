package factories;
import character_types.Beast;
import character_types.Mage;
import character_types.Warlord;

public interface HeroFactory {
	Mage createMage();
	Warlord createWarlord();
	Beast createBeast();
}
