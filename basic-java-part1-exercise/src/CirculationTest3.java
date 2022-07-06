import java.util.Scanner;

public class CirculationTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数：");
        int number = scan.nextInt();
        for (int i = 1; i <= number; i++){
            if (i * i == number){
                System.out.println(number + "的算数平方根为" + i);
                break;
            }else if (i * i > number){
                System.out.println(number + "的算数平方根为" + (i-1));
                break;
            }
        }
    }
}
