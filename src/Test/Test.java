package Test;

public class Test {
    public static void main(String[] args) {
        MyClass.incrementCount();
        System.out.println(MyClass.getCount()); // Output: 1
        // Không thể truy cập trực tiếp Test.MyClass.count vì nó là private
        // System.out.println(Test.MyClass.count); // Lỗi biên dịch
    }
}
