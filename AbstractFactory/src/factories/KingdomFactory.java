package factories;

import interfaces.Army;
import interfaces.Castle;
import interfaces.King;

public interface KingdomFactory {
	Castle createCastle();
	King createKing();
	Army createArmy();
}