package stringdemo;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入手机号");
        String phoneNumber = scan.next();
        String front = phoneNumber.substring(0,3);
        String back = phoneNumber.substring(7);
        String result = front + "****" + back;
        System.out.println(result);
    }
}
