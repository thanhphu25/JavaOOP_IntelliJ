package Week5;

public class Person {
    /**
     * An especially short bit of Javadoc.
     */
    private String name;
    private String address;

    /**
     * An especially short bit of Javadoc.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getName() {
        return name;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public String getAddress() {
        return address;
    }

    /**
     * An especially short bit of Javadoc.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * An especially short bit of Javadoc.
     */
    @Override
    public String toString() {
        return "Person[" + "name='" + name + ", address='" + address + "]";
    }
}
