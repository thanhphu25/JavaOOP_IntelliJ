package Week5;

public class Cylinder extends Circle {
    /**
     * An especially short bit of Javadoc.
     */
    public double height;

    /**
     * An especially short bit of Javadoc.
     */
    public Cylinder() {
        super();
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Cylinder(double height) {
        this.height = height;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double getHeight() {
        return height;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double getVolume() {
        return PI * Math.pow(getRadius(), 2) * height;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public double getArea() {
        double baseArea = super.getArea();

        double lateralArea = 2 * PI * getRadius() * height;

        return 2 * baseArea + lateralArea;
    }
}
