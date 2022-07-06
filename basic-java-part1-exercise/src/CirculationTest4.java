import java.util.Scanner;


public class CirculationTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = scan.nextInt();
        int i = 2;
        while (i < number){
            if (number % i == 0 ){
                System.out.println(number + "是一个合数");
                break;
            }
            i++;
        }
        if (i == number){
            System.out.println(number + "是一个质数");
        }

        boolean flag = true;
        for (int n = 2;n < number;n++){
            if (number % n ==0){
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println(number + "是一个质数");
        }else {
            System.out.println(number + "是一个合数");
        }

    }
}
