package pgdp.adventuin;

public enum HatType {

    // Declare all hat types
    SANTA_CLAUS(0), REINDEER(1), FISHY_HAT(2), NO_HAT(3);
    // Index for the hats
    final int index;
    // Constructor for applying indexes
    HatType(int index) {
        this.index = index;
    }
}
