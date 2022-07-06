package StringDemo;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = scan.next();
        System.out.println(string);

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            System.out.println(c);
        }
    }


}
