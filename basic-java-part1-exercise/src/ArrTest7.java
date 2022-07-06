import com.sun.java.swing.plaf.windows.WindowsTabbedPaneUI;

import java.util.Random;

public class ArrTest7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {1,2,3,4,5};

        for (int i = 0; i<arr.length;i++){
            int randowIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randowIndex];
            arr[randowIndex] = temp;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }


}
