package Week5;

public class Staff extends Person {
    /**
     * An especially short bit of Javadoc.
     */
    private String school;
    private double pay;

    /**
     * An especially short bit of Javadoc.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getSchool() {
        return school;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double getPay() {
        return pay;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", " + "school='" + school + ", pay=" + pay + "]";
    }
}
