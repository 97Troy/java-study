import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入今天是星期几？：");
        int day = scan.nextInt();
            switch (day){
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好爱吃一顿");
                    break;
                default:
                    System.out.println("输入有误，一周没有这一天");
            }
        }
    }

