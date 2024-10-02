package Week5;

public class Student extends Person {
    /**
     * An especially short bit of Javadoc.
     */
    private String program;
    private int year;
    private double fee;

    /**
     * An especially short bit of Javadoc.
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getProgram() {
        return program;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public int getYear() {
        return year;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public double getFee() {
        return fee;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() + ", " + "program='" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}
