package Week3;

public class PhanSo {

  /**
   * An especially short bit of Javadoc.
   */
  private int numerator;
  private int denominator;

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  /**
   * An especially short bit of Javadoc.
   */
  public void setDenominator(int denominator) {
    if (denominator != 0) {
      this.denominator = denominator;
    }
  }

  PhanSo(int numerator, int denominator) {
    if (denominator != 0) {
      this.numerator = numerator;
      this.denominator = denominator;
    } else {
      this.denominator = 1;
    }
  }

  PhanSo() {
    denominator = 1;
  }

  /**
   * An especially short bit of Javadoc.
   */
  public PhanSo reduce() {
    int gcd = numerator;
    int b = denominator;
    while (b != 0) {
      int temp = b;
      b = gcd % b;
      gcd = temp;
    }
    numerator = numerator / gcd;
    denominator = denominator / gcd;
    return this;
  }

  /**
   * An especially short bit of Javadoc.
   */
  public PhanSo add(PhanSo other) {
    numerator = numerator * other.getDenominator() + denominator * other.getNumerator();
    denominator = denominator * other.getDenominator();
    return this.reduce();
  }

  /**
   * An especially short bit of Javadoc.
   */
  public PhanSo subtract(PhanSo other) {
    numerator = numerator * other.getDenominator() - denominator * other.getNumerator();
    denominator = denominator * other.getDenominator();
    return this.reduce();
  }

  /**
   * An especially short bit of Javadoc.
   */
  public PhanSo multiply(PhanSo other) {
    numerator = numerator * other.getNumerator();
    denominator = denominator * other.getDenominator();
    return this.reduce();
  }

  /**
   * An especially short bit of Javadoc.
   */
  public PhanSo divide(PhanSo other) {
    if (denominator == 0) {
      return this;
    }
    numerator = numerator * other.getDenominator();
    denominator = denominator * other.getNumerator();
    return this.reduce();
  }

  /**
   * An especially short bit of Javadoc.
   */
  public boolean equals(Object obj) {
    if (obj instanceof PhanSo) {
      PhanSo other = (PhanSo) obj;
      return numerator * other.getDenominator() == denominator * other.getNumerator();
    }
    return false;
  }

}