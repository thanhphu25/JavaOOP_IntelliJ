package Week6_1;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * An especially short bit of Javadoc.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " " + right.toString() + ")";
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
