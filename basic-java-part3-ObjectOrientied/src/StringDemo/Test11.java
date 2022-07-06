package StringDemo;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身份证号码");
        String idCard = scan.next();

        String year = idCard.substring(6,10);
        String month = idCard.substring(10,12);
        String day = idCard.substring(12,14);

        System.out.println("出生日期为:" + year + "年" + month + "月" + day + "日");

        char gender = idCard.charAt(16);
        int num = gender - 48;
        if (num % 2 == 0){
            System.out.println("女");
        }else {
            System.out.println("男");
        }
    }
}
