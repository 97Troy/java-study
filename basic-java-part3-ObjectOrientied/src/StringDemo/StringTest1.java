package StringDemo;

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scan.next();


        String reverse = new StringBuilder().append(str).reverse().toString();
        if (str.equals(reverse)){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }
    }
}
