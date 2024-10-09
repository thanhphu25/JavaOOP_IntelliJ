package Week6_1;

public class ExpressionTest {
    /**
     * An especially short bit of Javadoc.
     */
    public static void main(String[] args) {
        try {
            Expression e1 = new Numeral(10);
            Expression e2 = new Numeral(2);
            Expression e3 = new Numeral(3);
            Expression e4 = new Numeral(4);
            Expression e5 = new Numeral(3);

            /// (10 ^ 2) + -3
            Expression add1 = new Addition(new Square(e1), e3);
            /// 4*3
            Expression mul1 = new Multiplication(e4, e5);
            /// add1 + mul1
            Expression add2 = new Addition(add1, mul1);
            /// (add2) ^ 2
            Expression result = new Square(add2);

            System.out.println("Expression: " + result.toString());
            System.out.println("Result: " + result.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
