import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入小明的名次：");
        int rank = scan.nextInt();
        if(rank == 1){
            System.out.println("小红是小明的女朋友");
        }
    }
}
