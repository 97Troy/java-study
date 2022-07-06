import java.util.Random;
import java.util.Scanner;

public class ComprehensiveExercise10 {
    public static void main(String[] args) {

        //生成中奖号码
        int[] arr = createNumber(6, 1);
        //打印中奖号码
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        //用户输入号码
        int[] inputArr = userInput(6, 1);

        //获取中奖信息
        getResult(inputArr, arr, 6, 1);

    }

    //生成中奖球
    public static int[] createNumber(int red, int blue) {
        Random r = new Random();
        int[] arr = new int[red + blue];
        //生成red个红球号码
        for (int i = 0; i < red; ) {
            int number = r.nextInt(33) + 1;
            if (!contains(number, arr)) {
                arr[i] = number;
                i++;
            }
        }
        //生成blue个蓝球号码
        for (int i = 0; i < blue; i++) {
            int number = r.nextInt(16) + 1;
            if (!contains(number, arr)) {
                arr[red + i] = number;
                i++;
            }
        }

        return arr;
    }

    //用户输入号码
    public static int[] userInput(int red, int blue) {
        int[] arrRed = new int[red];
        int[] arrBlue = new int[blue];
        int[] arr = new int[red + blue];
        Scanner scan = new Scanner(System.in);
        //输入红球
        for (int i = 0; i < red; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int number = scan.nextInt();
            if (number >= 1 && number <= 33) {
                if (!contains(number, arrRed)) {
                    arrRed[i] = number;
                    i++;
                } else {
                    System.out.println("当前输入的红球已存在，请重新输入");
                }
            } else {
                System.out.println("输入错误，请输入1-33的整数");
            }
        }
        //输入蓝球
        for (int i = 0; i < blue; ) {
            System.out.println("请输入第" + (i + 1) + "个蓝球号码");
            int number = scan.nextInt() ;
            if (number >= 1 && number <= 16) {
                if (!contains(number, arrBlue)) {
                    arrBlue[i] = number;
                    i++;
                } else {
                    System.out.println("当前输入的蓝球已存在，请重新输入");
                }
            } else {
                System.out.println("输入错误，请输入1-16的整数");
            }
        }
        for(int i = 0; i < arr.length; i++){
            if (i < red){
                arr[i] = arrRed[i];
            }else{
                arr[i] = arrBlue[i - red];
            }
        }
        return arr;
    }

    //获取中奖信息
    public static void getResult(int[] userInput, int[] arr, int red, int blue) {
        int redCount = 0;
        int blueCount = 0;
        //判断有几个红球中奖,几个篮球中奖
        for (int i = 0; i < userInput.length; i++) {
            if (i < red) {
                for (int n = 0; n < red; n++) {
                    if (userInput[i] == arr[n]) {
                        redCount++;
                        break;
                    }
                }
            } else {
                for (int n = red; n < arr.length; n++) {
                    if (userInput[i] == arr[n]) {
                        blueCount++;
                        break;
                    }
                }
            }
        }

        System.out.println("red,blue" + redCount + blueCount);

        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜你，中奖1000万");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜你，中奖500万");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖3000");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖200");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖10");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖5");
        } else {
            System.out.println("谢谢参与，谢谢惠顾");
        }

    }

    public static boolean contains(int number, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}




