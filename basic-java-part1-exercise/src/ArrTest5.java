import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        double avg = 0;
        int count = 0;

        int[] arr = new int[10];
        for (int i = 0;i < arr.length;i++){
            arr[i] = r.nextInt(100)+1;
        }

        for (int i = 0;i < arr.length; i++){
            sum += arr[i];
        }

        avg = (double)sum / 10;

        for(int i = 0;i < arr.length; i++){
            if (arr[i] < avg){
                count++;
            }
        }

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(count);

        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
}
