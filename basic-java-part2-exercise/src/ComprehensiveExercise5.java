import java.util.Scanner;

public class ComprehensiveExercise5 {
    public static void main(String[] args) {
        double[] arr = getScore();
        double result = processingScore(arr);
        System.out.println(result);

    }
//获取评委评分
    public static double[]  getScore(){
        double[] arr = new double[6];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++){
            System.out.println("请输入第" + (i + 1) + "位评委的评分：");
            arr[i] = scan.nextDouble();
        }
        return arr;

    }
//求平均数
    public static double getAverage(double[] arr,int length){
        double sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / length;
    }
//处理评委评分
    public static double processingScore(double[] arr){
        double max = arr[0];
        double min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }else{
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == max){
                arr[i] = 0;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == min){
                arr[i] = 0;
                break;
            }
        }

        return getAverage(arr,arr.length-2);
    }
}
