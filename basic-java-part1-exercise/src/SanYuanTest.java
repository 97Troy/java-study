import java.util.Scanner;


public class SanYuanTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        double weight1 = scan.nextDouble();
        System.out.println("请输入第二只老虎的体重：");
        double weight2 = scan.nextDouble();

        String result = weight1 == weight2? "相同":"不相同";
        System.out.println(result);


    }
}
