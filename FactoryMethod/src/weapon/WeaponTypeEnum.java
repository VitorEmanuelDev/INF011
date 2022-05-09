package weapon;


public enum WeaponTypeEnum {

    SHORT_SWORD("short sword"),
    SPEAR("spear"),
    AXE("axe"),
    UNDEFINED("");

    private final String title;

    WeaponTypeEnum(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

}
