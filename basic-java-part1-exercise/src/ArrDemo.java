public class ArrDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int number = arr[3];
        System.out.println(number);
        System.out.println(arr[3]);

        arr[3] = 10;
        System.out.println(arr[3]);

        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

        String[] s = new String[10];
        System.out.println(s[0]);

    }
}
