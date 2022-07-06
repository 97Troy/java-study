import java.util.Random;

public class ComprehensiveExercise9 {
    public static void main(String[] args) {
//        //方法1 打乱数组顺序后输出 当作抽奖结果
//        Random r = new Random();
//        int[] arr = {2,588,888,1000,10000};
//
//        for (int i = 0; i < arr.length; i++){
//            int index = r.nextInt(arr.length);
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i] + "元红包被抽出");
//        }

        //方法2
        int[] arr = {2,588,888,1000,10000};
        int[] newArr = new int[arr.length];
        Random r = new Random();

        for (int i = 0; i < arr.length;){
            int index = r.nextInt(arr.length);
            int prize = arr[index];
            boolean flag = contains(prize,newArr);
            if (!flag){
                newArr[i] = prize;
                i++;
            }

        }

        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i] + "元红包被送出");
        }

    }

    public static boolean contains(int prize, int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == prize){
                return true;
            }
        }
        return false;
    }

}
