package Enums;

public enum HappinessLevels {
    DEFAULT(7),
    LOW(3),
    HIGH(10);
    private final int happinessLevel;

    HappinessLevels(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }
}
