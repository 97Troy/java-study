import java.util.Scanner;

public class ForTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = scan.nextInt();
        int num3 = 0;
        int num5 = 0;
        if (num1 > num2){
            for (int i = num2;i <= num1;i++){
                if (i % 3 == 0){
                    num3++;
                    if (i % 5 == 0){
                        num5++;
                    }
                }else if (i % 5 == 0){
                    num5++;
                }

            }
        }else if (num1 < num2){
            for (int i = num1;i <= num2;i++){
                if (i % 3 == 0){
                    num3++;
                    if (i % 5 == 0){
                        num5++;
                    }
                }else if (i % 5 == 0){
                    num5++;
                }
            }
        }else{
            if (num1 % 3 ==0){
                num3++;
            }else if (num1 % 5 ==0){
                num5++;
            }
        }

        System.out.println("能被3整除的数据有" + num3 + "次");
        System.out.println("能被5整除的数据有" + num5 + "次");

    }

}
