import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个圆的半径：");
        int r1 = scan.nextInt();
        System.out.println("请输入第二个圆的半径：");
        int r2 = scan.nextInt();
        double max = getMaxArea(r1,r2);
        System.out.println("更大的圆的面积是" + max);


    }

    public static double getMaxArea(int r1, int r2){
        if (r1 > r2){
            return r1 * r1 * 3.14;
        }else{
            return r2 * r2 * 3.14;
        }

    }





}
