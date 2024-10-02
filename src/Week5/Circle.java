package Week5;

public class Circle {
    /**
     * An especially short bit of Javadoc.
     */
    private double radius;
    private String color;

    protected static final double PI = Math.PI;

    /**
     * An especially short bit of Javadoc.
     */
    public Circle() {

    }

    /**
     * An especially short bit of Javadoc.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getColor() {
        return color;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String
    toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
