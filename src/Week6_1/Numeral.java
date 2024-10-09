package Week6_1;

public class Numeral extends Expression {
    private double value;

    /**
     * An especially short bit of Javadoc.
     */
    public Numeral() {

    }

    /**
     * An especially short bit of Javadoc.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "(" + value + ")";
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public double evaluate() {
        return value;
    }
}
