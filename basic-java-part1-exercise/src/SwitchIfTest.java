import java.util.Scanner;

public class SwitchIfTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入今天星期几：");
        int week = scan.nextInt();
        switch (week){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("今天是工作日");
                break;
            case 6:
            case 7:
                System.out.println("今天是休息日");
                break;
            default:
                System.out.println("输入错误，没有这个日期");
        }



    }
}
