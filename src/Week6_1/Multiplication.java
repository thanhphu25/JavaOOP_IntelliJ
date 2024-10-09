package Week6_1;

public class Multiplication extends BinaryExpression {
    /**
     * An especially short bit of Javadoc.
     */
    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
