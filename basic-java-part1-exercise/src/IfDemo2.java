import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入身上的钱：");
        double money = scan.nextDouble();
        if (money > 100){
            System.out.println("吃网红餐厅");
        }else {
            System.out.println("吃沙县小吃");
        }
    }


}
