import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入女婿的酒量（单位：斤）：");
        double wine =scan.nextDouble();
        if (wine > 2){
            System.out.println("老丈人给出反应");
        }
    }
}
