package factories;

import elves.ElfArmy;
import elves.ElfCastle;
import elves.ElfKing;
import interfaces.Army;
import interfaces.Castle;
import interfaces.King;

public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}

	@Override
	public King createKing() {
		return new ElfKing();
	}

	@Override
	public Army createArmy() {
		return new ElfArmy();
	}

}
