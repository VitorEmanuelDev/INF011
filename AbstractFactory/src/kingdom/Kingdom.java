package kingdom;

import interfaces.Army;
import interfaces.Castle;
import interfaces.King;

public class Kingdom {

	private King king;
	private Castle castle;
	private Army army;


	public King getKing() {
		return king;
	}

	public void setKing(King king) {
		this.king = king;
	}

	public Castle getCastle() {
		return castle;
	}

	public void setCastle(Castle castle) {
		this.castle = castle;
	}

	public Army getArmy() {
		return army;
	}

	public void setArmy(Army army) {
		this.army = army;
	}
}
