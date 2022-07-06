import java.util.Scanner;

public class ComprehensiveExercise7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = scan.nextInt();

        int count = 0;
        int temp = number;
        //获取number的位数
        while(temp != 0){
            temp /= 10;
            count++;
        }

        int[] arr = new int[count];
        int index = count - 1;
        //将Number从各位开始依次放入数组，从arr[index-1] → arr[0]
        while (index >= 0){
            arr[index] = number % 10;
            number /= 10;
            index--;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
