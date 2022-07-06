package StringDemo;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额：");
            money = scan.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额错误");
            }
        }

        String moneyStr = "";
        while (true) {
            int ge = money % 10;
            moneyStr = capitalNumber(ge) + moneyStr;
            money /= 10;

            if (money == 0) {
                break;
            }
        }

        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        System.out.println(moneyStr);

        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";

        for (int i = 0; i < moneyStr.length(); i++) {
            result = result + moneyStr.charAt(i) + arr[i];
        }

        System.out.println(result);
    }

    public static String capitalNumber(int number) {
        switch (number) {
            case 1:
                return "壹";
            case 2:
                return "贰";
            case 3:
                return "叁";

            case 4:
                return "肆";
            case 5:
                return "伍";

            case 6:
                return "陆";

            case 7:
                return "柒";
            case 8:
                return "扒";
            case 9:
                return "玖";
            case 0:
                return "零";
            default:
                return "false";
        }
    }
}
