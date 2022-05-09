import coins.CoinFactory;
import coins.CoinTypeEnum;
import coins.CopperCoin;
import coins.GoldCoin;

public class Client {
    public static void main(String[] args) {
        CopperCoin coin1 = (CopperCoin) CoinFactory.getCoin(CoinTypeEnum.COPPER);
        GoldCoin coin2 = (GoldCoin) CoinFactory.getCoin(CoinTypeEnum.GOLD);

        System.out.println(coin1.getDescription());
        System.out.println(coin2.getDescription());

    }

}