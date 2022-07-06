public class ComprehensiveExercise2 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[100];
        for (int i = 0, j = 101; i < 100; i++, j++){
            arr[i] = j;
        }

        for (int i = 0; i< arr.length-1; i++){
            if (isPrimeNumber(arr[i])){
                System.out.print(arr[i] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("一共有" + count + "个素数，如上所示");
    }

    public static boolean isPrimeNumber(int number){
        boolean flag = true;
        for (int i = 2;i < number;i++){
            if (number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
