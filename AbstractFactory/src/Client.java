import factories.KingdomFactory;
import kingdom.Kingdom;
import kingdom.KingdomTypeEnum;

public class Client {

	private final Kingdom kingdom = new Kingdom();

	public Kingdom getKingdom() {
		return kingdom;
	}


	public static void main(String[] args) {
		var client = new Client();
		client.run();
	}

	public void run() {
		System.out.println("elf kingdom");
		createKingdom(KingdomTypeEnum.ELF);
		System.out.println(kingdom.getArmy().getDescription());
		System.out.println(kingdom.getCastle().getDescription());
		System.out.println(kingdom.getKing().getDescription());

		System.out.println("orc kingdom");
		createKingdom(KingdomTypeEnum.ORC);
		System.out.println(kingdom.getArmy().getDescription());
		System.out.println(kingdom.getCastle().getDescription());
		System.out.println(kingdom.getKing().getDescription());
	}

	public void createKingdom(KingdomTypeEnum kingdomType) {
		final KingdomFactory kingdomFactory = FactoryMaker.makeFactory(kingdomType);
		kingdom.setKing(kingdomFactory.createKing());
		kingdom.setCastle(kingdomFactory.createCastle());
		kingdom.setArmy(kingdomFactory.createArmy());
	}

}
