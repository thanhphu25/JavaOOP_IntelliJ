package Week6_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Week8Task2 {
    public void nullPointerEx() {
        String str = null;
        str.length(); // gay ra NullPointerException
    }

    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "NullPointerException xảy ra";
        }
        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() {
        int[] a = new int[6];
        int val = a[10]; // gay ra ArrayIndexOutOfBoundsException
    }

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "ArrayIndexOutOfBoundsException xảy ra";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() {
        int res = 5 / 0; // chia cho 0
    }

    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "ArithmeticException xảy ra";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        File f = new File("no_no.txt");
        Scanner sc = new Scanner(f); //gay ra khong tim thay file
    }

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "FileNotFoundException xảy ra";
        }
        return "Không có lỗi";
    }

    public void ioEx() throws IOException {
        throw new IOException("Lỗi IO");
    }

    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "IOException xảy ra";
        }
        return "Không có lỗi";
    }

    public static void main(String[] args) {
        Week8Task2 task = new Week8Task2();

        System.out.println(task.nullPointerExTest());
        System.out.println(task.arrayIndexOutOfBoundsExTest());
        System.out.println(task.arithmeticExTest());
        System.out.println(task.fileNotFoundExTest());
        System.out.println(task.ioExTest());
    }
}
