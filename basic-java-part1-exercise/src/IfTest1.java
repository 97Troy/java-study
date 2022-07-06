import  java.util.Scanner;

public class IfTest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个电影票座位号：");
        int ticket = scan.nextInt();
        if(ticket >= 1 && ticket <= 100) {
            if (ticket % 2 == 1) {
                System.out.println("坐在左边");
            } else {
                System.out.println("坐在右边");
            }
        }else{
            System.out.println("您输入的票号不合法，请输入1-100的整数");
        }
    }
}
