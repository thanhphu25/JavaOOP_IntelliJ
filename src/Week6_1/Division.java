package Week6_1;

public class Division extends BinaryExpression {
    /**
     * An especially short bit of Javadoc.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public double evaluate() {
        double rightVal = right.evaluate();

        if (rightVal == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }

        return left.evaluate() / rightVal;
    }
}
