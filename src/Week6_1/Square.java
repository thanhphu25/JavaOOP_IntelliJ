package Week6_1;

public class Square extends Expression {
    private Expression expression;

    /**
     * An especially short bit of Javadoc.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public double evaluate() {
        return Math.pow(expression.evaluate(), 2);
    }
}
