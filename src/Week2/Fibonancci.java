package Week2;

import java.util.Scanner;

public class Fibonancci {

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public static long fibonacci(long n) {
    if (n < 0) {
      return -1;
    }

    if (n == 0) {
      return 0;
    }

    if (n == 1) {
      return 1;
    }

    long a = 0;
    long b = 1;
    long fib = 1;
    for (long i = 2; i <= n; i++) {
      fib = a + b;
      if (fib < a) {
        return Long.MAX_VALUE;
      }
      a = b;
      b = fib;
    }
    return fib;
  }

  /**
   * Multiple lines of Javadoc text are written here, wrapped normally...
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    System.out.println(fibonacci(n));

    sc.close();
  }
}
