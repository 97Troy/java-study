public class MethodTest1 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7};
        printArr(arr);

    }

    public static void printArr(int[] arr){
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
