

public class ComprehensiveExercise8 {
    public static void main(String[] args) {
        int[] arr = {8,3,4,6};

        //解密反转
        for (int i = 0, j = arr.length-1; i < j; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        //解密%10
        for (int i = 0; i < arr.length; i++){
            if (arr[i] >=0 && arr[i] <= 4){
                arr[i] += 10;
            }
        }

        //解密+5
        for (int i = 0; i < arr.length; i++){
            arr[i] -= 5;
        }

        //输出
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }



}
