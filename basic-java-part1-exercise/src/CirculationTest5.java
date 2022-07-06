import java.util.Scanner;
import java.util.Random;

public class CirculationTest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        int number = r.nextInt(101);//生成随机数
        System.out.println("请输入你猜测的数字:");
        int guess = scan.nextInt();
        System.out.println(number);//right number
        while (guess != number) {
            System.out.println("抱歉，猜测错误，请重新输入：");
            guess = scan.nextInt();
        }
        System.out.println("恭喜你，猜测正确，随机数字是：" + guess);

    }


}
