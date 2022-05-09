
public class Client {
	
	public static void main(String[] args) {

		// eagerly initialized singleton
		var ivoryTower1 = IvoryTower.getInstance();
		var ivoryTower2 = IvoryTower.getInstance();
		System.out.printf("ivoryTower1={}\n", ivoryTower1);
		System.out.printf("ivoryTower2={}\n", ivoryTower2);

		// lazily initialized singleton
		var threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower.getInstance();
		var threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower.getInstance();
		System.out.printf("threadSafeIvoryTower1={}\n", threadSafeIvoryTower1);
		System.out.printf("threadSafeIvoryTower2={}\n", threadSafeIvoryTower2);

		// enum singleton
		var enumIvoryTower1 = IvoryTowerEnum.INSTANCE;
		var enumIvoryTower2 = IvoryTowerEnum.INSTANCE;
		System.out.printf("enumIvoryTower1={}\n", enumIvoryTower1);
		System.out.printf("enumIvoryTower2={}\n", enumIvoryTower2);

		// double checked locking
		var dcl1 = ThreadSafeDoubleCheckLocking.getInstance();
		System.out.println(dcl1.toString());
		var dcl2 = ThreadSafeDoubleCheckLocking.getInstance();
		System.out.println(dcl2.toString());

		// initialize on demand holder idiom
		var demandHolderIdiom = InitializingOnDemandHolderIdiom.getInstance();
		System.out.println(demandHolderIdiom.toString());
		var demandHolderIdiom2 = InitializingOnDemandHolderIdiom.getInstance();
		System.out.println(demandHolderIdiom2.toString());
	}
}
