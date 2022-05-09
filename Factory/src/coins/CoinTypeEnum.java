package coins;

public enum CoinTypeEnum {

    COPPER {
        @Override
        public CopperCoin getConstructor() {
             return new CopperCoin();
        }

    },
    GOLD {
        @Override
        public GoldCoin getConstructor() {
            return new GoldCoin();
        }

    };

    public abstract Coin getConstructor();
}