package Week2;

import java.util.Scanner;

public class UocChungLonNhat {
    /**
     * Multiple lines of Javadoc text are written here,
     * wrapped normally...
     */
    public static int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Multiple lines of Javadoc text are written here,
     * wrapped normally...
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));

        sc.close();
    }
}
