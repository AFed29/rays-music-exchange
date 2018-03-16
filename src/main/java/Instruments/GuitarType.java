package Instruments;

public enum GuitarType {
    BASS(4),
    ACOUSTIC(6),
    ELECTRIC(6);

    private int numberOfStrings;

    GuitarType(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
