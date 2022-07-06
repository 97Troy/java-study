package ObjectExercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        System.out.println(a);
//        System.out.println(b);
        String c = scan.nextLine();
        int i = Integer.parseInt(c);
        System.out.println(i+3);
    }
}
