package coins;

public class CoinFactory {

    public static Object getCoin(CoinTypeEnum type) {
        return type.getConstructor();
    }
}