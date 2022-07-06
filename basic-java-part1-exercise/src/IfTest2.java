import java.util.Scanner;

public class IfTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = scan.nextInt();
        if (score >= 95 && score <= 100){
            System.out.println("奖励一台自行车");
        }else if (score >= 90 && score <= 94){
            System.out.println("游乐场玩一天");
        }else if (score >= 80 && score <= 89){
            System.out.println("变形金刚一个");
        }else if (score >= 0 && score <= 79){
            System.out.println("胖揍一顿");
        }else{
            System.out.println("输入的分数有误，请输入0-100的整数");
        }

    }

}
