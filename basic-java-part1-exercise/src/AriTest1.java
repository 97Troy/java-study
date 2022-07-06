import java.util.Scanner;

public class AriTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = scan.nextInt();
        int ones = number % 10;
        int tens = number / 10 % 10;
        int hundreds = number / 100 % 10;


        System.out.println("百位：" + hundreds);
        System.out.println("十位：" + tens);
        System.out.println("个位：" + ones);

    }
}
