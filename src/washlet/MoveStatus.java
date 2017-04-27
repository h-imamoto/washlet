package washlet;

public enum MoveStatus {
    ON, OFF;

    public MoveStatus toggle() {
        return this.equals(ON) ? OFF : ON;
    }
}
