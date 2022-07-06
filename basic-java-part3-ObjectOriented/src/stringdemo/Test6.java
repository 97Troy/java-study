package stringdemo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int length = str.length();
        String newStr = "";
        for (int i = length - 1; i >= 0 ; i--) {
            newStr += str.charAt(i);
        }

        System.out.println(newStr);
    }
}
