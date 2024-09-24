package Test;

public class MyClass {
    private static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count; // Trả về giá trị count, nhưng bên ngoài không thể trực tiếp truy cập count
    }
}

