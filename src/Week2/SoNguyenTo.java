package Week2;

import java.lang.Math;

/**
 * Multiple lines of Javadoc text are written here,
 * wrapped normally...
 */
public class SoNguyenTo {
    /**
     * Multiple lines of Javadoc text are written here,
     * wrapped normally...
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}