package StringDemo;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符：");
        String str = scan.next();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z'){
                smallCount++;
            }else if (c >='A' && c <= 'Z'){
                bigCount++;

            }else if (c >= '0' && c <='9'){
                numberCount++;
            }
        }

        System.out.println(bigCount);
        System.out.println(smallCount);
        System.out.println(numberCount);
    }

}
