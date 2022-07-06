import java.util.Scanner;


public class MethodDemo {
    public static void main(String[] args) {
        getMax();
    }

    public static void getMax(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个数");
        int num2 = scan.nextInt();

        System.out.println("最大的数是：" + (num1 > num2?num1 : num2));

    }

}
