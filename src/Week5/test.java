package Week5;

public class test {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person);

        // Tạo đối tượng Staff
        Staff staff = new Staff("Jane Smith", "456 Oak St", "ABC School", 50000);
        System.out.println(staff);

        // Tạo đối tượng Student
        Student student = new Student("Tom Johnson", "789 Pine St", "Computer Science", 2, 15000);
        System.out.println(student);

        // Sử dụng setter để thay đổi thông tin và in ra lần nữa
        staff.setPay(55000);
        student.setYear(3);
        System.out.println("Updated Staff: " + staff);
        System.out.println("Updated Student: " + student);
    }
}
